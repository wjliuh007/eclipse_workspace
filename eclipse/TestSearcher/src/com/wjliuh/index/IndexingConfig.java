package com.wjliuh.index;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.swing.filechooser.FileSystemView;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MultiTermQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.MultiTermQuery.RewriteMethod;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.wjliuh.config.Config;
import com.wjliuh.enums.Msg;
import com.wjliuh.parser.Path;
import com.wjliuh.result.SearchResult;
import com.wjliuh.utils.annotations.NotNull;
import com.wjliuh.utils.annotations.Nullable;
import com.wjliuh.utls.Util;

import de.schlichtherle.truezip.file.TArchiveDetector;
import de.schlichtherle.truezip.fs.FsDriver;
import de.schlichtherle.truezip.fs.FsDriverProvider;
import de.schlichtherle.truezip.fs.FsScheme;
import de.schlichtherle.truezip.fs.sl.FsDriverLocator;

public class IndexingConfig implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static final List<String> defaultZipExtensions = Arrays.asList("zip", "jar");
	private static final List<String> defaultTextExtensions = Arrays.asList("txt", "java", "cpp", "py");
	private static final List<PatternAction> defaultPatternActions = Arrays.asList(
		new PatternAction(".*\\.class"),
		new PatternAction(".*\\.pyc"));
	
	/**
	 * Don't forget the {@link #skipTarArchives} field when accessing this list!
	 */
	public static final List<String> tarExtensions = Arrays.asList(
		"tar", "tar.gz", "tgz", "tar.bz2", "tb2", "tbz");
	
	private static final Pattern dotSlashPattern = Pattern.compile("\\.\\.?[/\\\\].*");
	
	@Nullable private File tempDir;
	
	@NotNull private List<String> zipExtensions = defaultZipExtensions;
	@NotNull private List<String> textExtensions = defaultTextExtensions;
	@NotNull private List<PatternAction> patternActions = defaultPatternActions;
	
	private boolean htmlPairing = true;
	private boolean detectExecutableArchives = false;
	private boolean indexFilenames = true;
	private boolean storeRelativePaths = false;
	private boolean watchFolders = true;
	private boolean skipTarArchives = false;
	
	public final boolean isDetectExecutableArchives() {
		return detectExecutableArchives;
	}

	public final void setDetectExecutableArchives(boolean detectExecutableArchives) {
		this.detectExecutableArchives = detectExecutableArchives;
	}
	
	public final boolean isIndexFilenames() {
		return indexFilenames;
	}

	public final void setIndexFilenames(boolean indexFilenames) {
		this.indexFilenames = indexFilenames;
	}

	@NotNull
	public final File getTempDir() {
		if (tempDir != null && tempDir.isDirectory() && tempDir.canWrite())
			return tempDir;
		return Util.TEMP_DIR;
	}

	/**
	 * Sets the temporary directory to be used during indexing. The directory
	 * specified by the given path will only be used if it represents an
	 * existing, writable directory.
	 */
	public final void setTempDir(@Nullable File tempDir) {
		this.tempDir = tempDir;
	}

	public final boolean isStoreRelativePaths() {
		return storeRelativePaths;
	}

	public final void setStoreRelativePaths(boolean storeRelativePaths) {
		if (this.storeRelativePaths == storeRelativePaths)
			return;
		this.storeRelativePaths = storeRelativePaths;
		onStoreRelativePathsChanged();
	}
	
	protected void onStoreRelativePathsChanged() {}

	/**
	 * For the given file, a path is returned that can be stored without
	 * breaking program portability. More specifically, this method returns
	 * either an absolute path or a path relative to the current directory,
	 * depending on the value of {@link #isStoreRelativePaths()}.
	 * <p>
	 * On Windows, there is one exception: If the file and the current directory
	 * reside on different drives (e.g. "C:\" and "D:\"), this method returns an
	 * absolute path.
	 * <p>
	 * The separators are always forward slashes (i.e., "/"). This does not
	 * affect portability since forward slashes are valid path separators on
	 * both Windows and Linux.
	 */
	@NotNull
	public final Path getStorablePath(@NotNull File file) {
		return getStorablePath(file, storeRelativePaths);
	}
	
	@NotNull
	public static Path getStorablePath(	@NotNull File file,
										boolean storeRelativePaths) {
		// Path should not start with any of these:
		// ./   ../   .\   ..\
		Util.checkNotNull(file);
		Util.checkThat(!dotSlashPattern.matcher(file.getPath()).matches());
		
		if (storeRelativePaths)
			return new Path(getRelativePathIfPossible(file));
		else
			return new Path(Util.getAbsPath(file));
	}
	
	@NotNull
	public static String getRelativePathIfPossible(@NotNull File file) {
		if (Util.isUncPath(file))
			return file.getPath();
		String absPath = Util.getAbsPath(file);
		assert Util.USER_DIR.isAbsolute();
		if (absPath.equals(Util.USER_DIR_PATH))
			return "";
		if (Util.IS_WINDOWS) {
			String d1 = Util.getDriveLetter(Util.USER_DIR_PATH);
			String d2 = Util.getDriveLetter(absPath);
			if (!d1.equals(d2))
				return absPath;
		}
		return getRelativePath(Util.USER_DIR_PATH, absPath);
	}
	
	/**
	 * Returns a relative path that allows navigation from the absolute source
	 * path {@code srcPath} to the absolute destination path {@code dstPath}.
	 * Example outputs:
	 * 
	 * <pre>
	 * ../..
	 * ../../path/to/adjacent/file
	 * path/to/subfolder
	 * </pre>
	 * 
	 * The returned paths always use "/" as path separator, and there are no
	 * leading or trailing path separators.
	 */
	@NotNull
	public static String getRelativePath(	@NotNull String srcPath,
											@NotNull String dstPath) {
		Iterator<String> srcIt = Util.splitPath(srcPath).iterator();
		Iterator<String> dstIt = Util.splitPath(dstPath).iterator();
		List<String> srcOverhang = new ArrayList<String>();
		List<String> dstOverhang = new ArrayList<String>();
		List<String> dstList = new ArrayList<String>();
		boolean stillEqual = true;
		while (true) {
			String srcPart = null;
			String dstPart = null;
			if (srcIt.hasNext())
				srcPart = srcIt.next();
			if (dstIt.hasNext()) {
				dstPart = dstIt.next();
				dstList.add(dstPart);
			}
			if (srcPart == null && dstPart == null)
				break;
			if (stillEqual && !Objects.equal(srcPart, dstPart))
				stillEqual = false;
			if (stillEqual)
				continue;
			if (srcPart != null)
				srcOverhang.add("..");
			if (dstPart != null)
				dstOverhang.add(dstPart);
		}
		String path = null;
		if (srcOverhang.isEmpty()) {
			if (dstOverhang.isEmpty())
				path = Util.joinPath(dstList);
			else
				path = Util.joinPath(dstOverhang);
		} else if (dstOverhang.isEmpty())
			path = Util.joinPath(srcOverhang);
		else
			path = Util.joinPath(srcOverhang) + "/"
					+ Util.joinPath(dstOverhang);
		return path;
	}
	
	@NotNull
	public final File createDerivedTempFile(@NotNull String filename)
			throws Exception {
		try {
			return Util.createDerivedTempFile(filename, getTempDir());
		}
		catch (IOException e) {
			throw new Exception(e);
		}
	}
	
	// Fail if not enough disk space for extraction
	public final void checkDiskSpaceInTempDir(long requiredSpace)
			throws Exception {
		File customTempDir = getTempDir();
		long usableSpace = customTempDir.getUsableSpace();
		if (requiredSpace > usableSpace) {
			String msg = Msg.not_enough_diskspace.format(
					Util.getSystemAbsPath(customTempDir),
					toMegabyteString(usableSpace),
					toMegabyteString(requiredSpace)
			);
			throw new Exception(msg);
		}
	}

	private static String toMegabyteString(Long bytes) {
		double megabytes = (double) bytes / (1024 * 1024);
		return String.format("%.1f", megabytes);
	}
	
	@NotNull
	public final Collection<String> getHtmlExtensions() {
		return StrList.HtmlExtensions.get();
	}
	
	public static enum StrList {
		HtmlExtensions ("html", "htm", "xhtml", "shtml", "shtm", "php", "asp", "jsp")
		;

		private List<String> value;
		StrList(String... value) {
			this.value = Arrays.asList(value);
		}
		public List<String> get() {
			return Collections.unmodifiableList(value);
		}
		public void load(String str) {
			value = Util.decodeStrings(';', str);
		}
	}
	
	public final boolean isHtmlPairing() {
		return htmlPairing;
	}

	public final void setHtmlPairing(boolean htmlPairing) {
		this.htmlPairing = htmlPairing;
	}
	
	@NotNull
	public final List<String> getTextExtensions() {
		return textExtensions;
	}
	
	public final void setTextExtensions(@NotNull Collection<String> textExtensions) {
		this.textExtensions = immutableUniqueLowerCase(textExtensions);
	}
	
	// Returned collection does not contain 'exe'
	@NotNull
	public final List<String> getZipExtensions() {
		return zipExtensions;
	}

	public final void setZipExtensions(@NotNull Collection<String> zipExtensions) {
		this.zipExtensions = immutableUniqueLowerCase(zipExtensions);
	}
	
	@NotNull
	private List<String> immutableUniqueLowerCase(@NotNull Collection<String> strings) {
		Util.checkNotNull(strings);
		Set<String> set = Sets.newLinkedHashSet();
		for (String string : strings)
			set.add(string.toLowerCase());
		return ImmutableList.copyOf(set);
	}

	@NotNull
	public final List<PatternAction> getPatternActions() {
		return patternActions;
	}

	public final void setPatternActions(@NotNull List<PatternAction> patternActions) {
		this.patternActions = Collections.unmodifiableList(patternActions);
	}

	// Returned detector takes 'detect executable archives' setting into account
	@NotNull
	public final TArchiveDetector createZipDetector() {
		/*
		 * Create an extended copy of the default driver map where all
		 * user-defined extensions not known to TrueZIP are associated with the
		 * zip driver.
		 */
		final Map<FsScheme, FsDriver> driverMap = Maps.newHashMap(FsDriverLocator.SINGLETON.get());
		FsDriver zipDriver = driverMap.get(FsScheme.create("zip"));
		for (String ext : zipExtensions) {
			FsScheme scheme = FsScheme.create(ext);
			if (!driverMap.containsKey(scheme))
				driverMap.put(scheme, zipDriver);
		}
		
		FsDriverProvider driverProvider = new FsDriverProvider() {
			public Map<FsScheme, FsDriver> get() {
				return Collections.unmodifiableMap(driverMap);
			}
		};
		
		Set<String> extensions = new LinkedHashSet<String>();
		extensions.addAll(zipExtensions);
		if (!skipTarArchives)
			extensions.addAll(tarExtensions);
		if (detectExecutableArchives)
			extensions.add("exe");
		return new TArchiveDetector(driverProvider, Util.join("|", extensions));
	}

	// Accepts filenames and filepaths
	// Takes 'detect executable archives' setting into account
	public final boolean isArchive(@NotNull String filename) {
		String ext = Util.getExtension(filename);
		if (detectExecutableArchives && ext.equals("exe"))
			return true;
		if (ext.equals("7z") || ext.equals("rar"))
			return true;
		if (!skipTarArchives && tarExtensions.contains(ext))
			return true;
		return zipExtensions.contains(ext);
	}
	
	// Accepts filenames and filepaths
	// Takes 'detect executable archives' setting into account
//	@Nullable
//	public final SolidArchiveFactory getSolidArchiveFactory(@NotNull String filename) {
//		/*
//		 * JUnRar does not seem to support SFX RAR archives, but TrueZIP and
//		 * J7Zip do support SFX Zip and SFX 7z archives, respectively.
//		 */
//		String ext = Util.getExtension(filename);
//		if (detectExecutableArchives && ext.equals("exe"))
//			return SolidArchiveFactory.SevenZip;
//		if (ext.equals("7z"))
//			return SolidArchiveFactory.SevenZip;
//		if (ext.equals("rar"))
//			return SolidArchiveFactory.Rar;
//		return null;
//	}
	
	// Accepts filenames and filepaths
	public final boolean isSolidArchive(@NotNull String filename) {
		String type = filename.substring(filename.lastIndexOf("."));
		if(type.indexOf("exe")>0 || type.indexOf("rar")>0 ||type.indexOf("7z")>0){
			return true;
		}
		return false;
	}
	
	public final boolean isWatchFolders() {
		return watchFolders;
	}
	
	public final void setWatchFolders(boolean watchFolders) {
		if (this.watchFolders == watchFolders)
			return;
		this.watchFolders = watchFolders;
		onWatchFoldersChanged();
	}
	
	protected void onWatchFoldersChanged() {}
	
	public boolean isSkipTarArchives() {
		return skipTarArchives;
	}
	
	public void setSkipTarArchives(boolean skipTarArchives) {
		this.skipTarArchives = skipTarArchives;
	}

	public static Directory getBaseIndexDir(String indexDir) throws Exception {
		//根据选定文件夹名称创建索引存放目录下的个字文件夹
		//索引目录下子文件夹名称
		String indexSubsFolderName = new File(indexDir).getName();
		
		File newIndexPath = new File(Config.INDEX_PATH+File.separator+indexSubsFolderName);
		if(!newIndexPath.exists()){
			newIndexPath.mkdir();
		}else{
			throw new Exception("此目录已存在，不能重复创建！");
		}
		
		//取的索引目录
		return FSDirectory.open(newIndexPath);
	}
	public static TopDocs getQueryResult(String key){
		TopDocs tds = null;
		try{
			//1，创建Directory
			Directory directory = FSDirectory.open(new File("G:/licene/first"));

			//2，创建IndexReader
			IndexReader reader = IndexReader.open(directory);
			//3,根据IndexReader创建IndexSearcher
			IndexSearcher searcher = new IndexSearcher(reader);
			//创建搜索的Query
			QueryParser parser = new QueryParser(Version.LUCENE_30, "contents",new StandardAnalyzer(Version.LUCENE_30));
			parser.setAllowLeadingWildcard(true);
			RewriteMethod rewriteMethod = MultiTermQuery.SCORING_BOOLEAN_QUERY_REWRITE;
			parser.setMultiTermRewriteMethod(rewriteMethod);
//			parser.setDefaultOperator(QueryParser.AND_OPERATOR);
			
			Query query = parser.parse(key); 
			
			// 5根据searcher
			tds = searcher.search(query, 10);
		}catch(Exception ex){
			
		}

		return tds;
		
	}
	
	public static List<SearchResult> searcher(String key) throws Exception{
		//1，创建Directory
		Directory directory = FSDirectory.open(new File("G:/licene/first/个人资料"));

		//2，创建IndexReader
		IndexReader reader = IndexReader.open(directory);
		//3,根据IndexReader创建IndexSearcher
		IndexSearcher searcher = new IndexSearcher(reader);
		//创建搜索的Query
		QueryParser parser = new QueryParser(Version.LUCENE_30, "contents",new StandardAnalyzer(Version.LUCENE_30));
		parser.setAllowLeadingWildcard(true);
		RewriteMethod rewriteMethod = MultiTermQuery.SCORING_BOOLEAN_QUERY_REWRITE;
		parser.setMultiTermRewriteMethod(rewriteMethod);
		parser.setDefaultOperator(QueryParser.AND_OPERATOR);
		
		Query query = parser.parse(key); 
		
		// 5根据searcher
		TopDocs tds = searcher.search(query, 10);
		
		ScoreDoc[] sds = tds.scoreDocs;
		
		List<SearchResult> list = new ArrayList<SearchResult>();
		for(ScoreDoc sd:sds){
			Document d = searcher.doc(sd.doc);
			float score = sd.score;
			SearchResult rs = new SearchResult(d,score);
			list.add(rs);

		}
		reader.close();
		
		return list;
	}
}
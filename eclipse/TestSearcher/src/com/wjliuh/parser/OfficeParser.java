package com.wjliuh.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.poi.hpsf.PropertySetFactory;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.poifs.eventfilesystem.POIFSReader;
import org.apache.poi.poifs.eventfilesystem.POIFSReaderEvent;
import org.apache.poi.poifs.eventfilesystem.POIFSReaderListener;

import com.google.common.io.Closeables;
import com.wjliuh.utils.annotations.NotNull;

public abstract class OfficeParser extends FileParser {

	private static final Collection<String> types = MediaType.Col.application("msword");

	private final String typeLabel;
	private final Collection<String> extensions;

	public OfficeParser(@NotNull String typeLabel, @NotNull String... extensions) {
		this.typeLabel = typeLabel;
		this.extensions = Arrays.asList(extensions);

	}

	@NotNull
	public Document parse(@NotNull File file) throws Exception {
		String cntents = this.renderText(file);

		POIFSReader reader = new POIFSReader();
		MyReaderListener listener = new MyReaderListener();
		reader.registerListener(listener, "\005SummaryInformation"); //$NON-NLS-1$

		try {
			reader.read(new FileInputStream(file));
		} catch (IllegalArgumentException e) {
			throw new ParseException(e);
		}

		Document luceneDoc = new Document();
		luceneDoc.add(new Field("name", file.getName(), Store.YES,
				Index.NO));		
		luceneDoc.add(new Field(OfficeParser.lastModified, String.valueOf(file
				.lastModified()), Store.YES, Index.NO));
		luceneDoc.add(new Field(OfficeParser.title, title, Store.YES,
				Index.ANALYZED));
		luceneDoc.add(new Field(OfficeParser.author, author,
				Store.YES, Index.NO));
		luceneDoc.add(new Field(OfficeParser.contents, contents, Store.NO,
				Index.ANALYZED));
		luceneDoc.add(new Field(path, file.getAbsolutePath(), Store.YES,
				Index.NO));
		luceneDoc.add(new Field("size", String.valueOf(file.length()), Store.YES,
				Index.NO));		
		return luceneDoc;

	}

	public String renderText(File file) throws Exception{
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			return extractText(file);
		}catch (Exception ex){
			
		}finally {
			Closeables.closeQuietly(in);
		}
		return null;
	}
	
	@NotNull
	public abstract String extractText(@NotNull File file)	throws Exception;

	private static final class MyReaderListener implements POIFSReaderListener {
		public String author;
		public String title;
//		public String subject;
//		public String keywords;
//		public String comments;

		public void processPOIFSReaderEvent(POIFSReaderEvent event) {
			try {
				SummaryInformation si = (SummaryInformation) PropertySetFactory
						.create(event.getStream());

				// Combine 'author' and 'last author' field if they're identical
				String author;
				String defaultAuthor = si.getAuthor();
				String lastAuthor = si.getLastAuthor();
				if (defaultAuthor == null || defaultAuthor.equals(lastAuthor))
					author = defaultAuthor;
				else
					author = defaultAuthor + ", " + lastAuthor; //$NON-NLS-1$

				this.author = author;
				title = si.getTitle();
//				subject = si.getSubject();
//				keywords = si.getKeywords();
//				comments = si.getComments();
			} catch (Exception e) {
			}
		}
	}

	public final Collection<String> getExtensions() {
		return extensions;
	}

	public final Collection<String> getTypes() {
		return types;
	}

	public final String getTypeLabel() {
		return typeLabel;
	}

}

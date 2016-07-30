package com.wjliuh.parser;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.poi.POITextExtractor;
import org.apache.poi.extractor.ExtractorFactory;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackageProperties;
import org.apache.poi.xssf.extractor.XSSFExcelExtractor;

import com.google.common.io.Closeables;
import com.wjliuh.enums.Msg;
import com.wjliuh.utils.annotations.NotNull;

abstract class MSOffice2007Parser extends FileParser {

	public static final class MSWord2007Parser extends MSOffice2007Parser {
		public MSWord2007Parser() {
			super(Msg.filetype_docx.get(), "docx", "docm", "dotx");
		}

		@Override
		public String renderText(File file) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public static final class MSExcel2007Parser extends MSOffice2007Parser {
		public MSExcel2007Parser() {
			super(Msg.filetype_xlsx.get(), "xlsx", "xlsm", "xltx");
		}

		@Override
		public String renderText(File file) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public static final class MSPowerPoint2007Parser extends MSOffice2007Parser {
		public MSPowerPoint2007Parser() {
			super(Msg.filetype_pptx.get(), "pptx", "pptm", "ppsx");
		}

		@Override
		public String renderText(File file) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	}

	private final Collection<String> types = null;

	private final String typeLabel;
	private final Collection<String> extensions;

	private MSOffice2007Parser(@NotNull String typeLabel,
			@NotNull String... extensions) {
		this.typeLabel = typeLabel;
		this.extensions = Arrays.asList(extensions);
	}

	@Override
	public Document parse(File file)
			throws Exception {
		try {
			return doParse(file, PackageAccess.READ);
		}
		catch (Exception e) {
			
		}
		return null;

	}
	
	private static Document doParse(File file, PackageAccess access) throws Exception {
		OPCPackage pkg = null;
		try {
			pkg = OPCPackage.open(file.getPath(), access);
			String contents = extractText(pkg);
			
			// Open properties
			PackageProperties props = pkg.getPackageProperties();
			
			// Get author(s)
			String author = null;
			String defaultAuthor = props.getCreatorProperty().getValue();
			String lastAuthor = props.getLastModifiedByProperty().getValue();
			if (defaultAuthor == null) {
				if (lastAuthor != null)
					author = lastAuthor;
			}
			else if (lastAuthor == null) {
				author = defaultAuthor;
			}
			else {
				if (defaultAuthor.equals(lastAuthor))
					author = defaultAuthor;
				else
					author = defaultAuthor + ", " + lastAuthor; //$NON-NLS-1$
			}
			
			// Get other metadata
//			String description = props.getDescriptionProperty().getValue();
//			String keywords = props.getKeywordsProperty().getValue();
//			String subject = props.getSubjectProperty().getValue();
			String title = props.getTitleProperty().getValue()==null?file.getName():props.getTitleProperty().getValue();
			
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
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			Closeables.closeQuietly(pkg);
		}
	}
	
	@NotNull
	public static String extractText(@NotNull OPCPackage pkg) throws Exception {
		POITextExtractor extractor = ExtractorFactory.createExtractor(pkg);
		if (extractor instanceof XSSFExcelExtractor) {
			((XSSFExcelExtractor) extractor).setFormulasNotResults(true);
		}
		String text = extractor.getText();
		return text;
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
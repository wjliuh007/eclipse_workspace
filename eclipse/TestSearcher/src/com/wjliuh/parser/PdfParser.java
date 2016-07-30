package com.wjliuh.parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Collections;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.pdfbox.exceptions.CryptographyException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;

import com.wjliuh.enums.Msg;
import com.wjliuh.utils.annotations.NotNull;
import com.wjliuh.utils.annotations.Nullable;

public final class PdfParser extends StreamParser {
	
	private static final Collection<String> extensions = Collections.singleton("pdf");
	private static final Collection<String> types = MediaType.Col.application("pdf");
	
	PdfParser() {
	}
	
	@Override
	public Document parse(@NotNull InputStream in)
			throws ParseException {
		return null;
	}
	
	static void close(@Nullable PDDocument doc) {
		if (doc != null) {
			try {
				doc.close();
			}
			catch (IOException e) {
			}
		}
	}
	
	public Collection<String> getExtensions() {
		return extensions;
	}
	
	public Collection<String> getTypes() {
		return types;
	}
	
	public String getTypeLabel() {
		return Msg.filetype_pdf.get();
	}

	@Override
	public Document parse(File file) throws Exception {

		PDDocument pdfDoc = null;
		try {

			pdfDoc = PDDocument.load(new FileInputStream(file), true);
			PDDocumentInformation pdInfo;
			final int pageCount;
			try {
				pdInfo = pdfDoc.getDocumentInformation();
				pageCount = pdfDoc.getNumberOfPages();
			}
			catch (Exception e) {
				// Bug #3529070 and #3528345
				throw new ParseException(e);
			}
			StringWriter writer = new StringWriter();
			
			PDFTextStripper stripper = new PDFTextStripper() {
				protected void startPage(PDPage page) throws IOException {
//					context.getReporter().subInfo(getCurrentPageNo(), pageCount);
				}
				protected void endPage(PDPage page) throws IOException {
//					if (context.getCancelable().isCanceled())
//						setEndPage(0);
				}
			};
			stripper.setForceParsing(true);
			
			try {
				stripper.writeText(pdfDoc, writer);
			}
			catch (RuntimeException e) {
				throw new ParseException(e);
			}

			Document luceneDoc = new Document();
			luceneDoc.add(new Field("name", file.getName(), Store.YES,
					Index.NO));		
			luceneDoc.add(new Field(OfficeParser.lastModified, String.valueOf(file
					.lastModified()), Store.YES, Index.NO));
			luceneDoc.add(new Field(OfficeParser.title, pdInfo.getTitle(), Store.YES,
					Index.ANALYZED));
			luceneDoc.add(new Field(OfficeParser.author, pdInfo.getAuthor(),
					Store.YES, Index.NO));
			luceneDoc.add(new Field(OfficeParser.contents, writer.getBuffer().toString(), Store.NO,
					Index.ANALYZED));
			luceneDoc.add(new Field("path",file.getAbsolutePath(), Store.YES,
					Index.NO));
			luceneDoc.add(new Field("size", String.valueOf(file.length()), Store.YES,
					Index.NO));	
			return luceneDoc;
		}
		catch (IOException e) {
			if (e.getCause() instanceof CryptographyException)
				throw new ParseException(Msg.doc_pw_protected.get());
			throw new ParseException(e);
		}
		finally {
			close(pdfDoc);
		}
	
	}

}

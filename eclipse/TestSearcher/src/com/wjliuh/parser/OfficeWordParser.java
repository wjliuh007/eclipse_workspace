package com.wjliuh.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.OldWordFileFormatException;
import org.apache.poi.hwpf.extractor.Word6Extractor;
import org.apache.poi.hwpf.extractor.WordExtractor;

import com.wjliuh.enums.Msg;

public class OfficeWordParser extends OfficeParser {

    public OfficeWordParser() {
    	super(Msg.filetype_doc.get(), "doc", "dot");
	}

	@Override
	public String extractText(File file)
			throws IOException, ParseException {
		FileInputStream fis = new FileInputStream(file);
		try {
			return new WordExtractor(fis).getText();
		}
		catch (OldWordFileFormatException e) {
			return new Word6Extractor(fis).getText();
		}
		catch (EncryptedDocumentException e) {
			throw new ParseException(Msg.doc_pw_protected.get());
		}
	}


}

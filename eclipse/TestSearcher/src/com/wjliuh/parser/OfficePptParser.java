package com.wjliuh.parser;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hslf.exceptions.EncryptedPowerPointFileException;
import org.apache.poi.hslf.exceptions.OldPowerPointFormatException;
import org.apache.poi.hslf.extractor.PowerPointExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;

import com.wjliuh.enums.Msg;
import com.wjliuh.parser.MSOffice2007Parser.MSPowerPoint2007Parser;

public class OfficePptParser extends OfficeParser {

	public OfficePptParser(){
		super(Msg.filetype_ppt.get(), "ppt", "pps");
	}
	
	@Override
	public String extractText(File file) throws Exception {
		try {
			return new PowerPointExtractor(new FileInputStream(file)).getText(true, true, true, true);
		}
		catch (OldPowerPointFormatException e) {
			MSPowerPoint2007Parser p2007parser = new MSPowerPoint2007Parser();
			OPCPackage pkg = OPCPackage.open(file.getPath(), PackageAccess.READ);
			return p2007parser.extractText(pkg);
		}
		catch (EncryptedPowerPointFileException e) {
			throw new ParseException(Msg.doc_pw_protected.get());
		}
	}

}

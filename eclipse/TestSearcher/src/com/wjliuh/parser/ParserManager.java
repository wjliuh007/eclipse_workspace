package com.wjliuh.parser;

import java.io.File;
import java.util.List;

import com.wjliuh.parser.MSOffice2007Parser.MSExcel2007Parser;
import com.wjliuh.parser.MSOffice2007Parser.MSPowerPoint2007Parser;
import com.wjliuh.parser.MSOffice2007Parser.MSWord2007Parser;
import com.wjliuh.utils.annotations.Immutable;
import com.wjliuh.utils.annotations.NotNull;
import com.wjliuh.utls.Util;

public class ParserManager {

	private static final List<Parser> parsers = Util.createList(1,
			new OfficeWordParser(),
			new OfficePptParser(),
			new OfficeExcelParser(),
			
			new MSWord2007Parser(),
			new MSExcel2007Parser(),
			new MSPowerPoint2007Parser(),
			new PdfParser()
		);
	
	@Immutable
	@NotNull
	public static List<Parser> getParsers() {
		return parsers;
	}
	
	public static Parser getRightParser(File file){
		String type = Util.getExtension(file);
		for(Parser p:parsers){
			if(p.getExtensions().contains(type)){
				return p;
			}
		}
		
		return null;
	}
}

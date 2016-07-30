package com.wjliuh.parser;

import java.io.File;
import java.io.FileInputStream;

public class PdfParserTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\JIE\\Downloads\\w3jmail4_cn.pdf"));
		PdfParser pf = new PdfParser();
		pf.parse(fis);

	}

}

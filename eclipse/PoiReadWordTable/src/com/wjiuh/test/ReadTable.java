package com.wjiuh.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.junit.Test;

public class ReadTable {

    @Test
    public void testWord2() {
	try {
	    InputStream in = new FileInputStream(new File("E:\\tej\\NC.docx"));
	    XWPFDocument document = new XWPFDocument(in);
	    List<XWPFParagraph> paragraphs = document.getParagraphs();

	    for(XWPFParagraph paragraph:paragraphs) {
		System.out.println(paragraph.getText());
		paragraph.getElementType().toString();

	    }


	} catch (Exception ex) {

	}
    }
    
    @Test
    public void testWord3() {
	try {
	    InputStream in = new FileInputStream(new File("E:\\tej\\test0710.docx"));
	    XWPFDocument document = new XWPFDocument(in);
	    List<XWPFTable> tables = document.getTables();
	    System.out.println(tables.size());

	    for(XWPFTable table:tables) {
		    for (int i = 0; i < table.getNumberOfRows(); i++) {
			XWPFTableRow row = table.getRow(i);
			List<XWPFTableCell> cells = row.getTableCells();
			for (XWPFTableCell cell : cells) {
			    List<XWPFParagraph> paragraphs = cell.getParagraphs();
			    System.out.print(cell.getText() + " | ");
			}
			System.out.println();
		    }
	    }


	} catch (Exception ex) {

	}
    }

}
package com.wjliuh.parser;

import java.io.File;

import junit.framework.Assert;

import org.apache.poi.extractor.ExtractorFactory;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.junit.Test;

import com.google.common.base.Throwables;

public final class MSOffice2007ParserTest {
	
	@Test
	public void testReadOnlyFails() throws Exception {
		/*
		 * In POI 3.10 FINAL, text extraction will fail on this file when opened 
		 * in read-only mode, but succeed in read-write mode. The MS Office 2007
		 * parser contains a workaround for this, and the latter would become
		 * obsolete if in a later POI version the file could be read in
		 * read-only mode.
		 */
		File file = TestFiles.read_write_xls.get();
		OPCPackage pkg = OPCPackage.open(file.getPath(), PackageAccess.READ);
		try {
			ExtractorFactory.createExtractor(pkg).getText();
		}
		catch (Exception e) {
			Throwable root = Throwables.getRootCause(e);
			String msg = ((InvalidOperationException) root).getMessage();
			Assert.assertTrue(msg.contains("read only"));
			return;
		}
		Assert.assertTrue(false);
	}
	
	@Test
	public void testReadWriteSucceeds() throws Exception {
		File file = TestFiles.read_write_xls.get();
		OPCPackage pkg = OPCPackage.open(file.getPath(), PackageAccess.READ_WRITE);
		String result = ExtractorFactory.createExtractor(pkg).getText();
		System.out.println(result);
	}
	
	
	@Test
	public void testParse() throws Exception {
		File file = TestFiles.read_write_xls.get();
		long lengthBefore = file.length();
		long modBefore = file.lastModified();
//		ParseService.parse(new IndexingConfig(), file, file.getName(),
//			new Path(file), IndexingReporter.nullReporter, Cancelable.nullCancelable);
		Assert.assertEquals(lengthBefore, file.length());
		Assert.assertEquals(modBefore, file.lastModified());
	}
	
}

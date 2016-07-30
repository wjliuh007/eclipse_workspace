/*******************************************************************************
 * Copyright (c) 2008 Tran Nam Quang.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tran Nam Quang - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import net.sourceforge.docfetcher.enumeration.Msg;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 * @author Tran Nam Quang
 */
public class MSExcelParser extends MSOfficeParser {

	private static final String[] extensions = new String[] {"xls"}; //$NON-NLS-1$
	
	public String renderText(File file) throws ParseException {
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			ExcelExtractor extractor = null;
			try {
				extractor = new ExcelExtractor(new POIFSFileSystem(in));
			}
			catch (Exception e) {
				// This can happen if the file has the "xls" extension, but is not an Excel document
				throw new ParseException(file, Msg.file_corrupted.value());
			}
			finally {
				in.close();
			}
			extractor.setFormulasNotResults(true);
			return extractor.getText();
		}
		catch (FileNotFoundException e) {
			throw new ParseException(file, Msg.file_not_found.value());
		}
		catch (IOException ioe) {
			throw new ParseException(file, Msg.file_not_readable.value());
		}
	}

	public String[] getExtensions() {
		return extensions;
	}

	public String getFileType() {
		return Msg.filetype_xls.value();
	}

}

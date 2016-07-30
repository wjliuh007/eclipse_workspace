/*******************************************************************************
 * Copyright (c) 2009 Tran Nam Quang.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tran Nam Quang - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.aspect;

import net.sourceforge.docfetcher.DocFetcher;

import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.POIOLE2TextExtractor;

/**
 * Apache POI 3.5 and PDFBox 0.8.0 sometimes write to System.err without
 * throwing an exception, therefore we have to temporarily deactivate the custom
 * exception handler in order to avoid stacktrace pop-ups.
 * 
 * @author Tran Nam Quang
 */
public aspect ParserSilencer {
	
	pointcut parsing():
		call(POIOLE2TextExtractor+.new(..)) ||
		call(* PDFTextStripper.writeText(..));
	
	before(): parsing() {
		DocFetcher docFetcher = DocFetcher.getInstance();
		if (docFetcher != null) // this is null if DocFetcher is used as a command line tool
			docFetcher.setExceptionHandlerEnabled(false);
	}
	
	after(): parsing() {
		DocFetcher docFetcher = DocFetcher.getInstance();
		if (docFetcher != null) // this is null if DocFetcher is used as a command line tool
			docFetcher.setExceptionHandlerEnabled(true);
	}

}

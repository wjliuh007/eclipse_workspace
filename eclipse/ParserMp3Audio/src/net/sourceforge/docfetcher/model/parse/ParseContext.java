/*******************************************************************************
 * Copyright (c) 2011 Tran Nam Quang.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tran Nam Quang - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.model.parse;

import net.sourceforge.docfetcher.model.Cancelable;
import net.sourceforge.docfetcher.model.index.IndexingReporter;

/**
 * @author Tran Nam Quang
 */
final class ParseContext {
	
	private final String filename;
	private final IndexingReporter reporter;
	private final Cancelable cancelable;

	public ParseContext( String filename) {
		this(filename, IndexingReporter.nullReporter, Cancelable.nullCancelable);
	}
	
	public ParseContext( String filename,
	                     IndexingReporter reporter,
						 Cancelable cancelable) {
		this.filename = filename;
		this.reporter = reporter;
		this.cancelable = cancelable;
	}
	
	
	public String getFilename() {
		return filename;
	}

	
	public IndexingReporter getReporter() {
		return reporter;
	}

	
	public Cancelable getCancelable() {
		return cancelable;
	}

}

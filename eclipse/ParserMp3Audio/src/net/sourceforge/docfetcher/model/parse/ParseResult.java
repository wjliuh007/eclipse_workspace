/*******************************************************************************
 * Copyright (c) 2010, 2011 Tran Nam Quang.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tran Nam Quang - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.model.parse;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO doc: simplifies creation of Lucene Document objects for the parsers.
 * allows method chaining
 * 
 * @author Tran Nam Quang
 */
public final class ParseResult {
	
	 private CharSequence content;
	 private String title;
	 private List<String> authors;
	 private List<String> miscMetadata;
	 private String parserName;
	
	public ParseResult( CharSequence content) {
		setContent(content);
	}
	
	
	public CharSequence getContent() {
		return content;
	}
	
	
	public ParseResult setContent( CharSequence content) {
		this.content = content == null ? "" : content;
		return this;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public ParseResult setTitle( String title) {
		this.title = title;
		return this;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	
	public ParseResult addAuthor( String author) {
		if (author == null)
			return this;
		if (authors == null)
			authors = new ArrayList<String> (3);
		authors.add(author);
		return this;
	}
	
	public List<String> getMiscMetadata() {
		return miscMetadata;
	}
	
	
	public ParseResult addMiscMetadata( String metadata) {
		if (metadata == null) // PDFBox may return null on some metadata fields
			return this;
		if (miscMetadata == null)
			miscMetadata = new ArrayList<String> (5);
		miscMetadata.add(metadata);
		return this;
	}
	
	// Returned char sequence has an empty string appended at the end
	
	public StringBuilder getMetadata() {
		StringBuilder metadata = new StringBuilder();
		if (title != null)
			metadata.append(title).append(" ");
		if (authors != null)
			for (String author : authors)
				metadata.append(author).append(" ");
		if (miscMetadata != null)
			for (String metadata0 : miscMetadata)
				metadata.append(metadata0).append(" ");
		return metadata;
	}
	
	// Should not be called by Parser implementations
	
	public String getParserName() {
		return parserName;
	}
	
	// Should not be called by Parser implementations
	
	public ParseResult setParserName( String parserName) {
		this.parserName = parserName==null?"":parserName;
		return this;
	}
	
}

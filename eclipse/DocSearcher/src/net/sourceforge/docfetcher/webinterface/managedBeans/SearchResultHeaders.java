/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Kalender - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.webinterface.managedBeans;

/**
 * Collection of string constants that are used to identify the columns of the
 * result table
 * 
 * @author Andreas Kalender
 */
public class SearchResultHeaders {

	private static final SearchResultHeaders instance = new SearchResultHeaders();

	/**
	 * Singleton Pattern
	 * 
	 * @return An instance of this class
	 */
	public static SearchResultHeaders getInstance() {
		return SearchResultHeaders.instance;
	}

	private final String headerAuthor = "author"; //$NON-NLS-1$
	private final String headerLastModified = "lastModified"; //$NON-NLS-1$
	private final String headerName = "name"; //$NON-NLS-1$
	private final String headerPath = "path"; //$NON-NLS-1$
	private final String headerScore = "score"; //$NON-NLS-1$
	private final String headerSize = "size"; //$NON-NLS-1$
	private final String headerTitle = "title"; //$NON-NLS-1$
	private final String headerType = "type"; //$NON-NLS-1$

	/**
	 * Getter
	 * 
	 * @return The headerAuthor
	 */
	public String getHeaderAuthor() {
		return this.headerAuthor;
	}

	/**
	 * Getter
	 * 
	 * @return The headerLastModified
	 */
	public String getHeaderLastModified() {
		return this.headerLastModified;
	}

	/**
	 * Getter
	 * 
	 * @return The headerName
	 */
	public String getHeaderName() {
		return this.headerName;
	}

	/**
	 * Getter
	 * 
	 * @return The headerPath
	 */
	public String getHeaderPath() {
		return this.headerPath;
	}

	/**
	 * Getter
	 * 
	 * @return The headerScore
	 */
	public String getHeaderScore() {
		return this.headerScore;
	}

	/**
	 * Getter
	 * 
	 * @return The headerSize
	 */
	public String getHeaderSize() {
		return this.headerSize;
	}

	/**
	 * Getter
	 * 
	 * @return The headerTitle
	 */
	public String getHeaderTitle() {
		return this.headerTitle;
	}

	/**
	 * Getter
	 * 
	 * @return The headerType
	 */
	public String getHeaderType() {
		return this.headerType;
	}

}

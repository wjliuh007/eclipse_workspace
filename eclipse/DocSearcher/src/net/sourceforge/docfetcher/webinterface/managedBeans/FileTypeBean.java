/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Andreas Kalender -
 * initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.webinterface.managedBeans;

import net.sourceforge.docfetcher.parse.Parser;

/**
 * Represents a file type filter This bean is used to control the choosen file
 * filters by offering a bean for each filter. The filter type could be
 * identified by its <code>value</code>. The bean implements the
 * <code>Comparable</comparable> interface to enable alphabetic
 * sorting.
 * 
 * @author Andreas Kalender
 */
public class FileTypeBean implements Comparable<FileTypeBean> {

	private Parser parser;

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(final FileTypeBean o) {
		if (o == null) {
			return 1;
		}

		return this	.getValue()
					.compareTo(o.getValue());
	}

	/**
	 * Getter
	 * 
	 * @return The parser
	 */
	public Parser getParser() {
		return this.parser;
	}

	/**
	 * Getter
	 * 
	 * @return The value
	 */
	public String getValue() {
		return this.parser.getFileType();
	}

	/**
	 * Getter
	 * 
	 * @return The state
	 */
	public boolean isChecked() {
		return this.parser.isChecked();
	}

	/**
	 * Setter
	 * 
	 * @param state
	 *            The state to set
	 */
	public void setChecked(final boolean state) {
		this.parser.setChecked(state);
	}

	/**
	 * Setter
	 * 
	 * @param parser
	 *            The parser to set
	 */
	public void setParser(final Parser parser) {
		this.parser = parser;
	}

}

/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Andreas Kalender -
 * initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.webinterface.managedBeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sourceforge.docfetcher.parse.Parser;

/**
 * Factory pattern that is used to access all created <code>FileTypeBean</code>
 * instances out of one place
 * 
 * @author Andreas Kalender
 */
public class FileTypeBeanFactory {

	private static FileTypeBeanFactory instance;

	/**
	 * Singleton pattern
	 * 
	 * @return The singleton instance of this class
	 */
	public static FileTypeBeanFactory getInstance() {
		if (FileTypeBeanFactory.instance == null) {
			FileTypeBeanFactory.instance = new FileTypeBeanFactory();
		}

		return FileTypeBeanFactory.instance;
	}

	private final Map<String, FileTypeBean> beans;

	/**
	 * Constructor
	 */
	protected FileTypeBeanFactory() {
		this.beans = new TreeMap<String, FileTypeBean>();
	}

	/**
	 * Clears the list of managed beans
	 */
	public void clear() {
		this.beans.clear();
	}

	/**
	 * Getter
	 * 
	 * @return The beans
	 */
	public List<FileTypeBean> getBeans() {
		final List<FileTypeBean> result = new ArrayList<FileTypeBean>();

		for (final FileTypeBean bean : this.beans.values()) {
			result.add(bean);
		}

		return result;
	}

	/**
	 * Returns a bean to the given value. If a bean is already assigned to the
	 * given value, this bean will be returned. Otherwise a new bean is created
	 * and registered and will returned afterwards.
	 * 
	 * @param parser
	 *            The parser of the created instance
	 * @return The created instance
	 */
	public FileTypeBean getOrCreateFileTypeBean(final Parser parser) {
		if (this.beans.containsKey(parser.getFileType())) {
			return this.beans.get(parser.getFileType());
		}

		final FileTypeBean result = new FileTypeBean();

		result.setParser(parser);
		result.setChecked(true);

		this.beans.put(	parser.getFileType(),
						result);

		return result;
	}
}

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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.MalformedURLException;

import net.sourceforge.docfetcher.enumeration.Msg;
import net.sourceforge.docfetcher.model.ResultDocument;
import net.sourceforge.docfetcher.parse.Parser;
import net.sourceforge.docfetcher.util.UtilFile;

/**
 * A class that offers the access to all relevant data of a
 * <code>SearchResultDocument</code> in a JavaBean style. This class could be
 * used to provide the access to searchresults by JSFs respectively JSPs
 * 
 * @author Andreas Kalender
 */
public class SearchResultBean {

	private final String author;
	private final String fileName;
	private final String fileType;
	private final String lastModified;
	private final Parser parser;
	private final String path;
	private final int score;
	private boolean selected;
	private final String size;
	private final String title;
	private String url;

	/**
	 * Constructor Creates a <code>SearchResultBean</code> which encapsulates
	 * the data of a <code>ResultDocument</code> in a JavaBean way (getters and
	 * setters)
	 * 
	 * @param document
	 *            The <code>ResultDocument</code> the created
	 *            <code>SearchResultBean</code> should correspond to
	 */
	public SearchResultBean(final ResultDocument document) {
		this.title = document.getTitle();
		this.score = Math.round(document.getScore() * 100);
		this.size = new Long(UtilFile.getSizeInKB(document.getFile())).toString();

		this.fileName = document.getFile()
								.getName();
		this.fileType = UtilFile.getExtension(document.getFile());
		this.path = document.getFile()
							.getAbsolutePath();
		this.author = document.getAuthor();
		this.lastModified = UtilFile.getLastModified(document.getFile());

		try {
			this.url = document	.getFile()
								.toURI()
								.toURL()
								.getFile();
		}
		catch (final MalformedURLException e) {
			// If the URL could not extracted/created
			// no link will Be available
			// So the URL is set to an empty string
			this.url = ""; //$NON-NLS-1$
		}

		this.parser = document.getParser();
	}

	/**
	 * Converts a given filesize in byte into a string. Thereby the size is
	 * converted into terrabyte, gigabyte, megabyte or kilobyte this is
	 * appropriate for the given date
	 * 
	 * @param size
	 *            The size to convert
	 * @return The String representing the converted size
	 */
	protected String convertSize(final long size) {
		if (size > (1024 * 1024 * 1024 * 1024)) {
			final float convertedSize = (float) size / (float) (1024 * 1024 * 1024 * 1024);
			return String.format(	"%.2f TB", convertedSize); //$NON-NLS-1$
		}

		if (size > (1024 * 1024 * 1024)) {
			final float convertedSize = (float) size / (float) (1024 * 1024 * 1024);
			return String.format(	"%.2f GB", convertedSize); //$NON-NLS-1$
		}

		if (size > (1024 * 1024)) {
			final float convertedSize = (float) size / (float) (1024 * 1024);
			return String.format(	"%.2f MB", convertedSize); //$NON-NLS-1$
		}

		if (size > (1024)) {
			final float convertedSize = (float) size / (float) (1024);
			return String.format(	"%.2f KB", convertedSize); //$NON-NLS-1$
		}

		return String.format(	"%d B", size); //$NON-NLS-1$
	}

	/**
	 * Getter
	 * 
	 * @return The author
	 */
	public String getAuthor() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.author == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.author;
	}

	/**
	 * Getter
	 * 
	 * @return The fileName
	 */
	public String getFileName() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.fileName == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.fileName;
	}

	/**
	 * Getter
	 * 
	 * @return The fileType
	 */
	public String getFileType() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.fileType == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.fileType;
	}

	/**
	 * Getter
	 * 
	 * @return The lastModified
	 */
	public String getLastModified() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.lastModified == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.lastModified;
	}

	/**
	 * Getter
	 * 
	 * @return The path
	 */
	public String getPath() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.path == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.path;
	}

	/**
	 * Getter
	 * 
	 * @return The score
	 */
	public int getScore() {
		return this.score;
	}

	/**
	 * Getter
	 * 
	 * @return The size
	 */
	public String getSize() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.size == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.size;
	}

	/**
	 * Getter
	 * 
	 * @return The title
	 */
	public String getTitle() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.title == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.title;
	}

	/**
	 * Getter
	 * 
	 * @return The url
	 */
	public String getUrl() {
		// Ensure that null is not returned
		// A null value could cause trouble when 
		// sorting the results
		if (this.url == null) {
			return ""; //$NON-NLS-1$
		}
		
		return this.url;
	}

	/**
	 * Getter
	 * 
	 * @return The selected
	 */
	public boolean isSelected() {
		return this.selected;
	}

	/**
	 * Setter
	 * 
	 * @param selected
	 *            The selected to set
	 */
	public void setSelected(final boolean selected) {
		this.selected = selected;

		if (selected) {
			if (this.parser	.getFileType()
							.equals(Msg.filetype_html.value())) {
				try {
					new File(this.getPath());
					final BufferedReader reader = new BufferedReader(new FileReader(this.getPath()));
	
					final StringBuilder lines = new StringBuilder();
					String line;
	
					while ((line = reader.readLine()) != null) {
						lines.append(line);
						lines.append("\n"); //$NON-NLS-1$
					}
	
					ResultSelector.setParsedFile(lines.toString());
					reader.close();
				}
				catch (final Exception e) {
					// TODO Add some errorpage
					ResultSelector.setParsedFile(""); //$NON-NLS-1$
				}
			}
			else {
				// TODO Convert file to HTML
				ResultSelector.setParsedFile(""); //$NON-NLS-1$
			}
		}
	}
}

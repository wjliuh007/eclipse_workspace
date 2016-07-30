/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Andreas Kalender -
 * initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.webinterface.managedBeans;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import net.sourceforge.docfetcher.Const;

/**
 * A class that manages the preview of the current selected file Therefore the
 * class offers the methods to create a temporary preview file that is
 * accessible for the webserver
 * 
 * @author Andreas Kalender
 */
public class ResultSelector {

	private static int fileNumber;
	private static File parentFolder;
	private static String parsedFile;

	/**
	 * Setter
	 * 
	 * @param parsedFile
	 *            The parsedFile to set
	 */
	public static void setParsedFile(final String parsedFile) {
		ResultSelector.parsedFile = parsedFile;
	}

	/**
	 * Constructor
	 */
	public ResultSelector() {
		// Creates the folder where the temporary files
		// are placed into
		ResultSelector.parentFolder = new File(".." //$NON-NLS-1$
												+ Const.FS
												+ "webinterface" //$NON-NLS-1$ 
												+ Const.FS
												+ "temp"); //$NON-NLS-1$
		ResultSelector.parentFolder.mkdirs();

		// Initializes a basic counter which is used to generate individual
		// filenames
		ResultSelector.fileNumber = 0;
	}

	/**
	 * Creates a temporary file inside the webinterface temporary folder This is
	 * done to deliver the webpage over the network. Other local folders can't
	 * be accessed directly
	 * 
	 * @return The relative path to the generated file
	 */
	public String getPreview() {
		if ((ResultSelector.parsedFile != null) && !ResultSelector.parsedFile	.trim()
																				.equals("")) { //$NON-NLS-1$

			// Creates a temporary, unique filename
			final String fileName = "temp_" + //$NON-NLS-1$
									new Integer(ResultSelector.fileNumber).toString();
			final File file = new File(ResultSelector.parentFolder + Const.FS
										+ fileName);

			// Writes the file to the temporary folder
			try {
				final FileWriter writer = new FileWriter(file);
				try {
					writer.write(ResultSelector.parsedFile);
				}
				finally {
					ResultSelector.fileNumber++;
					writer.close();
				}
				return "/temp/" + fileName; //$NON-NLS-1$
			}
			catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Returns an empty preview if no file was selected or the selected file
		// is not accessible for any reason
		return "/empty.html"; //$NON-NLS-1$
	}
}

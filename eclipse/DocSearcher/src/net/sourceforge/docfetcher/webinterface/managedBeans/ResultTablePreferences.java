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

import net.sourceforge.docfetcher.enumeration.Pref;

/**
 * Encapsulates the access to the preferences for the presentation of the results inside the webinterface
 * 
 * The encapsulation is needed while values can just be accessed by JavaBeans 
 * 
 * @author Andreas Kalender
 */
public class ResultTablePreferences {

	/**
	 * Returns the number of results that are shown per page
	 * 
	 * @return The amount of results per page of the result table
	 */
	public int getMaxResultsPerPage() {
		return Pref.Int.MaxResultsPerWebPage.getValue();
	}
	
}

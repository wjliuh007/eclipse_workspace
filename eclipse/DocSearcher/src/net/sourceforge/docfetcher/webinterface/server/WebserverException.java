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

package net.sourceforge.docfetcher.webinterface.server;

/**
 * An exception that represents problems during the creation or usage of the
 * webserver
 * 
 * @author Andreas Kalender
 */
public class WebserverException extends Exception {

	/**
	 * auto-generated
	 */
	private static final long serialVersionUID = 5663657698645996700L;

	/**
	 * Constructor
	 * 
	 * @param message
	 *            the error message
	 */
	public WebserverException(final String message) {
		super(message);
	}

}

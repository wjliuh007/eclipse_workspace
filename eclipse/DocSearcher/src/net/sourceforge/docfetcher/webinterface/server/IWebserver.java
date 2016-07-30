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
 * Defines the methods that must be offered by a webserver
 * 
 * @author Andreas Kalender
 */
public interface IWebserver {

	/**
	 * Returns the port the server is listening on
	 * 
	 * @return The port assigned to the server
	 */
	public int getPort();

	/**
	 * Starts the server Afterwards the server will be listening on the assigned
	 * port. The way the port is set depends on the implementation. The port the
	 * server is listening on could be retrieved by the getPort() method
	 * {@link IWebserver#getPort()}
	 * 
	 * @throws WebserverException
	 *             If an exception occurs
	 */
	public void startServer() throws WebserverException;

	/**
	 * Stops the server If the server wasn't started before, calling this method
	 * will take no effect
	 */
	public void stopServer();

}

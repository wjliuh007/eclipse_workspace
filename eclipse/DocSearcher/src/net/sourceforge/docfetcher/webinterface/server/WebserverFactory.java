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

import java.util.Map;
import java.util.TreeMap;

/**
 * Factory Pattern Creates and returns a valid instance of the
 * <code>IWebserver</code> interface The returned <code>IWebserver</code> will
 * be returned initialized and started (listening)
 * 
 * @author Andreas Kalender
 */
public class WebserverFactory {

	private static WebserverFactory instance;

	/**
	 * Singleton Pattern
	 * 
	 * @return A singleton instance of this class
	 */
	protected static WebserverFactory getInstance() {
		if (WebserverFactory.instance == null) {
			WebserverFactory.instance = new WebserverFactory();
		}

		return WebserverFactory.instance;
	}

	/**
	 * Factory Pattern Checks if a webserver is allready assigned to the given
	 * port. If no such webserver exist, a new instance will be created. The
	 * assigned server will be returned.
	 * 
	 * @param port
	 *            The port the server should listen on
	 * @return A <code>IWebserver</code> that is listening on the given port
	 * @throws WebserverException
	 *             If an exception occurs
	 */
	public static IWebserver getWebserver(final int port)
			throws WebserverException {
		return WebserverFactory	.getInstance()
								.getOrCreateWebserver(port);
	}

	private final Map<Integer, IWebserver> webserverMapping;

	/**
	 * Protected Constructor / Singleton Pattern
	 */
	protected WebserverFactory() {
		this.webserverMapping = new TreeMap<Integer, IWebserver>();
	}

	/**
	 * Checks if a webserver instance to the given port allready exists If so,
	 * this instance will be returned. Otherwise a new valid instance is created
	 * and returned
	 * 
	 * @param port
	 *            the port, the webserver should listen on
	 * @return An <code>IWebserver</code> implementation that is listening on
	 *         the given port
	 * @throws WebserverException
	 *             If an exception occurs
	 */
	protected IWebserver getOrCreateWebserver(final int port)
			throws WebserverException {
		IWebserver webserver = this.webserverMapping.get(port);

		if (webserver == null) {
			webserver = new JettyWebserver(port);
			webserver.startServer();
			this.webserverMapping.put(	port,
										webserver);
		}

		return webserver;
	}

}

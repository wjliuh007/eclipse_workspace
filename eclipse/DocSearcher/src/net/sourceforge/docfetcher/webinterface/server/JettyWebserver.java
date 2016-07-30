/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Andreas Kalender -
 * initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.webinterface.server;

import java.io.File;

import net.sourceforge.docfetcher.Const;
import net.sourceforge.docfetcher.util.UtilFile;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Implementation of the <code>IWebserver</code> Interface This implementation
 * is based upon the usage of Jetty as the application and webserver
 * 
 * @author Andreas Kalender
 */
public class JettyWebserver implements IWebserver {

	private final int port;
	private Server server;

	/**
	 * Constructor
	 * 
	 * @param port
	 *            The port the server should listen on
	 */
	public JettyWebserver(final int port) {
		super();

		this.port = port;
		this.server = new Server(port);
	}

	/**
	 * @see net.sourceforge.docfetcher.webinterface.server.IWebserver#getPort()
	 */
	public int getPort() {
		return this.port;
	}

	/**
	 * @see net.sourceforge.docfetcher.webinterface.server.IWebserver#startServer()
	 */
	public void startServer() throws WebserverException {
		new Thread(new Runnable() {

			/**
			 * @see java.lang.Runnable#run()
			 */
			public void run() {
				final WebAppContext wac = new WebAppContext();
				wac.setWar(".." + //$NON-NLS-1$
							Const.FS
							+ "webinterface"); //$NON-NLS-1$
				JettyWebserver.this.server.setHandler(wac);

				try {
					JettyWebserver.this.server.start();
					JettyWebserver.this.server.join();
				}
				catch (final Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

	/**
	 * @see net.sourceforge.docfetcher.webinterface.server.IWebserver#stopServer()
	 */
	public void stopServer() {
		if (this.server != null) {
			try {
				this.server.stop();
			}
			catch (final Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			final File file = new File(".." + Const.FS //$NON-NLS-1$
										+ "webinterface" //$NON-NLS-1$
										+ Const.FS
										+ "temp"); //$NON-NLS-1$

			if (file.exists()) {
				for (final File tempFile: UtilFile.listAll(file.getAbsoluteFile())) {
					tempFile.delete();
				}
			}

			this.server = null;
		}
	}

}

/*******************************************************************************
 * Copyright (c) 2011 Tran Nam Quang.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tran Nam Quang - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.model.parse;

import java.util.Collection;

/**
 * @author Tran Nam Quang
 */
public abstract class Parser {
	
	Parser() {} // Parser class should not be subclassed outside this package

	protected abstract Collection<String> getExtensions();
	
	protected abstract Collection<String> getTypes();
	
	public abstract String getTypeLabel();

}

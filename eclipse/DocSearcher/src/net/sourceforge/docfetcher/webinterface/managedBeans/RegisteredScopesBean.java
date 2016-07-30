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

import net.sourceforge.docfetcher.model.RootScope;
import net.sourceforge.docfetcher.model.ScopeRegistry;

/**
 * Backing bean for the root scope entries
 * 
 * @author Andreas Kalender
 */
public class RegisteredScopesBean {

	/**
	 * Returns the list of all root scope elements that are registered
	 * 
	 * @return The list of all available root scope elements
	 */
	public List<RegisteredScopeBean> getRegisteredScopes() {
		final List<RegisteredScopeBean> result = new ArrayList<RegisteredScopeBean>();
		
		final RegisteredScopeBeanFactory scopeBeanFactory = RegisteredScopeBeanFactory.getInstance();
		for (final RootScope scope: ScopeRegistry.getInstance().getEntries()) {
			final RegisteredScopeBean scopeBean = scopeBeanFactory.getBean(scope);
			result.add(scopeBean);
		}
		
		return result;
	}
		
}

/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Andreas Kalender -
 * initial API and implementation
 *******************************************************************************/
package net.sourceforge.docfetcher.webinterface.managedBeans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sourceforge.docfetcher.model.RootScope;

/**
 * Factory pattern The <code>RegisteredScopeBeanFactory</code> offers the
 * functionality that should be used to create instances of the
 * <code>RegisteredScopeBean</code> class. Each bean that is created using the
 * factory method is registered and could be used globally afterwards.
 * 
 * @author Andreas Kalender
 */
public class RegisteredScopeBeanFactory {

	private static RegisteredScopeBeanFactory instance;

	/**
	 * Factory Pattern, Singleton Pattern
	 * 
	 * @return A singleton instance of this class
	 */
	public static RegisteredScopeBeanFactory getInstance() {
		if (RegisteredScopeBeanFactory.instance == null) {
			RegisteredScopeBeanFactory.instance = new RegisteredScopeBeanFactory();
		}

		return RegisteredScopeBeanFactory.instance;
	}

	private final Map<RootScope, RegisteredScopeBean> beans;

	/**
	 * Singleton Pattern
	 */
	protected RegisteredScopeBeanFactory() {
		this.beans = new TreeMap<RootScope, RegisteredScopeBean>();
	}

	/**
	 * Getter
	 * 
	 * @return The list of the managed search scope elements
	 */
	public Collection<RegisteredScopeBean> getAllRegisteredScopeBeans() {
		return this.beans.values();
	}

	/**
	 * Returns the list of all <code>RootScope</code> that are
	 * selected
	 * 
	 * @return A list of those <code>RootScope</code> instances that
	 *         are selected
	 */
	public List<RootScope> getAllSelectedScopes() {
		final List<RootScope> result = new ArrayList<RootScope>();

		for (final RegisteredScopeBean registeredScopeBean : this.getAllRegisteredScopeBeans()) {
			if (registeredScopeBean.isSelected()) {
				result.add(registeredScopeBean.getScope());
			}
		}

		return result;
	}

	/**
	 * Returns the bean to the given id If no such bean exists it will be
	 * generated and registered
	 * 
	 * @param scope
	 *            The scope of the bean to create
	 * @return The bean corresponding to the given id
	 */
	public RegisteredScopeBean getBean(final RootScope scope) {
		if (!this.beans.containsKey(scope)) {
			this.beans.put(	scope,
							new RegisteredScopeBean(scope));
		}

		return this.beans.get(scope);
	}
}

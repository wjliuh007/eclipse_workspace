/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Andreas Kalender -
 * initial API and implementation
 *******************************************************************************/
package net.sourceforge.docfetcher.webinterface.managedBeans;

import net.sourceforge.docfetcher.model.RootScope;

/**
 * Represents a selectable root scope inside the web interface
 * 
 * @author Andreas Kalender
 */
public class RegisteredScopeBean {

	private final RootScope scope;

	private boolean selected;

	/**
	 * Constructor
	 * 
	 * @param scope
	 *            The scope of this <code>RegisteredScopeBean</code>
	 */
	public RegisteredScopeBean(final RootScope scope) {
		this.scope = scope;
		this.selected = true;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public String getId() {
		return this.scope.toString();
	}

	/**
	 * Getter
	 * 
	 * @return the scope
	 */
	public RootScope getScope() {
		return this.scope;
	}

	/**
	 * Getter
	 * 
	 * @return the selected
	 */
	public boolean isSelected() {
		return this.selected;
	}

	/**
	 * Setter
	 * 
	 * @param selected
	 *            the selected to set
	 */
	public void setSelected(final boolean selected) {
		this.selected = selected;
	}

}

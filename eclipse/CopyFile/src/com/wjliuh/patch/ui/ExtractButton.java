package com.wjliuh.patch.ui;

import javax.swing.JButton;

public class ExtractButton extends JButton{

	private static final long serialVersionUID = -6290753687430559532L;

	public ExtractButton(String name,UI parent){
		super(name);
		this.parent = parent;
	}
	private UI parent;

	public UI getParent() {
		return parent;
	}

	public void setParent(UI parent) {
		this.parent = parent;
	}

}

package com.wjliuh.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
	JMenu menu = getMenuMenu("文件");
	JMenuItem createItemItem = new CreateIndexMenuItem();
	JMenuItem checkItemItem = new CheckIndexMenuItem();
	JMenu menu_1 = getMenuMenu("选项");
	JMenuItem menuItem_1 = new ConfigMenuItem();
	JMenu menu_2 = getMenuMenu("帮助");
	
	public MenuBar(){
		
		this.add(menu);
		
		menu.add(createItemItem);
		menu.addSeparator();
		menu.add(checkItemItem);
		
		this.add(menu_1);
		
		menu_1.add(menuItem_1);
		
		this.add(menu_2);
	}
	
	private JMenu getMenuMenu(String title) {
		return new JMenu(title);
	}
}

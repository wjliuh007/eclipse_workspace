package com.wjliuh.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

import com.wjliuh.enums.Img;

public class ConfigMenuItem extends JMenuItem implements ActionListener {

	public ConfigMenuItem(){
		super("设置");
		setIcon(new ImageIcon(Img.PREFERENCES.get()));
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

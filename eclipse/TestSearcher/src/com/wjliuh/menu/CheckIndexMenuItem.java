package com.wjliuh.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

import com.wjliuh.enums.Img;

public class CheckIndexMenuItem  extends JMenuItem implements ActionListener{

	private static final long serialVersionUID = 6444155959903461487L;
	
	public CheckIndexMenuItem(){
		super("查看索引");
		setIcon(new ImageIcon(Img.CHECK.get()));
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}

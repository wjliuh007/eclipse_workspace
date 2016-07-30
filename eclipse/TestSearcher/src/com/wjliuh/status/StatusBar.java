package com.wjliuh.status;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.wjliuh.enums.Img;

public class StatusBar extends JPanel {

	public StatusBar(){
	    JLabel status = new JLabel("状态:");
	    status.setIcon(new ImageIcon(Img.INFO.get()));
	    this.setLayout(new BorderLayout());
	    this.add(status,BorderLayout.LINE_START);
	}
}

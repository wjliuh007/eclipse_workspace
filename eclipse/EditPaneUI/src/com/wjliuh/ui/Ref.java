package com.wjliuh.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ref {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame = new JFrame("Cool TextField");
		mainFrame.setLayout(null);
		JButton jb = new JButton("ce");
		JTextField jf = new JTextField();
		jb.setBounds(80, 0, 20, 30);
		jb.setVisible(true);
		jf.setVisible(true);
		jf.add(jb);
		jf.setBounds(5, 50, 100, 30);
		mainFrame.getContentPane().add(jf);
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setBounds(100, 100, 200, 200);
	}

}
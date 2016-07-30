package com.wjliuh.ui;

import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class NewJTextField extends JTextField {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character c = new Character('k');
		c.equals('d');
		char[] cs = new char[]{'l','k'};
		char chr = 'k';
		System.out.println(c.equals(chr));

	}
	
	public void addKeyListener(KeyListener action){
		
	}

}

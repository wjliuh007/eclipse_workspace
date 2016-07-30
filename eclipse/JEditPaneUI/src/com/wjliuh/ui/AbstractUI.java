package com.wjliuh.ui;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public abstract class AbstractUI extends JFrame implements KeyListener{
	private static final long serialVersionUID = -563310596111195709L;

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
			doEnter(e);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	public abstract void doEnter(KeyEvent e);

}

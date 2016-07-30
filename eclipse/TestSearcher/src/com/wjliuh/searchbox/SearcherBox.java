package com.wjliuh.searchbox;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import com.wjliuh.itf.ISearchHandler;

public class SearcherBox extends JTextField implements KeyListener{

	private static final long serialVersionUID = 2460130095546049459L;
	private ISearchHandler parent;
	public SearcherBox(ISearchHandler parent){
		super();
		this.parent = parent;
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(KeyEvent.VK_ENTER == e.getKeyCode()){
			try {
				parent.handlerEvent(null);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(KeyEvent.VK_ENTER == e.getKeyCode()){
			System.out.println(this.getText());
		}
		
	}

}

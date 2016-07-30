package com.wjliuh.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class UI extends JFrame implements KeyListener{
	
	private static final long serialVersionUID = -812946978718104028L;
	
	JTextField textField = new JTextField();
	JScrollPane scrollPane = new JScrollPane();
	JEditorPane editorPane = new JEditorPane();
	
	public UI() {
		initUI();
	}

	private void initUI() {
		setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		
		add(textField, "cell 0 0,growx");
		textField.setColumns(10);
		
		
		add(scrollPane, "cell 0 1,grow");
		
		
		scrollPane.setViewportView(editorPane);
		setSize(400, 300);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UI ui = new UI();
		ui.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getSource()==textField){
			if(e.getKeyCode() ==KeyEvent.VK_ENTER){
				System.out.println(textField.getText());
			}
			
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==textField){
			if(e.getKeyCode() ==KeyEvent.VK_ENTER){
				System.out.println(textField.getText());
			}
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource()==textField){
			if(e.getKeyCode() ==KeyEvent.VK_ENTER){
				System.out.println(textField.getText());
			}
			
		}
		
	}

}
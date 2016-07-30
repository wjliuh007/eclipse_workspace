package com.wjliuh.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class UI extends JFrame{
	
	private static final long serialVersionUID = -812946978718104028L;
	
	private JTextField textField = new JTextField();
	private JScrollPane scrollPane = new JScrollPane();
	private JEditorPane editorPane = new JEditorPane();
	
	public UI() {
		getContentPane().setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		
		getContentPane().add(textField, "cell 0 0,growx");
		textField.setColumns(10);
		

		getContentPane().add(scrollPane, "cell 0 1,grow");
		
		
		scrollPane.setViewportView(editorPane);
		
		textField.addKeyListener(new java.awt.event.KeyAdapter() {  
            public void keyPressed(java.awt.event.KeyEvent evt) {  
            	if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            		editorPane.setText(textField.getText());  
            	}
            	
            }  
        });  
		setSize(400, 300);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UI ui = new UI();
		ui.setVisible(true);
	}



}

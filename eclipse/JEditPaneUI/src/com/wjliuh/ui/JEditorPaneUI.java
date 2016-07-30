package com.wjliuh.ui;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class JEditorPaneUI extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
	private static JTextField textField;
	private static JScrollPane scrollPane;
	private static JEditorPane editorPane;

	public JEditorPaneUI() {
		getContentPane().setLayout(new MigLayout("", "[grow]", "[][grow]"));

		textField = new JTextField();
		getContentPane().add(textField, "cell 0 0,growx");
		textField.setColumns(10);

		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 1,grow");

		editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		setSize(500, 300);
		this.addWindowListener(new WindowAdapter(){
		      public void windowClosing(WindowEvent evt) {
			        System.exit(0);
			      }
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				} 
				
			}
			
		});

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == textField) {
			editorPane.setText(textField.getText());
			editorPane.repaint();
			scrollPane.repaint();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

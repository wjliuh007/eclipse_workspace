package com.wjliuh.test;

import java.awt.FileDialog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class PopupFileDialog extends JDialog{

	private static final long serialVersionUID = 1L;
	
	public PopupFileDialog(){
		
		this.setSize(400, 300);
		
		new FileDialog(this).setVisible(true);
		
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				new PopupFileDialog().setVisible(true);
			}
		});

	}

}

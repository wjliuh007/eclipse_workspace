package com.wjliuh.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainUI extends JDialog {

	private static final long serialVersionUID = 5341959764292891222L;
	
	private UIPanel mainPanel;
	
	public MainUI(){
		this.setSize(500, 184);
		this.setLayout(new BorderLayout());
		this.add(getMainPanel(),BorderLayout.CENTER);
		
		initAction();
		
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
	}
	
	private void initAction() {
		//确定按钮事件
		getMainPanel().getOk().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//开始按钮事件
		getMainPanel().getStart().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
	}

	private UIPanel getMainPanel() {
		if(mainPanel == null){
			mainPanel = new UIPanel();
		}
		return mainPanel;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      SwingUtilities.invokeLater(new Runnable() {
	          public void run() {
	              try {
	                  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	              } catch (Exception ignore) {
	              }
	              
	              new MainUI().setVisible(true);
	          }
	      });

	}

}

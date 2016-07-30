package com.wjliuh.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class PrefrenceSize extends JDialog {

	public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                PrefrenceSize ircui = new PrefrenceSize();
                ircui.setVisible(true);
            }
        });
	}
	
	JScrollPane jp1;
	JPanel jp2;
	JPanel jp3;
	
	public PrefrenceSize(){
		jp1 = new JScrollPane(new JTree());
		jp1.setBorder(new LineBorder(Color.black));
		jp1.setPreferredSize(new Dimension(300,80));
		
		jp2 = new JPanel();
		jp2.setBorder(new LineBorder(Color.black));
		jp2.setPreferredSize(new Dimension(300,60));
		
		jp3 = new JPanel();
		jp3.setBorder(new LineBorder(Color.black));
		jp3.setPreferredSize(new Dimension(300,60));
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(jp1,BorderLayout.NORTH);
		getContentPane().add(jp2,BorderLayout.CENTER);
		getContentPane().add(jp3,BorderLayout.SOUTH);
		
		
		setSize(300, 200);
	}

}

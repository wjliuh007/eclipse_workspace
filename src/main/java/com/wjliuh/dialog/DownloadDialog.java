package com.wjliuh.dialog;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.wjliuh.action.ObtainPics;

public class DownloadDialog extends JDialog{

	JPanel jpt = new JPanel(new BorderLayout());
	JPanel jpb = new JPanel(new BorderLayout());
	JTextField jt = new JTextField(60);
	JButton jb = new JButton("开始");
	public DownloadDialog(){
		init();
		jpt.setSize(500,150);
		jpb.setSize(500,150);
		jpt.add(jt,BorderLayout.CENTER);
		jpb.add(jb, BorderLayout.CENTER);
		this.add(jpt,BorderLayout.CENTER);
		this.add(jpb,BorderLayout.SOUTH);
		this.setSize(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//		   JFileChooser c=new JFileChooser();
//		   c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		   c.showSaveDialog(this); 
		
	}
	
	private void init() {
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ObtainPics op = new ObtainPics();
				op.doObtainPic(jt.getText());
				jt.setText("");
				
			}
		});
		
	}

	public static void main(String[] args){
		new DownloadDialog();
	}
}

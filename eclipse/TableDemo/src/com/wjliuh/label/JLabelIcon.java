package com.wjliuh.label;


import java.awt.FlowLayout;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;


public class JLabelIcon extends JFrame{
	public JLabelIcon(){
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Icon icon = FileSystemView.getFileSystemView().getSystemIcon(new File("E:\\硕士论文\\李-开题报告.doc"));
		
		JLabel label1 = new JLabel("用户名：" ,icon,JLabel.LEFT);
		JLabel label2 = new JLabel("密     码：" , JLabel.LEFT);
		label2.setIcon(FileSystemView.getFileSystemView().getSystemIcon(new File("E:\\硕士论文\\李-开题报告.doc")));
		
		getContentPane().add(label1);
		getContentPane().add(label2);
	}

	public static void main(String[] args) {
		new JLabelIcon().setVisible(true);
	}

}

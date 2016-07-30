package com.wjliuh.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

import com.wjliuh.enums.Img;
import com.wjliuh.index.IndexConfigDialog;

public class CreateIndexMenuItem extends JMenuItem implements ActionListener{

	private static final long serialVersionUID = 1L;

	public CreateIndexMenuItem(){
		super("建索引");
		setIcon(new ImageIcon(Img.ADD.get()));
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		IndexConfigDialog dlg = new IndexConfigDialog();
		JFileChooser jf = new JFileChooser();
		jf.setDialogType(JFileChooser.OPEN_DIALOG);
		jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jf.setCurrentDirectory(new File("F:\\JDK"));
		jf.showOpenDialog(this);
		
		File file = jf.getSelectedFile();
		if(file==null){
			return;
		}
		dlg.getTextField().setText(file.getAbsolutePath());
		int result = dlg.showModal();
		if(result ==0){
			System.out.println(0);
		}
	}

	
}

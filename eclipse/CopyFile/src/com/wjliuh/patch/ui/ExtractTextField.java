package com.wjliuh.patch.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class ExtractTextField extends JTextField implements MouseListener{

	private static final long serialVersionUID = -2299601251436115134L;
	public ExtractTextField(UI parent){
		this.parent = parent;
		this.addMouseListener(this);
	}
	private UI parent;

	public UI getParent() {
		return parent;
	}

	public void setParent(UI parent) {
		this.parent = parent;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON3){
			JFileChooser jfc = new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    int returnVal = jfc.showOpenDialog(this);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	setText(jfc.getSelectedFile().getAbsolutePath());
		    }
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

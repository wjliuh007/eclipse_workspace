package com.wjliuh.searchbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.wjliuh.itf.ISearchHandler;

public class SearchBtn extends JButton implements ActionListener {

	private static final long serialVersionUID = -5450052536947237905L;
	
	private ISearchHandler parent;
	
	public SearchBtn(ISearchHandler parent){
		super("搜索");
		this.parent = parent;
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			parent.handlerEvent(e);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

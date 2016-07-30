package com.wjliuh.searchbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import com.wjliuh.itf.ISearchHandler;

public class SearchComBox<E> extends JComboBox<E> implements ActionListener {

	private static final long serialVersionUID = -4409922177279157757L;
	
	private ISearchHandler parent;
	
	public SearchComBox(ISearchHandler obj){
		super();
		parent = obj;
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

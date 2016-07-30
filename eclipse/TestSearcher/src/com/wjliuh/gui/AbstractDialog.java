package com.wjliuh.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class AbstractDialog extends JDialog{

	private static final long serialVersionUID = 8800681725934106430L;

	public AbstractDialog(){
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		    	  close();
		      }
		});
	}
	
	public void initUI(){
		
	}
	public void close() {
		if (!isShowing())
			return;
		this.setVisible(false);
		if (isModal() && getDefaultCloseOperation() == DISPOSE_ON_CLOSE) {
			destroy();
		}else{
			System.exit(0);
		}
	}
	
	public void destroy() {
		this.dispose();
	}
	
	public int showModal() {
		setModal(true);

		if (!isShowing()) {
			setLocationRelativeTo(getParent());
			show();
		}
		return getResult();
	}
	
	@Override
	public void show() {
		super.show();
	}
	
	private int m_nResult = 0;
	

	public int getResult() {
		return m_nResult;
	}

	public void setResult(int m_nResult) {
		this.m_nResult = m_nResult;
	}
}

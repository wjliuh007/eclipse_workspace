package com.wjliuh.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TSDialog extends JDialog {

	private static final long serialVersionUID = 7216471208393351623L;


	public TSDialog(){
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		    	  setResult(0);
		    	  close();
		      }
		});
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
                
                new TSDialog().setVisible(true);
            }
        });

	}

	private int m_nResult = 0;
	

	public int getResult() {
		return m_nResult;
	}

	public void setResult(int m_nResult) {
		this.m_nResult = m_nResult;
	}
	
	public void close() {
		if (!isShowing())
			return;
		this.setVisible(false);
		if (isModal() && getDefaultCloseOperation() == DISPOSE_ON_CLOSE) {
			destroy();
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
}

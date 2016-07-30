package com.wjliuh.ui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.wjliuh.service.Service;

public class UI extends JFrame implements KeyListener{

	private static final long serialVersionUID = -3677712419929722228L;

	JTextField jtf = new JTextField();
	
	JScrollPane jsp = new JScrollPane();
	JTextPane jtp = new JTextPane();
	JTextArea content = new JTextArea();
	private Service service;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UI ui = new UI();
		ui.setVisible(true);
	}
	
	public UI(){
		initUI();
		initData();
	}

	private void initData() {
		content.append(getService().read());
		
	}

	private void initUI() {
		setSize(300, 200);
		add(jtf,BorderLayout.NORTH);
		jtf.addKeyListener(this);
		jsp.setViewportView(content);
		add(jsp,BorderLayout.CENTER);
		content.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private Service getService(){
		if(service == null){
			service = new Service();
		}
		return service;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==jtf){
			if(e.getKeyCode() == KeyEvent.VK_ENTER) //判断按下的键是否是回车键
			   {  
				getService().insert(jtf.getText());
				content.setText(getService().read());
				jtf.setText("");
				content.repaint();
				jtf.repaint();
				JScrollBar vertical = jsp.getVerticalScrollBar();
				vertical.setValue(vertical.getMinimum());
				jsp.repaint();
			   }
		}

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

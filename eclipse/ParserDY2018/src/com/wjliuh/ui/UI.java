package com.wjliuh.ui;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.wjliuh.service.Service;

public class UI extends JFrame{
	private JTextField mainUrl;
	JButton stBtn = new JButton("开始");
	JScrollPane scrollPane = new JScrollPane();
	JTextArea resultList = new JTextArea();
	JButton button = new JButton("复制");
	Clipboard clipboard = getToolkit().getSystemClipboard();
	public UI() {
		initUI();
		initAction();
	}

	private void initAction() {
		stBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String url = mainUrl.getText();
				if(url== null || url.trim().length()==0){
					return;
				}
//				Service.doParser(url,resultList);
				Service.doParserUrl(url,resultList);
//				Service.doParserUrlFromFile(url,resultList);
				resultList.repaint();
				scrollPane.repaint();
			}
		});
		
	}


	private void initUI() {
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, stBtn, 696, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 16, SpringLayout.SOUTH, stBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -87, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, stBtn, -10, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 22, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, getContentPane());
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("主页面地址");
		springLayout.putConstraint(SpringLayout.NORTH, stBtn, -4, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 38, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 22, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		mainUrl = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, mainUrl, -6, SpringLayout.WEST, stBtn);
		springLayout.putConstraint(SpringLayout.NORTH, mainUrl, 35, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, mainUrl, 6, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(mainUrl);
		mainUrl.setColumns(10);
		getContentPane().add(stBtn);
		getContentPane().add(scrollPane);
		
		scrollPane.setViewportView(resultList);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, button, 16, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.EAST, button, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(resultList.getText()!=null){
	                StringSelection text = new StringSelection(resultList.getText());
	                clipboard.setContents(text,null);
				}
				
			}
		});
		this.setSize(795, 441);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		
		UI ui = new UI();
		ui.setVisible(true);

	}
}

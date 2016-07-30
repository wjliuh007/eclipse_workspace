package com.wjliuh.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JPanel;

import com.wjliuh.utils.NetUtils;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;

public class DisplayUI extends JFrame{
	public JTextField textField;
	public JButton btnNewButton;
	public JPanel panel;
	public DisplayUI() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent evt) {
				
		        try{
		        	DisplayUI.this.remove(panel);
		        }catch(Exception e){
		        }
		        panel = null;
		        Dimension newSize = evt.getComponent().getSize();
		        panel = new CustomImgPanel(newSize.getWidth(),newSize.getHeight(),"resource/meimei.jpg ");
		        getContentPane().add(panel);
			}
		});
		textField = new JTextField();
		textField.setColumns(10);
		
		btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				downloadImage((CustomImgPanel)panel);
			}
		});
	
		panel = new CustomImgPanel(800,600,"resource/meimei.jpg ");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}

	protected void downloadImage(CustomImgPanel imagePane) {
		InputStream in = null;
		try {
			HttpURLConnection myurlcon = NetUtils.getConnection(textField.getText());
			in = myurlcon.getInputStream();
			ImageInputStream iis = ImageIO.createImageInputStream(in);
	        Iterator<ImageReader> it = ImageIO.getImageReadersBySuffix("jpg");
	        
	        ImageReader reader = it.next();
	        reader.setInput(iis);
	        Image image = reader.read(0);
	        imagePane.images.put(textField.getText(), image);
	        imagePane.setImgPath(textField.getText());
	        imagePane.repaint();
		}catch(Exception e){
			
		}
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
	          }
	      });
//		MIcon icon = new MIcon(new ImageIcon("resource/meimei.jpg "));
//		JLabel label = new JLabel(icon);
		DisplayUI frame = new DisplayUI();
//		frame.panel.add(label);

//		frame.getContentPane().add(label,BorderLayout.CENTER);

		frame.setSize(800, 600);

		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}
}

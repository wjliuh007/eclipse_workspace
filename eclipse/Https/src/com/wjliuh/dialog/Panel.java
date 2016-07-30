package com.wjliuh.dialog;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Panel extends JPanel {
	ImageIcon icon;
	Image image;
	static String outout;
	JButton btnNewButton;
	JLabel lblNewLabel;
	private JTextField textField;
	public Panel(Image image){
		
		this.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][]"));
		
		icon = new ImageIcon();
		
		lblNewLabel = new JLabel("");
		this.add(lblNewLabel, "cell 0 2");
		lblNewLabel.setIcon(icon);
		
		textField = new JTextField();
		this.add(textField, "cell 4 2,growx");
		textField.setColumns(6);
		
		getButton();
		
		setImage(image);
		initData();
	}

	private void getButton() {
		btnNewButton = new JButton("refresh");
		this.add(btnNewButton, "cell 0 4");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				icon.setImage(getImage());
				lblNewLabel.setIcon(icon);
				lblNewLabel.repaint();
			}
		});
	}

    private void initData() {
		icon = new ImageIcon(getImage());
		lblNewLabel.setIcon(icon);
		
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
    
    
}

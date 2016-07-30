package com.geekcap.swingx;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class BoxFrame extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public BoxFrame() {
		
		JLabel lblNewLabel = new JLabel("New label");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		
		JButton btnNewButton = new JButton("New button");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(75)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tglbtnNewToggleButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
									.addComponent(chckbxNewCheckBox)
									.addGap(18)
									.addComponent(rdbtnNewRadioButton)))))
					.addGap(34))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(chckbxNewCheckBox))
					.addGap(39)
					.addComponent(tglbtnNewToggleButton)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

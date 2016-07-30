package com.wjliuh.ui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UIPanel extends JPanel {
	private static final long serialVersionUID = -2302761714124485779L;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton start;
	private JButton ok;

	public UIPanel() {
		setLayout(new MigLayout("", "[][][][grow]", "[][][][][][]"));

		lblNewLabel = new JLabel("");
		add(lblNewLabel, "cell 0 1");

		textField = new JTextField();
		add(textField, "cell 3 1,growx");
		textField.setColumns(10);

		start = new JButton("start");
		add(start, "cell 0 5");

		ok = new JButton("ok");
		add(ok, "cell 3 5");
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JButton getStart() {
		return start;
	}

	public JButton getOk() {
		return ok;
	}

}

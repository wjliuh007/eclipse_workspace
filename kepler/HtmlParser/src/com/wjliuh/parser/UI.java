package com.wjliuh.parser;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class UI extends JFrame {
	JLabel lblNewLabel = new JLabel("PM2.5指数：");
	public JLabel lblNewLabel_1 = new JLabel("");
	JLabel lblNewLabel_2 = new JLabel("New label");
	private final JScrollPane scrollPane = new JScrollPane();
	public UI() {
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, -215, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 66, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -35, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, 471,
				SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 138,
				SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -174,
				SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 146,
				SpringLayout.WEST, getContentPane());
		getContentPane().setLayout(springLayout);

		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 38,
				SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 66,
				SpringLayout.WEST, getContentPane());
		getContentPane().add(lblNewLabel);

		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 38,
				SpringLayout.NORTH, getContentPane());
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(lblNewLabel_2);
		setSize(600, 378);
		lblNewLabel_2.setText("<html><font color=blue><u>"+"郭文奇主持召开第三季度食品药品案情分析会");
		
		getContentPane().add(scrollPane);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("http://www.sfda.gov.cn/WS01/CL0048/137680.html"));
					lblNewLabel_2.setText("<html><font color=purple><u>"+"郭文奇主持召开第三季度食品药品案情分析会");
				} catch (Exception ex) {
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblNewLabel_2.setText("<html><font color=purple><u>"+"郭文奇主持召开第三季度食品药品案情分析会");
			}
		});
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		UI ui = new UI();
		AQIndexParser ap = new AQIndexParser();
		String pm = ap.parserIndex();
		ui.lblNewLabel_1.setText(pm);
		ui.setVisible(true);

	}
}


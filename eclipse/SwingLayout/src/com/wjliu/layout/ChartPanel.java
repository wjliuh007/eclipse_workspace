package com.wjliu.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class ChartPanel extends JDialog {
	public ChartPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(190);
		add(panel, BorderLayout.WEST);
		
		JButton btnDddd = new JButton("dddd");
		panel.add(btnDddd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setHgap(100);
		add(panel_1, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(70);
		add(panel_2, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
		pack();
	}

	/**
	 * @param args
	 */
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new ChartPanel().setVisible(true);
            }
        });
    }

}

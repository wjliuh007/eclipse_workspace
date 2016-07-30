package com.wjliu.layout;

import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import net.miginfocom.layout.AC;
import net.miginfocom.layout.CC;
import net.miginfocom.layout.LC;
import net.miginfocom.swing.MigLayout;

public class CardModel extends JDialog {
	private static final long serialVersionUID = -7812518653402437403L;

	public CardModel() {

		LC layC = new LC().fill().wrap();
		AC colC = new AC().align("right", 0).fill(1, 3).grow(100, 1, 3).align("right", 2).gap("15", 1);
		AC rowC = new AC().index(6).gap("15!").align("top").grow(100, 8);

		JPanel panel = createTabPanel(new MigLayout(layC, colC, rowC));// Makes the background gradient

		// References to text fields not stored to reduce code clutter.

		panel.add(new JLabel("Last Name"));
		panel.add(new JTextField());
		panel.add(new JLabel("First Name"));
		panel.add(new JTextField(),          new CC().wrap());
		panel.add(new JLabel("Phone"));
		panel.add(new JTextField());
		panel.add(new JLabel("Email"));
		panel.add(new JTextField());
		panel.add(new JLabel("Address 1"));
		panel.add(new JTextField(),          new CC().spanX().growX());
		panel.add(new JLabel("Address 2"));
		panel.add(new JTextField(),          new CC().spanX().growX());
		panel.add(new JLabel("City"));
		panel.add(new JTextField(),          new CC().wrap());
		panel.add(new JLabel("State"));
		panel.add(new JTextField());
		panel.add(new JLabel("Postal Code"));
		panel.add(new JTextField(10),        new CC().spanX(2).growX(0));
		panel.add(new JLabel("Country"));
		panel.add(new JTextField(),          new CC().wrap());

		panel.add(createButton("New"),        new CC().spanX(5).split(5).tag("other"));
		panel.add(createButton("Delete"),     new CC().tag("other"));
		panel.add(createButton("Edit"),       new CC().tag("other"));
		panel.add(createButton("Save"),       new CC().tag("other"));
		panel.add(createButton("Cancel"),     new CC().tag("cancel"));

//		tabbedPane.addTab("Layout Showdown (improved)", panel);
		add(panel);
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
		pack();
	}

	private JPanel createTabPanel(MigLayout migLayout) {
		
		return new JPanel(migLayout);
	}

	private Component createButton(String string) {
		return new JButton(string);
	}
	
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.apple.laf.AquaLookAndFeel");
                } catch (Exception ignore) {
                }
                
                new CardModel().setVisible(true);
            }
        });
    }

}

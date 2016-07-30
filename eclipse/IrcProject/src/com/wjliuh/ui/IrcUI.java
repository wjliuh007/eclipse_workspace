package com.wjliuh.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class IrcUI extends JDialog {

	private JLabel showIrcUp;
	private JLabel showIrc;
	private JLabel showIrcDown;

	public IrcUI() {
		setLocation(483, 50);
		setSize(400, 600);

		showIrcUp = new JLabel();
		// showIrcUp.setBounds(0, 0, 400, 275);
		showIrcUp.setPreferredSize(new Dimension(400, 275));

		showIrc = new JLabel();
		// showIrc.setBounds(0, 275, 400, 50);
		showIrc.setPreferredSize(new Dimension(400, 50));
		showIrc.setBackground(Color.green);
		showIrc.setOpaque(true);
		showIrc.setFont(new Font("华文行楷", 0, 30));
		showIrc.setText("asdjfkasdfjasdkfasdf");

		showIrcDown = new JLabel();
		// showIrcDown.setBounds(0, 325, 400, 275);
		showIrcDown.setPreferredSize(new Dimension(400, 275));

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(showIrcUp, BorderLayout.NORTH);
		getContentPane().add(showIrc, BorderLayout.CENTER);
		getContentPane().add(showIrcDown, BorderLayout.SOUTH);
		setFont();
	}

//	@Override
//	public void paint(Graphics g){
//	
//		Color c = new Color(0,255,255);
//		
//		Font f = new Font("方正姚体", Font.BOLD, 30);
//		g.setFont(f);
//		g.setColor(c);
//		g.drawString("这是测试字体颜色！", 100, 100);
//	}
	
	public void loadIrc() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				InputStream fis = IrcUI.class.getResourceAsStream("2005.lrc");
				BufferedReader reader = null;
				try {
					reader = new BufferedReader(new InputStreamReader(fis,
							"gbk"));
					String line = null;
					List<String> songIrc = new ArrayList<String>();
					Pattern p = Pattern.compile("(\\[.*\\])(.*)");
					Matcher m = null;

					while ((line = reader.readLine()) != null) {
						m = p.matcher(line);
						if (m.matches()) {
							String content = m.group(2);
							if (content != null && !"".equals(content)) {
								songIrc.add(content);
							}
						}
					}

					for (String s : songIrc) {
						showIrc.setText(s);
						repaint();
						Thread.currentThread().sleep(2000);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}).start();
	}

	public void setFont(){
		for(Font f:java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()){
			System.out.println(f);
			
		}
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (Exception ignore) {
				}

				IrcUI ircui = new IrcUI();
				ircui.setVisible(true);
				ircui.loadIrc();
			}
		});
	}
}

package com.wjliuh.ui;

import java.awt.*;

import java.awt.BorderLayout;

import java.awt.Component;

import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JButton;

import java.awt.image.*;

public class MIcon implements Icon {

	private BufferedImage i = null;

	private Icon icon = null;

	public MIcon(Icon icon) {

		this.icon = icon;

		// icon=new ImageIcon(i);

	}
	@Override
	public int getIconHeight() {

		return icon.getIconHeight();

	}
	@Override
	public int getIconWidth() {

		return icon.getIconWidth();

	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {

		float wid = c.getWidth();

		float hei = c.getHeight();

		int iconWid = icon.getIconWidth();

		int iconHei = icon.getIconHeight();

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,

		RenderingHints.VALUE_INTERPOLATION_BILINEAR);

		g2d.scale(wid / iconWid, hei / iconHei);

		icon.paintIcon(c, g2d, 0, 0);

	}

	public static void main(String[] args) {

		MIcon icon = new MIcon(new ImageIcon("resource/meimei.jpg "));

		JLabel label = new JLabel(icon);

		JFrame frame = new JFrame();

		frame.getContentPane().add(label, BorderLayout.CENTER);

//		 frame.getContentPane().add(new JButton("click"),BorderLayout.NORTH);

		frame.setSize(800, 600);

		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}
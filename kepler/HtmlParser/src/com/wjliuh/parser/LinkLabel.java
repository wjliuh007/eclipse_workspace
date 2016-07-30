package com.wjliuh.parser;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LinkLabel extends JLabel {
	private String title, url;
	private boolean isSupported;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LinkLabel(String title, String url) {
		this.title = title;
		this.url = url;
		try {
			this.isSupported = Desktop.isDesktopSupported()
					&& Desktop.getDesktop().isSupported(Desktop.Action.BROWSE);
		} catch (Exception e) {
			this.isSupported = false;
		}
		setText(false);
		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setText(isSupported);
				if (isSupported)
					setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			public void mouseExited(MouseEvent e) {
				setText(false);
			}

			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(
							new java.net.URI(LinkLabel.this.url));
				} catch (Exception ex) {
				}
			}
		});
	}

	private void setText(boolean b) {
		if (!b)
			setText("<html><font color=blue><u>" + title);
		else
			setText("<html><font color=red><u>" + title);
	}

	public static void main(String[] args) {
		JFrame jf = new JFrame("一个超链接实现的例子-志文工作室");
		JPanel jp = new JPanel();
		jp.add(new LinkLabel("志文工作室", "http://www.zhiwenweb.cn"));
		jf.setContentPane(jp);
		jf.pack();
		jf.setVisible(true);
	}
}
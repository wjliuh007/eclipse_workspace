package com.wjliuh.ui;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class AppDisplayUI1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public AppDisplayUI1() {
		Image image=null;
		try {
			image = ImageIO.read(this.getClass().getResource("/images/thunder.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setTitle("下载图片");
		this.setIconImage(image); 
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		this.add(new AppDisplayUI());
		this.setLocation(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setResizable(false);
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
                
                new AppDisplayUI1().setVisible(true);
            }
        });

	}

}

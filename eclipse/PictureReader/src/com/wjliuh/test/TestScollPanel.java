package com.wjliuh.test;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class TestScollPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JScrollPane jsp;
	int width;
	int height;
	public TestScollPanel(){
		Icon image = new ImageIcon("C:\\Users\\JIE\\Desktop\\image\\13.jpg");
		width = image.getIconWidth();
		height = image.getIconHeight();
		jsp = new JScrollPane(new JLabel(image));
		this.add(jsp);
		this.setSize(width+18, height+40);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    public static void main(String[] args) throws Exception{
//        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//设置皮肤
//        new TestScollPanel().setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new TestScollPanel().setVisible(true);
            }
        });
    }
}

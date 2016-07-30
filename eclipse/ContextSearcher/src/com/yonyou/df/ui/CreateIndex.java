package com.yonyou.df.ui;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CreateIndex extends JFrame{

	JFileChooser jfc;
	
	public CreateIndex(){
		jfc = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "JPG & GIF Images", "jpg", "gif");
	    jfc.setFileFilter(filter);
	    int returnVal = jfc.showOpenDialog(this);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	    		   jfc.getSelectedFile().getName());
	    }

	    this.setSize(300, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		
	}
	
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new CreateIndex().setVisible(true);
            }
        });
    }
}

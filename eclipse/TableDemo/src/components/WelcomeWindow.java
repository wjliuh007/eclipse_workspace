package components;

import java.awt.Dimension; 
import java.awt.Graphics; 
import java.awt.Image; 
import java.awt.Toolkit; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JWindow; 
/**
 *
 * @author Administrator
 */ 
public class WelcomeWindow extends JWindow { 
    private int duration; 
    Image ii; 
    int iconWidth = 800; 
    int iconHeight = 800; 
    public WelcomeWindow() { 
        ii = this.getToolkit().getImage("1418136640767.jpg"); 
        Dimension welcomeScreen = Toolkit.getDefaultToolkit().getScreenSize(); 
        int x = (welcomeScreen.width - iconWidth) / 2; 
        int y = (welcomeScreen.height - iconHeight) / 2; 
        this.setBounds(x, y, iconHeight, iconHeight); 
        this.setVisible(true); 
        this.toFront(); 
    } 
    public void showWelcomeWindow() { 
        try { 
            repaint(); 
            Thread.sleep(1000 * 1); 
        } catch (InterruptedException ex) { 
            Logger.getLogger(WelcomeWindow.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    } 
    public void showWeclomeWindowAndExit(){ 
        this.showWelcomeWindow(); 
        this.dispose(); 
    } 
    @Override 
    public void update(Graphics g){ 
        paint(g); 
    } 
    @Override 
    public void paint(Graphics g){ 
        g.drawImage(ii, 0, 0, this); 
    } 
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
//            	try {
//					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//				} catch (Exception e) {
//				}
                new WelcomeWindow().setVisible(true);
            }
        });
    }
}
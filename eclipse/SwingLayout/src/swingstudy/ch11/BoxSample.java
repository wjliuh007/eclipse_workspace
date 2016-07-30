package swingstudy.ch11;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
public class BoxSample {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Runnable runner = new Runnable() {
			public void run() {
				JFrame verticalFrame = new JFrame("Vertical");
				verticalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
				Box verticalBox = Box.createVerticalBox();
				verticalBox.add(new JLabel("Top"));
				verticalBox.add(new JTextField("Middle"));
				verticalBox.add(new JButton("Bottom"));
				verticalFrame.add(verticalBox, BorderLayout.CENTER);
				verticalFrame.setSize(150, 150);
				verticalFrame.setVisible(true);
 
				JFrame horizontalFrame = new JFrame("Horizontal");
				horizontalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
				Box horizontalBox = Box.createHorizontalBox();
				horizontalBox.add(new JLabel("Left"));
				horizontalBox.add(new JTextField("Middle"));
				horizontalBox.add(new JButton("Right"));
				horizontalFrame.add(horizontalBox, BorderLayout.CENTER);
				horizontalFrame.setSize(150, 150);
				horizontalFrame.setVisible(true);
			}
		};
 
		SwingUtilities.invokeLater(runner);
	}
 
}

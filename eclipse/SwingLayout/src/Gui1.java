

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTree;
import java.awt.FlowLayout;

public class Gui1 extends JFrame {
	private JTextField textField;

	public Gui1(){
		
		JSplitPane leftp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JScrollPane leftbottom = new JScrollPane();
		leftbottom.setBorder(new TitledBorder(""));
		leftp.setBottomComponent(leftbottom);
		
		JTree tree = new JTree();
		leftbottom.setViewportView(tree);
		leftp.setDividerSize(2);
		leftp.setDividerLocation(30);
		
		JSplitPane rightp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JPanel righttop = new JPanel();
		righttop.setBorder(new TitledBorder(""));
		JScrollPane rightbottom = new JScrollPane();
		rightbottom.setBorder(new TitledBorder(""));
		rightp.setTopComponent(righttop);
		righttop.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		righttop.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("search");
		righttop.add(btnNewButton, BorderLayout.EAST);
		rightp.setBottomComponent(rightbottom);
		rightp.setDividerSize(2);
		rightp.setDividerLocation(30);
		
		
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setBorder(new TitledBorder(""));
		splitPane.setLeftComponent(leftp);
		splitPane.setRightComponent(rightp);
		splitPane.setSize(800, 600);
		splitPane.setDividerSize(2);
		splitPane.setDividerLocation(150);
		
		
		
		
		getContentPane().add(splitPane);
		setSize(800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("file");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmExit = new JMenuItem("exit");
		mnFile.add(mntmExit);
		
		JMenuItem mntmProperty = new JMenuItem("property");
		mnFile.add(mntmProperty);
		
		JMenu mnOption = new JMenu("option");
		menuBar.add(mnOption);
		
		JMenuItem mntmSet = new JMenuItem("set");
		mnOption.add(mntmSet);
		
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
				}
				new Gui1().setVisible(true);
				
			}
		});
	}
}

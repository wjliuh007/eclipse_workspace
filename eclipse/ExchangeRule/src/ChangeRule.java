import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;


public class ChangeRule extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel searchbar;
	JScrollPane treePane;
	JScrollPane resultPane;
	JPanel statusbar;
	/** 菜单区 */
	JMenuBar menuBar = new JMenuBar();
	private JTextField textField;
	private JButton button;
	public ChangeRule() {
		this.setSize(762, 552);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		getContentPane().setLayout(null);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("file");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("open");
		mnFile.add(mntmOpen);
		treePane = new JScrollPane(new JTree());
		treePane.setBounds(2, 0, 200, 470);
		treePane.setBorder(new TitledBorder(""));
		getContentPane().add(treePane);
		
		searchbar = new JPanel();
		searchbar.setBounds(204, 0, 550, 30);
		getContentPane().add(searchbar);
		searchbar.setBorder(new TitledBorder(""));
		searchbar.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		searchbar.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		button = new JButton("搜索");
		searchbar.add(button, BorderLayout.EAST);
		
		resultPane = new JScrollPane();
		resultPane.setBounds(204, 30, 550, 440);
		getContentPane().add(resultPane);
		resultPane.setBorder(new TitledBorder(""));
		
		statusbar = new JPanel();
		statusbar.setBounds(2, 470, 752, 30);
		getContentPane().add(statusbar);
		statusbar.setBorder(new TitledBorder(""));
	}

	
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				new ChangeRule().setVisible(true);
				
			}
		});
	}
}

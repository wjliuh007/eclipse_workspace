import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class Log extends JFrame {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Log().setVisible(true);
				
			}
		});
	}
	private JButton btLog;
	private JTextField tfUser;
	private JPasswordField tfPwd;
	private JCheckBox pwdKeep;
	private JComboBox adminType;

	public Log() {
		setLayout(null);
		this.setTitle("固定资产管理系统");
		super.setSize(366, 292);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centered(this);
		btLog = new JButton("登     录");
		btLog.setBounds(new Rectangle(93, 120, 80, 30));//参数分别是坐标x，y，宽，高
		this.setLayout(null);//设置布局管理器为空
		this.add(btLog);
		tfUser = new JTextField();
		tfUser.setBounds(new Rectangle(73, 15, 220, 25));
		this.add(tfUser);
		tfPwd = new JPasswordField();
		tfPwd.setBounds(new Rectangle(73, 50, 220, 25));
		this.add(tfPwd);
		pwdKeep = new JCheckBox("记住密码");
		pwdKeep.setBounds(new Rectangle(73, 85, 110, 25));
		
		this.add(pwdKeep);
		adminType = new JComboBox(new String[] { "普通职员", "管理员", "高级管理员" });
		adminType.setBounds(new Rectangle(193, 85, 100, 25));
		this.add(adminType);
		

	}
//布局居中方法
	public void centered(Container container) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int w = container.getWidth();
		int h = container.getHeight();
		container.setBounds((screenSize.width - w) / 2,
				(screenSize.height - h) / 2, w, h);
	}
}

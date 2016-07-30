package com.wjliu.layout;

import javax.swing.JDialog;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private JTextField loginname;
	private JPasswordField passwordField;
	public MyDialog() {
		this.setSize(240, 160);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel label = new JLabel("名称：");
		getContentPane().add(label, "4, 6");
		
		loginname = new JTextField();
		getContentPane().add(loginname, "6, 6, 3, 1, left, default");
		loginname.setColumns(26);
		
		JLabel label_1 = new JLabel("密码：");
		getContentPane().add(label_1, "4, 10");
		
		passwordField = new JPasswordField();
		passwordField.setColumns(26);
		getContentPane().add(passwordField, "6, 10, 3, 1, left, default");
		
		JButton loginBtn = new JButton("登录");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(loginBtn, "2, 14, 7, 1, center, default");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		/**获取屏幕的边界*/  
		Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());  
		/**获取底部任务栏高度*/  
		int taskBarHeight = screenInsets.bottom;//获取整个屏幕大小
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(((int)dim.getWidth()-getWidth())/2, ((int)dim.getHeight()-getHeight())/2);
	}
	
	public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new MyDialog().setVisible(true);
            }
        });
	}

}

package com.wjliuh.open;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.filechooser.FileSystemView;

public class UI extends JFrame {
	private JTextField textField;
	JButton btnNewButton;
	JButton btnNewButton_1;
	public UI() {
		setSize(520, 181);
		JLabel lblNewLabel = new JLabel("文件");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnNewButton = new JButton("浏览");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = null;
				if("".equals(textField.getText())||textField.getText() == null){
					jfc = new JFileChooser(FileSystemView.getFileSystemView());
				}else{
					jfc = new JFileChooser(textField.getText().substring(0, textField.getText().lastIndexOf("\\")));
				}
				
				jfc.showOpenDialog(UI.this);
				textField.setText(jfc.getSelectedFile().getAbsolutePath());
			}
		});
		
		btnNewButton_1 = new JButton("打开");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOpener.open(textField.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(31)
					.addComponent(btnNewButton_1)
					.addContainerGap(183, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });

	}
}

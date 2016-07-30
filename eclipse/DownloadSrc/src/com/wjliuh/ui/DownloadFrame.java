package com.wjliuh.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JDialog;
import net.miginfocom.swing.MigLayout;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.wjliuh.action.DownloadSrc;

public class DownloadFrame extends JDialog {
	private JTextField textUrl;
	private JTextField saveUrl;
	public DownloadFrame() {
		getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));
		
		JLabel labelUrl = new JLabel("地址");
		getContentPane().add(labelUrl, "cell 0 1,alignx trailing");
		
		textUrl = new JTextField();
		getContentPane().add(textUrl, "cell 1 1,growx");
		textUrl.setColumns(10);
		
		JLabel label = new JLabel("保存地址");
		getContentPane().add(label, "cell 0 3,alignx trailing");
		
		saveUrl = new JTextField();
		getContentPane().add(saveUrl, "flowx,cell 1 3,growx");
		saveUrl.setColumns(10);
		
		JButton btnOpenFile = new JButton("...");
		getContentPane().add(btnOpenFile, "cell 1 3,alignx right");
		
		btnOpenFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveUrl.setText(getSavePath());

			}
		});
		
		JButton start = new JButton("开始");
		getContentPane().add(start, "cell 1 7,alignx right");
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				beginDownload();
//				picRoomUrlTextBox.setText("");
			}


		});
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
		pack();
	}
	
	@SuppressWarnings("static-access")
	private void beginDownload() {
		String glodOutPath = null;
		glodOutPath = saveUrl.getText()+File.separator +System.currentTimeMillis() + ".png";
		DownloadSrc service= new DownloadSrc();
		service.getContext1(textUrl.getText(), glodOutPath);
		
	}
	/**
	 * 获取保存路径
	 */
	private String getSavePath() {
		
		JFrame f = new JFrame();
		JFileChooser c = new JFileChooser();
		c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if (JFileChooser.APPROVE_OPTION == c.showSaveDialog(f)) {
			return c.getSelectedFile().getAbsolutePath();
		}
		return null;
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
                
                new DownloadFrame().setVisible(true);
            }
        });

	}

}

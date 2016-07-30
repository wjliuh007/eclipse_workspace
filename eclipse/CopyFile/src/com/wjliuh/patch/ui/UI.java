package com.wjliuh.patch.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.wjliuh.service.PatchService;

public class UI extends JFrame {
	private static final long serialVersionUID = -7461256864463098938L;
	private JTextField prjDir;
	private JTextField patchDir;
	private JTextField modiCfg;
	private JButton extBtn;
	public UI() {
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		prjDir = new ExtractTextField(this);
		springLayout.putConstraint(SpringLayout.NORTH, prjDir, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, prjDir, 119, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, prjDir, -71, SpringLayout.EAST, getContentPane());
		getContentPane().add(prjDir);
		prjDir.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("工程目录：");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 13, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, -109, SpringLayout.WEST, prjDir);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, prjDir);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("补丁目录：");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 22, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		getContentPane().add(lblNewLabel_1);
		
		patchDir =  new ExtractTextField(this);
		springLayout.putConstraint(SpringLayout.NORTH, patchDir, 13, SpringLayout.SOUTH, prjDir);
		springLayout.putConstraint(SpringLayout.WEST, patchDir, 6, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, patchDir, -71, SpringLayout.EAST, getContentPane());
		getContentPane().add(patchDir);
		patchDir.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("归档文件目录：");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 18, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(lblNewLabel_2);
		
		modiCfg =  new ExtractTextField(this);
		springLayout.putConstraint(SpringLayout.NORTH, modiCfg, 12, SpringLayout.SOUTH, patchDir);
		springLayout.putConstraint(SpringLayout.WEST, modiCfg, 6, SpringLayout.EAST, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.EAST, modiCfg, -71, SpringLayout.EAST, getContentPane());
		getContentPane().add(modiCfg);
		modiCfg.setColumns(10);
		
		extBtn = new JButton("抽取");
		extBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PatchService service = new PatchService();
				service.doExtract(getPrjDir().getText(), getPatchDir().getText(), getModiCfg().getText());
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, extBtn, 18, SpringLayout.SOUTH, modiCfg);
		springLayout.putConstraint(SpringLayout.EAST, extBtn, 0, SpringLayout.EAST, prjDir);
		getContentPane().add(extBtn);
		setSize(537, 369);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
        		UI ui = new UI();
        		ui.setVisible(true);
            }
        });

	}

	public JTextField getPrjDir() {
		return prjDir;
	}

	public void setPrjDir(JTextField prjDir) {
		this.prjDir = prjDir;
	}

	public JTextField getPatchDir() {
		return patchDir;
	}

	public void setPatchDir(JTextField patchDir) {
		this.patchDir = patchDir;
	}

	public JTextField getModiCfg() {
		return modiCfg;
	}

	public void setModiCfg(JTextField modiCfg) {
		this.modiCfg = modiCfg;
	}
	
	
}

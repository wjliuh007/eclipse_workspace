package com.wjliuh.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class UI extends JFrame {
	public UI() {

		JLabel lblNewLabel = new JLabel("Base Salary");

		baseSalary = new JTextField();
		baseSalary.setColumns(10);

		JLabel label = new JLabel("Older Insure");
		label.setHorizontalAlignment(SwingConstants.RIGHT);

		yanglao = new JTextField();
		yanglao.setColumns(10);

		JLabel label_1 = new JLabel("Lose Job");

		JLabel label_2 = new JLabel("Pub Hurt");

		JLabel label_3 = new JLabel("Birth");

		JLabel label_4 = new JLabel("House");

		radioSalary = new JRadioButton("Salary Level");

		radioCustom = new JRadioButton("Custom");

		JLabel lblNewLabel_1 = new JLabel("Socity Point");

		salaryLevel = new JTextField();
		salaryLevel.setColumns(10);

		loseJob = new JTextField();
		loseJob.setColumns(10);

		pubHurt = new JTextField();
		pubHurt.setColumns(10);

		birth = new JTextField();
		birth.setColumns(10);

		house = new JTextField();
		house.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Actural");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);

		acturalIncome = new JTextField();
		acturalIncome.setColumns(10);

		button = new JButton("Calcuate");

		yiliao = new JTextField();
		yiliao.setColumns(10);

		lblNewLabel_3 = new JLabel("Medical Care");

		cutTax = new JLabel("Tax");

		tax = new JTextField();
		tax.setColumns(10);

		JLabel label_5 = new JLabel("Medical Income");

		cunzhe = new JTextField();
		cunzhe.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(16)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								label_4)
																						.addComponent(
																								label_3)
																						.addComponent(
																								label_2)
																						.addComponent(
																								label_1)
																						.addComponent(
																								lblNewLabel)
																						.addComponent(
																								lblNewLabel_3)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(10)
																										.addComponent(
																												label,
																												GroupLayout.PREFERRED_SIZE,
																												52,
																												GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING,
																								false)
																						.addComponent(
																								baseSalary)
																						.addComponent(
																								house)
																						.addComponent(
																								birth)
																						.addComponent(
																								pubHurt)
																						.addComponent(
																								loseJob)
																						.addComponent(
																								yiliao,
																								Alignment.TRAILING)
																						.addComponent(
																								yanglao,
																								GroupLayout.DEFAULT_SIZE,
																								166,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				71,
																				Short.MAX_VALUE)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING,
																								false)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												radioSalary)
																										.addGap(18)
																										.addComponent(
																												radioCustom))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.TRAILING)
																														.addComponent(
																																cutTax)
																														.addComponent(
																																lblNewLabel_1)
																														.addComponent(
																																label_5))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																salaryLevel,
																																Alignment.TRAILING)
																														.addComponent(
																																tax,
																																GroupLayout.DEFAULT_SIZE,
																																177,
																																Short.MAX_VALUE)
																														.addComponent(
																																cunzhe,
																																GroupLayout.DEFAULT_SIZE,
																																177,
																																Short.MAX_VALUE)))))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap(
																				513,
																				Short.MAX_VALUE)
																		.addComponent(
																				button))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(26)
																		.addComponent(
																				lblNewLabel_2,
																				GroupLayout.PREFERRED_SIZE,
																				54,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				acturalIncome,
																				GroupLayout.DEFAULT_SIZE,
																				504,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(22)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel)
														.addComponent(
																baseSalary,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label)
														.addComponent(
																yanglao,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																radioCustom)
														.addComponent(
																radioSalary))
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_1)
														.addComponent(
																salaryLevel,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblNewLabel_1)
														.addComponent(
																loseJob,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_2)
														.addComponent(
																pubHurt,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(label_5)
														.addComponent(
																cunzhe,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_3)
														.addComponent(
																birth,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_4)
														.addComponent(
																house,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																yiliao,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblNewLabel_3)
														.addComponent(cutTax)
														.addComponent(
																tax,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 29,
												Short.MAX_VALUE)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_2)
														.addComponent(
																acturalIncome,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18).addComponent(button)
										.addContainerGap()));
		getContentPane().setLayout(groupLayout);
		pack();
		initAction();
		addWindowListener(new WindowListenerImpl());
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width-getSize().width)/2, (screenSize.height-getSize().height)/2);
	}

	private void initAction() {
		radioSalary.setSelected(true);
		salaryLevel.setEditable(false);
		yanglao.setEditable(false);
		loseJob.setEditable(false);
		pubHurt.setEditable(false);
		birth.setEditable(false);
		house.setEditable(false);
		yiliao.setEditable(false);
		tax.setEditable(false);
		cunzhe.setEditable(false);
		initListener();
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcuate();
				UI.this.repaint();
			}

		});

	}

	private void initListener() {
		radioSalary.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				radioSalary.setSelected(true);
				salaryLevel.setEditable(false);
				radioCustom.setSelected(false);
			}

		});
		radioCustom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				radioCustom.setSelected(true);
				radioSalary.setSelected(false);
				salaryLevel.setEditable(true);
			}

		});

	}

	protected void calcuate() {
		Float baseSal = new Float("".equals(baseSalary.getText()) ? "0"
				: baseSalary.getText());
		Float cusLevel = new Float("".equals(salaryLevel.getText()) ? "0"
				: salaryLevel.getText());

		Float oter = null;
		if (radioSalary.isSelected()) {
			cusLevel = baseSal;
		}
		yanglao.setText(String.valueOf(cusLevel * 0.08));//养老
		yiliao.setText(String.valueOf(cusLevel * 0.02 + (float) 3.0));//医疗
		loseJob.setText(String.valueOf(cusLevel * 0.002));//失业
		pubHurt.setText(String.valueOf(cusLevel * 0.00));//意外伤害
		birth.setText(String.valueOf(cusLevel * 0.00));//生育
		house.setText(String.valueOf(baseSal * 0.12));//住房
		cunzhe.setText(String.valueOf(cusLevel * 0.028));//
		oter = (float) (cusLevel * 0.222 + (float) 3.0);
		Float base = baseSal - oter - (float) 3500;
		if (base < 1500) {
			acturalIncome.setText("小子，你别混了，喝西北风吧！");
		} else if (base < 4500 && base > 1500) {
			Float taxf = (float) (base * 0.10 - (float) 105.0);
			tax.setText(String.valueOf(taxf));
			acturalIncome.setText(String.valueOf(baseSal - oter - taxf));
		} else if (base < 9000 && base > 4500) {
			Float taxf = (float) (base * 0.20 - (float) 555.0);
			tax.setText(String.valueOf(taxf));
			acturalIncome.setText(String.valueOf(baseSal - oter - taxf));
		} else if (base < 35000 && base > 9000) {
			Float taxf = (float) (base * 0.25 - (float) 1005.0);
			tax.setText(String.valueOf(taxf));
			acturalIncome.setText(String.valueOf(baseSal - oter - taxf));
		} else {
			acturalIncome.setText("你太牛逼了，不用在我这算了！");
		}

	}

	private static final long serialVersionUID = -3677712419929722228L;

	private static Logger log = Logger.getLogger(UI.class.getName());
	private JTextField baseSalary;
	private JTextField yanglao;
	private JTextField salaryLevel;
	private JTextField loseJob;
	private JTextField pubHurt;
	private JTextField birth;
	private JTextField house;
	private JTextField acturalIncome;
	private JRadioButton radioSalary;
	private JRadioButton radioCustom;
	private JTextField yiliao;
	private JButton button;
	private JLabel lblNewLabel_3;
	private JLabel cutTax;
	private JTextField tax;
	private JTextField cunzhe;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (Exception ex) {
			log.log(Level.INFO, ex.getMessage());
		}

		new UI().setVisible(true);

	}
}

class WindowListenerImpl implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}

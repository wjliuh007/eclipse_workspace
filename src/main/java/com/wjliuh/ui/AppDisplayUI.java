package com.wjliuh.ui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

import net.miginfocom.swing.MigLayout;

import com.wjliuh.context.ApplicationContext;
import com.wjliuh.service.DownloadService;

public class AppDisplayUI extends JPanel {

	private static final long serialVersionUID = 1L;

	/** 图片库路径 */
	private JTextField picRoomUrlTextBox;
	/** 目标正则 */
	private JTextField targetRegTextBox;
	/** 保存路径 */
	private JTextField savePathTextBox;
	/** 开始按钮 */
	private JButton button;
	/** 进度条 */
	private JProgressBar progressBar;

	/** 保存路径按钮 */
	private JButton button_1;

	private JLabel label_3;
	private JLabel label_5;
	private JLabel label_4;
	private JLabel label_6;

	private Task task;

	private ApplicationContext context;
	private JLabel label_7;

	public AppDisplayUI() {
		context = ApplicationContext.getInstance();
		initUI();
		initAction();

	}

	/**
	 * 初始化UI
	 */
	private void initUI() {
		setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][][][][][]"));

		JLabel label = new JLabel("图片地址正则");
		add(label, "cell 0 1,alignx trailing");

		targetRegTextBox = new JTextField();
		add(targetRegTextBox, "cell 1 1,growx");
		targetRegTextBox.setColumns(50);

		label_5 = new JLabel("  ");
		add(label_5, "cell 0 2");

		JLabel label_1 = new JLabel("图片所在地址");
		add(label_1, "cell 0 4,alignx trailing");

		picRoomUrlTextBox = new JTextField();
		add(picRoomUrlTextBox, "cell 1 4,growx");
		picRoomUrlTextBox.setColumns(50);

		label_3 = new JLabel(" ");
		add(label_3, "flowx,cell 0 5");

		JLabel label_2 = new JLabel("文件保存地址");
		add(label_2, "cell 0 7,alignx trailing");

		savePathTextBox = new JTextField();
		savePathTextBox.setEditable(false);
		add(savePathTextBox, "flowx,cell 1 7,growx");
		savePathTextBox.setColumns(50);

		label_4 = new JLabel(" ");
		add(label_4, "cell 0 8");

		progressBar = new JProgressBar();
		add(progressBar, "cell 0 10 2 1,growx");

		label_6 = new JLabel(" ");
		add(label_6, "cell 0 11");

		label_7 = new JLabel("进度：");
		add(label_7, "cell 0 14");

		button = new JButton("开始");
		add(button, "cell 1 14,alignx right,aligny bottom");

		button_1 = new JButton("浏览");
		add(button_1, "cell 1 7,alignx left");
	}

	/**
	 * 初始化按钮动作
	 * 
	 * @param e
	 */
	private void initAction() {

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				beginDownload();
				// picRoomUrlTextBox.setText("");
			}
		});

		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				savePathTextBox.setText(getSavePath());

			}
		});

	}

	/**
	 * 开始执行下载
	 */
	private void beginDownload() {

		// 如果保存路径木有设置，设置保存路径
		if (null == savePathTextBox.getText() || "".equals(savePathTextBox.getText())) {
			savePathTextBox.setText(getSavePath());
		}

		context.getProperties().put("savePath", savePathTextBox.getText());// 文件保存路径
		context.getProperties().put("picRoomUrl", picRoomUrlTextBox.getText());// 图片库地址

		task = new Task();
		task.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if ("progress" == evt.getPropertyName()) {
					progressBar.setIndeterminate(false);
					int progress = (Integer) evt.getNewValue();
					progressBar.setValue(progress);
				}

			}
		});
		task.execute();
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

	class Task extends SwingWorker<Void, Void> {
		@Override
		public Void doInBackground() {
			progressBar.setIndeterminate(true);
			int progress = 0;
			int i = 0;
			DownloadService service = new DownloadService();
			progressBar.setValue(0);
			try {
				String glodOutPath = null;
				List<String> urls = service.getPageSrc((String) context.getProperties().get("picRoomUrl"));
				int tal = urls.size();
				while (i < tal && !isCancelled()) {
					glodOutPath = (String) context.getProperties().get("savePath") + File.separator
							+ System.currentTimeMillis() + ".jpg";
					service.getContext1(urls.get(i), glodOutPath);
					// CopyManager.manager(urls.get(i), glodOutPath);
					i++;
					progress = 100 * (i + 1) / tal;
					setProgress(progress);

				}
			} catch (Exception ignore) {

			}
			return null;
		}

		@Override
		public void done() {
			Toolkit.getDefaultToolkit().beep();
			progressBar.setValue(0);
		}
	}
}

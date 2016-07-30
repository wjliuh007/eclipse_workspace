package com.wjliuh.gui;

import java.awt.BorderLayout;

import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.wjliuh.enums.Img;
import com.wjliuh.menu.MenuBar;
import com.wjliuh.model.ResultTableModel;
import com.wjliuh.result.ResultTablePane;
import com.wjliuh.searchbox.Searchbar;
import com.wjliuh.status.StatusBar;

/**
 * 主页面
 * @author JIE
 *
 */
public class MainWindow extends AbstractDialog {

	private static final long serialVersionUID = 3742563814499366153L;
	
	/** 索引区*/
//	JScrollPane indexPanel = new IndexTreePanel();
	
	/** 菜单区 */
	JMenuBar menuBar = new MenuBar();
	
	/** 搜索栏 */
	Searchbar searchPanel = new Searchbar();
	
	/** 搜索结果区 */
	ResultTablePane resultPanel= new ResultTablePane();
	
	/** 状态栏 */
	StatusBar statusPanel = new StatusBar();
	
	public MainWindow(){
		super();
		String appName = "ThunderSeacher";
		setTitle(appName);
		
		setIconImage(Img.TS_32.get());
		
		initUI();
		
	}
	
	public void initUI(){
		
		setJMenuBar(menuBar);
		
//		add(indexPanel,BorderLayout.BEFORE_LINE_BEGINS);

		add(searchPanel, BorderLayout.NORTH);

	    add(resultPanel, BorderLayout.CENTER);

		add(statusPanel,BorderLayout.SOUTH);
		
		searchPanel.setContentTable(resultPanel.getTable());
		ResultTableModel model = new ResultTableModel();
		resultPanel.getTable().setModel(model);
		searchPanel.setModel(model);
		
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(960, 600);
		this.setLocation(230, 60);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				new MainWindow().setVisible(true);
			}
		});

	}

}



package com.wjliuh.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.TableColumn;

import com.wjliuh.enums.Img;
import com.wjliuh.index.IndexTreePanel;
import com.wjliuh.menu.MenuBar;
import com.wjliuh.model.ResultTableModel;
import com.wjliuh.result.ResultTablePane;
import com.wjliuh.searchbox.Searchbar;
import com.wjliuh.status.StatusBar;

public class MainUI extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/** 索引区*/
	JScrollPane indexPanel = new IndexTreePanel();
	
	/** 菜单区 */
	JMenuBar menuBar = new MenuBar();
	
	/** 搜索栏 */
	Searchbar searchPanel = new Searchbar();
	
	/** 搜索结果区 */
	ResultTablePane resultPanel= new ResultTablePane();
	
	/** 搜索结果模型 */
	ResultTableModel model = new ResultTableModel();
	
	/** 状态栏 */
	StatusBar statusPanel = new StatusBar();
	
	public MainUI(){
		String appName = "ThunderSeacher";
		setTitle(appName);
		
		setIconImage(Img.TS_32.get());
		
		initUI();
		
		addWindowListener(new WindowListenerImpl());//自定义关闭事件
		
	}
	
	public void initUI(){
		
		setJMenuBar(menuBar);
		
		add(indexPanel,BorderLayout.BEFORE_LINE_BEGINS);

		add(searchPanel, BorderLayout.NORTH);

	    add(resultPanel, BorderLayout.CENTER);

	    
		add(statusPanel,BorderLayout.SOUTH);
		
		resultPanel.getTable().setModel(model);
		
		searchPanel.setContentTable(resultPanel.getTable());		
		
		TableColumn tc = resultPanel.getTable().getColumnModel().getColumn(0);
		tc.setPreferredWidth(20);
		tc.setMaxWidth(20);
		tc.setMinWidth(20);
		
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
				
				
			}
		});
		
		new MainUI().setVisible(true);

	}

}

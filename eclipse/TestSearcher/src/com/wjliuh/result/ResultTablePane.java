package com.wjliuh.result;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ResultTablePane extends JScrollPane {
	JTable table = null;

	public ResultTablePane() {
		setVerticalScrollBarPolicy(20);
		setHorizontalScrollBarPolicy(30);
		this.table = new ResultTable();
		setViewport(createViewport());
		setColumnHeaderView(this.table.getTableHeader());
		getViewport().setBackingStoreEnabled(true);
		setViewportView(this.table);
//        this.setBorder(BorderFactory.createTitledBorder(null,"搜索结果", TitledBorder.DEFAULT_JUSTIFICATION,
//                TitledBorder.DEFAULT_POSITION, null, null));
	}

	public JTable getTable() {
		return this.table;
	}

	public void setTable(JTable table) {
		this.table = table;

//		setColumnHeaderView(table.getTableHeader());
		getViewport().setBackingStoreEnabled(true);
		setViewportView(table);
	}
}
package com.wjliuh.model;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import com.wjliuh.result.SearchResult;


public class ResultTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1969610268438153588L;
	
	JTable table;
	String[] colmnHeader = new String[]{"","位置","类型"};
	String[] colmnContent = new String[]{"name","path","type"};
	int[] colmnWidth = new int[]{6,120,120};
	List<SearchResult> vos = null;
	
	public ResultTableModel(){
	}
	
	public int[] getColmnWidth() {
		return colmnWidth;
	}

	public void setColmnWidth(int[] colmnWidth) {
		this.colmnWidth = colmnWidth;
	}

	@Override
	public int getRowCount() {
		return this.vos==null?0:this.vos.size();
	}
	
	@Override
	public String getColumnName(int col) {
		return colmnHeader[col];
	}

	@Override
	public int getColumnCount() {
		return colmnHeader.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object obj = null;
		SearchResult rs = vos.get(rowIndex);
		switch (columnIndex) {
		case 0:
			obj = rs.getName();
			break;
		case 1:
			obj = rs.getPath();
			break;
		case 2:
			obj = rs.getType();
			break;

		}
		return obj;
	}
	
	public boolean isCellEditable(int row, int col){
//		getTable().getColumnModel().getColumn(0).setCellEditor(new MyCellEditor(new JComboBox()));
		return false;
	}

	public void setVos(List<SearchResult> vos){
		this.vos = vos;
	}
	
	public List<SearchResult> getVos(){
		return this.vos;
	}

}

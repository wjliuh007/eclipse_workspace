package com.wjliuh.model;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1969610268438153588L;

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
	public Object getValueAt(int row, int col) {
		Data obj = this.vos.get(row);
		Object result = null;
		switch (col) {
		case 0:
			result = obj.getTitle();
			break;
		case 1:
			result = obj.getName();
			break;
		case 2:
			result = obj.getPath();
			break;

		}
		return result;
	}
	
	public Vector<Data> getVos() {
		return vos;
	}

	public void setVos(Vector<Data> vos) {
		this.vos = vos;
	}

	String[] colmnHeader = new String[]{"来源","过程","目的"};
	String[] colmnContent = new String[]{"src","produce","dest"};
	
	private Vector<Data> vos = null;
}

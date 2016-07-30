package com.wjliuh.table;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

import sun.awt.shell.ShellFolder;

import wj.javax.swing.table.DefaultTableCellRenderer;

/**
 * 背景表测试
 */

class BgTable extends JTable implements MouseMotionListener {

	private int mouseOnRowIndex = -1;

	public BgTable() {

		MyTableModel model = new MyTableModel();
		model.table = this;
		this.setModel(new MyTableModel());

		this.addMouseMotionListener(this);

		this.setShowHorizontalLines(false);
		this.setShowVerticalLines(false);
		this.setIntercellSpacing(new Dimension(0, 0));

		this.setRowHeight(20);
		Font font = new Font(null, 0, 14);
		this.setFont(font);

		this.setDefaultRenderer(Object.class, new MyTableCellTitleRenderer());
	}

	public void setMouseOnRowIndex(int mouseOnRowIndex) {
		this.mouseOnRowIndex = mouseOnRowIndex;
	}


	class MyTableCellTitleRenderer extends DefaultTableCellRenderer {
		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (row == BgTable.this.mouseOnRowIndex) {
				setBackground(new Color(173, 216, 230));
			} else {
				setBackground(null);
			}
			// 根据特定的单元格设置不同的Renderer,假如你要在第2行第3列显示图标
			if (column == 0) {
				try {
					ShellFolder sf = ShellFolder.getShellFolder(new File("E:\\硕士论文\\李-开题报告.doc"));
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Icon icon = FileSystemView.getFileSystemView().getSystemIcon(
						new File("E:\\硕士论文\\李-开题报告.doc"));

				JLabel label = new JLabel("用户名：", icon, JLabel.LEFT);
				label.setOpaque(false);
				return label;
			}
			return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		}
	}

	class MyTableModel extends AbstractTableModel {
		
		JTable table;
		@Override
		public int getRowCount() {
			return 6;
		}

		@Override
		public int getColumnCount() {
			return 3;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			return rowIndex + " - " + columnIndex;
		}
		
		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			table.getColumnModel().getColumn(0);
			return super.isCellEditable(rowIndex, columnIndex);
		}
		

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		BgTable table = (BgTable) e.getComponent();
		Point point = e.getPoint();
		int rowAtPoint = table.rowAtPoint(point);
		System.out.println(rowAtPoint);
		table.setMouseOnRowIndex(rowAtPoint);
		table.updateUI();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new BgTable());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}

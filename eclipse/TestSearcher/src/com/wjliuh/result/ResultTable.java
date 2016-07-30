package com.wjliuh.result;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import sun.awt.shell.ShellFolder;
import sun.swing.table.DefaultTableCellHeaderRenderer;

import com.wjliuh.model.ColorRenderer;

class ResultTable extends JTable implements MouseMotionListener {
	private static final long serialVersionUID = 1L;
	private int mouseOnRowIndex = -1;

	public ResultTable() {
		this.addMouseMotionListener(this);

		this.setShowHorizontalLines(false);
		this.setShowVerticalLines(false);
		this.setIntercellSpacing(new Dimension(0, 0));

		this.setRowHeight(20);
		Font font = new Font(null, 0, 12);
		this.setFont(font);

		 this.setDefaultRenderer(Object.class, new MyTableCellTitleRenderer());

		this.setDefaultRenderer(Color.class, new ColorRenderer(true));

		// 设置table表头居中
		DefaultTableCellHeaderRenderer thr = new DefaultTableCellHeaderRenderer();
		thr.setHorizontalAlignment(JLabel.CENTER);
		this.getTableHeader().setDefaultRenderer(thr);
//		TableColumn tc = this.getColumnModel().getColumn(0);
//		tc.setPreferredWidth(10);
//		tc.setMaxWidth(10);
//		tc.setMinWidth(10);

	}

	public void initStyle() {
		getColumnModel().getColumn(0).setPreferredWidth(6);
	}

	public void setMouseOnRowIndex(int mouseOnRowIndex) {
		this.mouseOnRowIndex = mouseOnRowIndex;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		ResultTable table = (ResultTable) e.getComponent();
		Point point = e.getPoint();
		int rowAtPoint = table.rowAtPoint(point);
		System.out.println(rowAtPoint);
		table.setMouseOnRowIndex(rowAtPoint);
		table.updateUI();
	}

	class MyTableCellTitleRenderer extends DefaultTableCellRenderer {
		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (row == ResultTable.this.mouseOnRowIndex) {
				setBackground(new Color(173, 216, 230));
			} else {
				setBackground(new Color(255, 255, 255));
			}

			if (column == 0) {
				try {
					 ShellFolder sf = ShellFolder.getShellFolder(new
					 File("D:\\java\\README.html"));
					 sf.getIcon(true);

//					SearchResult rs = vos.get(row);
					Icon icon = new ImageIcon(sf.getIcon(false), sf.getFolderType());//FileSystemView.getFileSystemView().getSystemIcon(new File(rs.getPath()));
					JLabel label = new JLabel("", icon, JLabel.LEFT);
					label.setOpaque(true);
					label.setForeground(new Color(173, 216, 230));

					return label;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public int setColumnWidth(int[] iWidth) {
		for (int i = 0; i < getColumnCount(); i++) {
			String sColumnName = getColumnName(i);
			if (i >= iWidth.length || iWidth[i] <= 0)
				super.getColumn(sColumnName).setPreferredWidth(10);
			else
				super.getColumn(sColumnName).setPreferredWidth(iWidth[i]);
		}
		return getColumnModel().getTotalColumnWidth();
	}
}
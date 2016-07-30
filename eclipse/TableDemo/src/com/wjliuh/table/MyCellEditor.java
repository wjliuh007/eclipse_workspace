package com.wjliuh.table;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Serializable;
import java.util.EventObject;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.TreeCellEditor;

public class MyCellEditor implements TableCellEditor, TreeCellEditor {
	protected EditorDelegate delegate;
	protected JComponent editorComponent;
	protected int clickCountToStart = 1;
	public MyCellEditor(JComboBox x) {
		this.editorComponent = x;
		this.delegate = new EditorDelegate() {
			public void setValue(Object x) {
				super.setValue(x);
				((JComboBox) editorComponent).setSelectedItem(x);
			}

			public Object getCellEditorValue() {
				return ((JComboBox) editorComponent).getSelectedItem();
			}

			public boolean startCellEditing(EventObject anEvent) {
				if (anEvent instanceof java.awt.AWTEvent) {
					return true;
				}
				return false;
			}

			public boolean stopCellEditing() {
				return true;
			}
		};
		((JComboBox) editorComponent).addItemListener(delegate);
	}
	@Override
	public Object getCellEditorValue() {
		return delegate.getCellEditorValue();
	}

	@Override
	public boolean isCellEditable(EventObject anEvent) {
		if (anEvent instanceof java.awt.event.MouseEvent) {
			if (((java.awt.event.MouseEvent) anEvent).getClickCount() < clickCountToStart)
				return false;
		}
		return delegate.isCellEditable(anEvent);
	}

	@Override
	public boolean shouldSelectCell(EventObject anEvent) {
		return false;
	}

	@Override
	public boolean stopCellEditing() {
		return false;
	}

	@Override
	public void cancelCellEditing() {
		
	}

	@Override
	public void addCellEditorListener(CellEditorListener l) {
		
	}

	@Override
	public void removeCellEditorListener(CellEditorListener l) {
		
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		return null;
	}

	@Override
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
		return null;
	}
		
		
	protected class EditorDelegate implements ActionListener, ItemListener,	Serializable {
		
		protected Object value;
		
		public Object getCellEditorValue() {
			return value;
		}
		
		public void setValue(Object x) {
			this.value = x;
		}
		
		public boolean isCellEditable(EventObject anEvent) {
			return true;
		}
		
		public boolean startCellEditing(EventObject anEvent) {
			return true;
		}
		
		public boolean stopCellEditing() {
			return true;
		}
		
		public void cancelCellEditing() {
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
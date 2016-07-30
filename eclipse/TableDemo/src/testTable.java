import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

import sun.swing.table.DefaultTableCellHeaderRenderer;

import com.wjliuh.model.MyTableModel;


public class testTable extends JDialog {
	
	private static final long serialVersionUID = 1L;
	JScrollPane jsp;
	MyTableModel model;
	JTable table;
	public testTable(){
		setSize(800, 400);
		table = new JTable();
		jsp = new JScrollPane();
		jsp.setViewportView(this.table);
		model = new MyTableModel();
	    // 设置table表头居中
	    DefaultTableCellHeaderRenderer thr = new DefaultTableCellHeaderRenderer();
	    thr.setHorizontalAlignment(JLabel.CENTER);
	    table.getTableHeader().setDefaultRenderer(thr);
	    // 设置table内容居中
	    DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
//	    tcr.setHorizontalAlignment(JLabel.CENTER);
	    table.setDefaultRenderer(Object.class, tcr);
	    table.setModel(model);
	    table.setRowHeight(20);
//	    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    table.setShowGrid(false);
	    table.setShowHorizontalLines(false);
	    table.setShowVerticalLines(false);
	    table.setOpaque(false);
	    Font f = new Font(null,0,15);
	    table.setFont(f);
//	    table.getSelectionModel().setSelectionInterval(0, 2);
	    JButton jb = new JButton("加数据");
	    add(jb);
	    add(jsp);
		addCloseEvent();
	}

	private void addCloseEvent() {
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
	}
	
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new testTable().setVisible(true);
            }
        });
    }
}

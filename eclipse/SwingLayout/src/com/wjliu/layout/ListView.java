package com.wjliu.layout;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

import sun.swing.table.DefaultTableCellHeaderRenderer;

import net.miginfocom.swing.MigLayout;

public class ListView extends JDialog {

	private static final long serialVersionUID = 7567915731058879201L;

	public ListView (){
		Image icon=null;
		try {
			icon = ImageIO.read(this.getClass().getResource("pumpkin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setTitle("GridModel");
		this.setIconImage(icon); 
		
		JPanel p1 = (JPanel) createPanel(new MigLayout("fill"));
		
		String[][] data = new String[80][6];
		for (int r = 0; r < data.length; r++) {
			data[r] = new String[6];
			for (int c = 0; c < data[r].length; c++)
		data[r][c] = "Cell " + (r + 1) + ", " + (c + 1);
		}
		JTable table = new JTable(data, new String[] {"Column 1", "Column 2", "Column 3", "Column 4", "Column 5", "Column 6"});
	    // 设置table表头居中
	    DefaultTableCellHeaderRenderer thr = new DefaultTableCellHeaderRenderer();
	    thr.setHorizontalAlignment(JLabel.CENTER);
	    table.getTableHeader().setDefaultRenderer(thr);
	    // 设置table内容居中
	    DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
	    tcr.setHorizontalAlignment(JLabel.CENTER);
	    table.setDefaultRenderer(Object.class, tcr);
		
		p1.add(new JScrollPane(table), "grow");
		
		add(p1);
		
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
		pack();
	}

	private JPanel createPanel(MigLayout migLayout) {
		return new JPanel(migLayout);
	}
	
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new ListView().setVisible(true);
            }
        });
    }
}

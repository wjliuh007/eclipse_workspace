package com.wjliu.layout;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

import sun.swing.table.DefaultTableCellHeaderRenderer;

import net.miginfocom.swing.MigLayout;

public class GridModel extends JDialog{

	public GridModel(){
		Image icon=null;
		try {
			icon = ImageIO.read(this.getClass().getResource("pumpkin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setTitle("GridModel");
		this.setIconImage(icon); 
		JTabbedPane tabbedPane = new JTabbedPane();

		JPanel p1 = (JPanel) createTabPanel(new MigLayout("fill"));

//		p1.add(createPanel("1. North"), "north");
//		p1.add(createPanel("2. West"), "west");
//		p1.add(createPanel("3. East"), "east");
//		p1.add(createPanel("4. South"), "south");

		String[][] data = new String[20][6];
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

		JPanel p2 = (JPanel) createTabPanel(new MigLayout("fill", "[c]", ""));

		p2.add(createPanel("1. North"), "north");
		p2.add(createPanel("2. North"), "north");
		p2.add(createPanel("3. West"), "west");
		p2.add(createPanel("4. West"), "west");
		p2.add(createPanel("5. South"), "south");
		p2.add(createPanel("6. East"), "east");
		p2.add(createButton("7. Normal"));
		p2.add(createButton("8. Normal"));
		p2.add(createButton("9. Normal"));

		JPanel p3 = (JPanel) createTabPanel(new MigLayout());

		p3.add(createPanel("1. North"), "north");
		p3.add(createPanel("2. South"), "south");
		p3.add(createPanel("3. West"), "west");
		p3.add(createPanel("4. East"), "east");
		p3.add(createButton("5. Normal"));

		JPanel p4 = (JPanel) createTabPanel(new MigLayout());

		p4.add(createPanel("1. North"), "north");
		p4.add(createPanel("2. North"), "north");
		p4.add(createPanel("3. West"), "west");
		p4.add(createPanel("4. West"), "west");
		p4.add(createPanel("5. South"), "south");
		p4.add(createPanel("6. East"), "east");
		p4.add(createButton("7. Normal"));
		p4.add(createButton("8. Normal"));
		p4.add(createButton("9. Normal"));

		JPanel p5 = (JPanel) createTabPanel(new MigLayout("fillx", "[c]", ""));

		p5.add(createPanel("1. North"), "north");
		p5.add(createPanel("2. North"), "north");
		p5.add(createPanel("3. West"), "west");
		p5.add(createPanel("4. West"), "west");
		p5.add(createPanel("5. South"), "south");
		p5.add(createPanel("6. East"), "east");
		p5.add(createButton("7. Normal"));
		p5.add(createButton("8. Normal"));
		p5.add(createButton("9. Normal"));

		JPanel p6 = (JPanel) createTabPanel(new MigLayout("fill", "", ""));

		Random rand = new Random();
		String[] sides = {"north", "east", "south", "west"};
		for (int i = 0; i < 20; i++) {
			int side = rand.nextInt(4);
			p6.add(createPanel((i + 1) + " " + sides[side]), sides[side]);
		}
		p6.add(createButton("I'm in the middle!"), "grow");

		tabbedPane.addTab("Docking 1 (fill)", p1);
		tabbedPane.addTab("Docking 2 (fill)", p2);
		tabbedPane.addTab("Docking 3", p3);
		tabbedPane.addTab("Docking 4", p4);
		tabbedPane.addTab("Docking 5 (fillx)", p5);
		tabbedPane.addTab("Docking Spiral", new JScrollPane(p6));
		add(tabbedPane);
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
		pack();
	}

	private Component createTabPanel(MigLayout migLayout) {
		return new JPanel(migLayout);
	}

	private Component createButton(String string) {
		return new JButton(string);
	}

	private Component createPanel(String string) {
		JButton jb = new JButton(string);
		jb.setEnabled(false);
		return jb;
	}
	
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new GridModel().setVisible(true);
            }
        });
    }
    //---------------------------------------------------
    

class MyCellRenderer extends DefaultTableCellRenderer {
 
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
       boolean hasFocus, int row, int column) {
     super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     setHorizontalAlignment(SwingConstants.CENTER);
     return this;
   }
 }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.wjliuh.model.Data;
import com.wjliuh.model.MyTableModel;


public class TablePaneDemo extends JFrame {
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	MyTableModel model;
	public TablePaneDemo() {
		scrollPane = new JScrollPane();
		table = new JTable();		
		btnNewButton = new JButton("New button");
		model = new MyTableModel();
		table.setModel(model);
		initUI();
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Vector<Data> vs = new Vector<Data>();
				for(int i=0;i<3;i++){
					Data d = new Data("title "+i,"name "+i,"path "+i);
					vs.add(d);
					
				}
				model.setVos(vs);
				model.fireTableDataChanged();
			}
		});
		
		
	}

	public void initUI() {
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JButton btnNewButton_3 = new JButton("New button");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(86)
							.addComponent(btnNewButton_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(this.table);
		getContentPane().setLayout(groupLayout);
		
		this.setSize(600, 500);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new TablePaneDemo().setVisible(true);
            }
        });

	}
}

package demo;  
 
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultTreeModel;
 
public class DemoMain   
{  
    public static void main(String[] args) throws Exception  
    {  
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame frame = new JFrame("CheckBoxTreeDemo");  
        frame.setBounds(200, 200, 400, 400);  
        JTree tree = new JTree();
        tree.setRowHeight(16);
        tree.expandPath(null);
        CheckBoxTreeNode rootNode = new CheckBoxTreeNode("索引");         
        ////-----------------
        List<TreeNode> tns = GetData.loopQueryNodes();
        for(TreeNode tn :tns) {
            CheckBoxTreeNode node = new CheckBoxTreeNode(tn.getName());  
            if(tn.getChildren().size()>0) {
        	for(TreeNode son:tn.getChildren()) {
        	    CheckBoxTreeNode sonnode = new CheckBoxTreeNode(son.getName()); 
        	    node.add(sonnode);
        	}
        	 
            }
            rootNode.add(node); 
        }
        
        ////-----------------
       
        DefaultTreeModel model = new DefaultTreeModel(rootNode);  
        tree.addMouseListener(new CheckBoxTreeNodeSelectionListener());  
        tree.setModel(model);  
        tree.setCellRenderer(new CheckBoxTreeCellRenderer());  
        JScrollPane scroll = new JScrollPane(tree);  
        scroll.setBounds(0, 0, 300, 320);  
        frame.getContentPane().add(scroll);  
          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
} 
package com.wjliuh.index;

import java.awt.HeadlessException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.tree.DefaultTreeModel;

import demo.CheckBoxTreeCellRenderer;
import demo.CheckBoxTreeNode;
import demo.CheckBoxTreeNodeSelectionListener;
import demo.GetData;
import demo.TreeNode;

public class IndexTreePanel extends JScrollPane {
	
	private static final long serialVersionUID = 1425360790833136334L;

	public IndexTreePanel() {
		init();
	}
	
	public void init(){
		try {
		    JTree tree = new JTree();
		    tree.setRowHeight(16);
		    tree.expandPath(null);
		    CheckBoxTreeNode rootNode = new CheckBoxTreeNode("索引");         
		    ////-----------------
		    List<TreeNode> tns = GetIndexFiles.getIndexList();
//		    GetData.close();
		    for(TreeNode tn :tns) {
		        CheckBoxTreeNode node = new CheckBoxTreeNode(tn.getName());  
		        if(tn.getChildren() !=null && tn.getChildren().size()>0) {
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
		    setViewportView(tree);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

}

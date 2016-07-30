/**
 * File ResourceTree.java
 * Date 2003-1-21
 * Time 15:29:37
 * 
 */

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class ResourceTree extends JFrame {
	private final JTree kernelTree;
	private final JScrollPane kernelScrollPane;

	public ResourceTree(String drive) {
		kernelTree = new JTree(this.createTreeModel(drive));
		kernelScrollPane = new JScrollPane(kernelTree);

		this.setLayout(new BorderLayout());
		this.add(kernelScrollPane, BorderLayout.CENTER);

		kernelTree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				TreePath path = e.getPath();
				Object[] objs = path.getPath();

				if (path != null) {
					System.out.println("Path: "
							+ objs[objs.length - 1].toString());
				}
			}
		});

		kernelTree.addTreeExpansionListener(new TreeExpansionListener() {
			public void treeCollapsed(TreeExpansionEvent e) {
				// do something
			}

			public void treeExpanded(TreeExpansionEvent e) {
				UpdateStatus us = new UpdateStatus(e);
				us.start();
			}

			class UpdateStatus extends Thread {
				private TreeExpansionEvent tee;

				UpdateStatus(TreeExpansionEvent e) {
					tee = e;
				}

				public void run() {
					System.out.println("Branch node is exploring......");

					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							TreePath path = tee.getPath();
							FileNode node = (FileNode) path
									.getLastPathComponent();

							if (!node.isExplored()) {
								DefaultTreeModel model = (DefaultTreeModel) kernelTree
										.getModel();

								node.explore();

								model.nodeStructureChanged(node);
							}

							System.out.println("Branch node explored.");
						}
					});
				}
			}
		});
	}

	public ResourceTree() {
		this(null);
	}

	private DefaultTreeModel createTreeModel() {
		return createTreeModel(null);
	}

	private DefaultTreeModel createTreeModel(String drive) {
		if (null == drive) {
			drive = "C:\\";
		}

		// 此处缺少字符串校验（正则表达式）

		File root = new File(drive);
		FileNode rootNode = new FileNode(root);

		rootNode.explore();

		return new DefaultTreeModel(rootNode);
	}
	
	public static void main(String[] args){
		ResourceTree rt = new ResourceTree();
		rt.setSize(300, 600);
		rt.setVisible(true);
	}
	
}
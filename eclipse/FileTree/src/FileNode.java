// Here are some key codes for your issue.
/**
 * File FileNode.java
 * Date 2003-1-21
 * Time 15:31:21
 * 
 */

import java.io.*;
import javax.swing.tree.*;

/*
 * FileNode类是DefaultMutableTreeNode的简单继承。
 * FileNode构造器将一个File对象制定为该TreeNode的用户对象(user object)。
 */
public class FileNode extends DefaultMutableTreeNode {
	private boolean explored = false;

	public FileNode(File file) {
		setUserObject(file);
	}

	/*
	 * 覆盖了DefaultMutableTreeNode.getAllowsChildren()方法。
	 * 如果FileNode代表的是目录，则允许有子节点。
	 */
	public boolean getAllowsChildren() {
		return isDirectory();
	}

	/*
	 * 覆盖了DefaultMutableTreeNode.isLeaf()方法。 如果FileNode代表的不是目录，那它就是一个叶子节点。
	 */
	public boolean isLeaf() {
		return !isDirectory();
	}

	public File getFile() {
		return (File) getUserObject();
	}

	public boolean isExplored() {
		return explored;
	}

	public boolean isDirectory() {
		File file = getFile();
		return file.isDirectory();
	}

	/*
	 * 覆盖了DefaultMutableTreeNode.toString()方法。 返回路径的最后组件。
	 */
	public String toString() {
		File file = (File) getUserObject();
		String filename = file.toString();
		int index = filename.lastIndexOf(File.separator);

		return (index != -1 && index != filename.length() - 1) ? filename
				.substring(index + 1) : filename;
	}

	public void explore() {
		if (!isDirectory()) {
			return;
		}

		if (!isExplored()) {
			File file = getFile();
			File[] children = file.listFiles();

			for (int i = 0; i < children.length; ++i) {
				add(new FileNode(children[i]));
			}

			explored = true;
		}
	}
}
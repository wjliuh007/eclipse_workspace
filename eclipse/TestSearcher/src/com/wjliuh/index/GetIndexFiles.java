package com.wjliuh.index;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.wjliuh.config.Config;

import demo.TreeNode;

public class GetIndexFiles {

    /**
     * @param args
     */
    public static void main(String[] args) {
	File file = new File(Config.INDEX_PATH);
	List<TreeNode> indexlist = new ArrayList<TreeNode>();
	for(String index:file.list()) {
	    indexlist.add(new TreeNode(null, index));
	}

    }

    public static List<TreeNode> getIndexList(){
	File file = new File(Config.INDEX_PATH);
	List<TreeNode> indexlist = new ArrayList<TreeNode>();
	for(String index:file.list()) {
	    indexlist.add(new TreeNode(null, index));
	}
	return indexlist;
    }
}

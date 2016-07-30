package demo;

import java.util.List;

public class TreeNode {

    private String code;
    private String name;
    private List<TreeNode> children;
    public TreeNode(String code,String name) {
	this.code = code;
	this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<TreeNode> getChildren() {
        return children;
    }
    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
    
    
}

package com.wjliuh.grab;

import java.util.logging.Logger;
import java.util.regex.Pattern;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeVisitor;

public class GrabVistor implements NodeVisitor {
	private String keyWord = null;
	private Pattern pattern;
    private StringBuilder accum = new StringBuilder(); // holds the accumulated text
    private GrabManager manager;
	Logger log;
    public GrabVistor(GrabManager manager,String keyWord){
    	this.manager = manager;
    	this.keyWord = keyWord;
    	pattern = Pattern.compile(keyWord);
    }
    
    public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public void head(Node node, int depth) {
        if (node instanceof TextNode){
        	String temp = ((TextNode) node).text();
        	if(pattern.matcher(temp).find()){
//        		append(temp).append(node.baseUri());
        		
        		System.out.println(temp);
        		System.out.println(node.baseUri());
        	}
        	
        }
    }

    public void tail(Node node, int depth) {
        String name = node.nodeName();
        if (name.equals("a")){
        	if(null != node.absUrl("href") && node.absUrl("href").length()>0){
        		manager.addLink(node.absUrl("href"));
        	}
        	
        }
        
            
    }
   
    @Override
    public String toString() {
        return accum.toString();
    }

}

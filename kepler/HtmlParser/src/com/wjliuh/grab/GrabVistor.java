package com.wjliuh.grab;

import java.util.logging.Level;
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
    	log = Logger.getLogger(GrabVistor.class.getName());
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
        		log.log(Level.INFO, String.format(" %s<%s>", node.baseUri(),temp));
        	}
        	
        }
    }

    public void tail(Node node, int depth) {
        String name = node.nodeName();
        String url = null;
        if (name.equals("a") && node.childNode(0) instanceof TextNode){
        	url = node.absUrl("href");
        	if(null != url && url.length()>0){
        		manager.addLink(url);
        	}
        	String temp = ((TextNode) node.childNode(0)).text();
        	if(pattern.matcher(temp).find()){
        		log.log(Level.INFO, String.format(" %s=>%s", temp,node.absUrl("href")));
        	}
        	
        }
    }
   
    @Override
    public String toString() {
        return accum.toString();
    }

}

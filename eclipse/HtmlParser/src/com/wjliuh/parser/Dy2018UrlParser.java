package com.wjliuh.parser;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class Dy2018UrlParser {
    private static final String userAgent = "Mozilla/5.0 (jsoup)";
    private static final int timeout = 5 * 1000;
    
    private static final String url = "http://www.dy2018.com/i/95783.html";
    
    
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Dy2018UrlParser dp = new Dy2018UrlParser();
		if(dp.parserUrl() !=null){
			for(String url :dp.parserUrl()){
				System.out.println(url);
			}
		}


	}
	public List<String> parserUrl() throws Exception{
        Document doc = Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get();
        Dy2018UrlVisitor visitor = new Dy2018UrlVisitor();
        NodeTraversor traversor = new NodeTraversor(visitor);
        traversor.traverse(doc); 
        
        return visitor.getUrlist();
	}

	private class Dy2018UrlVisitor implements NodeVisitor{

		List<String> urlist = new ArrayList<String>();
		
		public List<String> getUrlist() {
			return urlist;
		}

		private String result = null;
		
		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		@Override
		public void head(Node node, int depth) {
        	if("WORD-WRAP: break-word".equals(node.attr("style"))){
        		setResult(node.childNode(0).attr("href"));
        	}
			
		}

		@Override
		public void tail(Node node, int depth) {
        	if("WORD-WRAP: break-word".equals(node.attr("style"))){
        		urlist.add(getResult());
        		setResult(null);
        	}
		}
		
	}
}

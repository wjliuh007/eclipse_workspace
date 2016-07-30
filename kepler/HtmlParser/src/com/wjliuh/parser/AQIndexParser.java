package com.wjliuh.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class AQIndexParser {
    private static final String userAgent = "Mozilla/5.0 (jsoup)";
    private static final int timeout = 5 * 1000;
    
    private static final String url = "http://www.cpm25.com/101010100/city.html";

	public String parserIndex() throws Exception{
        Document doc = Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get();
        AQIndexVisitor visitor = new AQIndexVisitor();
        NodeTraversor traversor = new NodeTraversor(visitor);
        traversor.traverse(doc); 
        
        return visitor.getResult();
	}
	
	public static void main(String[] args) throws Exception{
		AQIndexParser aqip = new AQIndexParser();
		System.out.println("PM2.5指数："+aqip.parserIndex().trim());
	}

	private class AQIndexVisitor implements NodeVisitor{

		private String result = null;
		
		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		@Override
		public void head(Node node, int depth) {
        	if("font-size:100px;font-weight:bold;color:#fff;margin-left:20px;width:160px;float:left;".equals(node.attr("style"))){
        		setResult(node.childNode(0).outerHtml());
        	}
			
		}

		@Override
		public void tail(Node node, int depth) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

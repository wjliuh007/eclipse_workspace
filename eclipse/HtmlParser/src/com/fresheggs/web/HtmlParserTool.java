package com.fresheggs.web;

import java.util.HashSet;
import java.util.Set;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

//本类创建用于HTML文件解释工具
public class HtmlParserTool {

	// 本方法用于提取某个html文档中内嵌的链接
	public static Set<String> extractLinks(String url, LinkFilter filter) {
		Set<String> links = new HashSet<String>();
		try {
			// 1、构造一个Parser，并设置相关的属性
			Parser parser = new Parser(url);
			parser.setEncoding("gb2312");

			//2.2、创建第二个Filter，过滤<a>标签
			NodeFilter aNodeFilter = new NodeClassFilter(Div.class);
			
	
			//3、使用parser根据filter来取得所有符合条件的节点
			NodeList nodeList = parser.extractAllNodesThatMatch(aNodeFilter);
			
			//4、对取得的Node进行处理
			for(int i = 0; i<nodeList.size();i++){
				Node node = nodeList.elementAt(i);
				String linkURL = "";
				//如果链接类型为<a />
				if(node instanceof LinkTag){
					LinkTag link = (LinkTag)node;
					linkURL= link.getLink();
				}else{
					//如果类型为<frame />
					String nodeText = node.getText();
					int beginPosition = nodeText.indexOf("src=");
					nodeText = nodeText.substring(beginPosition);
					int endPosition = nodeText.indexOf(" ");
					if(endPosition == -1){
						endPosition = nodeText.indexOf(">");
					}
					linkURL = nodeText.substring(5, endPosition - 1);
				}

			}
			
		} catch (ParserException e) {
			e.printStackTrace();
		}
		return links;
	}
}

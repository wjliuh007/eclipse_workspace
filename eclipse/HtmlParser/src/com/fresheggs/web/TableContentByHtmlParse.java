	
package com.fresheggs.web;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;

public final class TableContentByHtmlParse {
	
	
	
	public Element getTableContent(Element element,int rows,int cols)
	{
		Element resultElement=null;
		List<Element> trList=element.getAllElements(HTMLElementName.DIV);
		if(rows<trList.size())
		{
			Element trElement=trList.get(rows);
			List<Element> tdList=trElement.getAllElements(HTMLElementName.TD);
			if(cols<tdList.size())
			{
				//Element tdElement=tdList.get(cols);
				resultElement=tdList.get(cols);
			}
			
		}
		
		return resultElement;
	}
	
	public static void test(String url)
	{
		Source source=null;
		try
		{
			source=new Source(new URL(url));
		
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		List<Element> elementList=source.getAllElements(HTMLElementName.SPAN);
		for(Element element:elementList)
		{
			if("PriPollutant".equals(element.getAttributeValue("id"))){
				System.out.println(element.getContent().toString());
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		HttpURLConnection myurlcon = (HttpURLConnection)(new URL("http://zx.bjmemc.com.cn/web/index.aspx")).openConnection();
		myurlcon.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		Parser parser = new Parser("http://zx.bjmemc.com.cn/web/index.aspx");
		parser.setEncoding("gb2312");
		//2.2、创建第二个Filter，过滤<a>标签
		NodeFilter aNodeFilter = new NodeClassFilter(Div.class);
		

		//3、使用parser根据filter来取得所有符合条件的节点
		NodeList nodeList = parser.extractAllNodesThatMatch(aNodeFilter);
		for(int i = 0; i<nodeList.size();i++){
			Node node = nodeList.elementAt(i);
			String linkURL = "";
			//如果链接类型为<a />
			if(node instanceof Div){
				Div div = (Div)node;
				if("r-content".equals(div.getAttribute("class"))){
					NodeList childs = div.getChildren();
				}
//				
			}
		}
	}

}



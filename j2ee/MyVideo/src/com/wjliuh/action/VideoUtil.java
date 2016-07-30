package com.wjliuh.action;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class VideoUtil {

	public static void main(String[] args){
		StringBuffer sb = getHtmlSrc("http://v.youku.com/v_show/id_XODExMzkwODM2_ev_1.html?from=y1.3-idx-grid-1519-9909.86808-86807.1-1");
		Document doc = Jsoup.parse(sb.toString());
		Element elemtn = doc.getElementById("panel_share");
		Elements Element = elemtn.getElementsByClass("item");
		
		int i=1;
		for(Element ele:Element){
			Element e = ele.getElementById("link"+i);
			if(null != e){
				System.out.println(e.val());
			}
			
			
			i++;
		}
		
		
		
//		System.out.println(sb.toString());
	}

	private static StringBuffer getHtmlSrc(String htmlurl) {
		URL url = null;
		FileOutputStream out = null;
		InputStream in = null;
		StringBuffer sb = new StringBuffer();
		try {
			url = new URL(htmlurl);
		
			in = url.openStream();
		
		
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String t = "";
			Matcher m = null;
			while ((t = br.readLine()) != null) {
				sb.append(t).append("\n");
//				out = new FileOutputStream("F:\\YOUKU.txt");
//				// 用输出流out，输出到指定位置
//				byte[] buffer = new byte[1024];
//				int bytes_read;
//				while ((bytes_read = in.read(buffer)) != -1) {
//					out.write(buffer, 0, bytes_read);
//				}
				
				
				
				
//				m = pattern.matcher(t);
//				if (m.find()) {
//					urllist.add(m.group());
//					int index = m.end();
//					while (m.find(index)) {
//						urllist.add(m.group());
//						index = m.end();
//					}
//
//				}

			}
		
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e) {
			}
		}
		return sb;
	}
}

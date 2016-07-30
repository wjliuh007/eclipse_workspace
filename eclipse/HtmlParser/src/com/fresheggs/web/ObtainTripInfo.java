package com.fresheggs.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ObtainTripInfo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect("http://www.sfda.gov.cn/WS01/CL0004/").get();
		Elements divs = doc.select("[target=_blank]");
		FileOutputStream fof = new FileOutputStream(new File("C:\\Users\\JIE\\Desktop\\a.txt"));
		StringBuilder sb = new StringBuilder();
		for(Element el:divs){
			if(el.children().size()>0){
				System.out.print(el.absUrl("href"));
				System.out.println(el.children().get(0).html());
			}
			
			sb.append(el.html());
		}
		fof.write(sb.toString().getBytes());
		fof.flush();
		fof.close();
	}

}

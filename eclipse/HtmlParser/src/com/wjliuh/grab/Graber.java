package com.wjliuh.grab;

import java.io.IOException;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.select.NodeTraversor;

public class Graber {
	private static final String userAgent = "Mozilla/5.0 (jsoup)";
	private static final int timeout = 5 * 1000;
	private static String cacheUrl=null;

	public static void main(String[] args) throws IOException {
		GrabManager manager = GrabManager.getInstance();
		manager.addLink(args[0]);
		String keyWord = args[1];
		GrabVistor visitor = new GrabVistor(manager, keyWord);
		NodeTraversor traversor = new NodeTraversor(visitor);
		String url = null;

			while (manager.getLinks().size()>0) {
				try{
					url = manager.getLink();
					if(null !=url && !url.equals(cacheUrl)){
						System.out.println(url+"开始抓取：******");
						traversor.traverse(Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get());
						cacheUrl = url;
					}
					
				}catch(IOException io){
					System.out.println("error");
					continue;
				}catch(Exception ex){
					System.out.println("error");
					ex.printStackTrace();
				}
			}



	}
}

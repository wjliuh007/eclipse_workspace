package com.wjliuh.utils;

import java.net.HttpURLConnection;
import java.net.URL;

public class NetUtils {
	private static HttpURLConnection myurlcon = null;
	
	/**
	 * 获取网络连接，此处HttpURLConnection和URLConnection效果是一样的
	 * @param newUrl
	 * @return
	 */
	public static HttpURLConnection getConnection(String newUrl){
		try {
			myurlcon = (HttpURLConnection)(new URL(newUrl)).openConnection();
			myurlcon.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myurlcon;
	}
}

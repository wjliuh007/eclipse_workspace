package com.wjliuh.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseUrl {

	private static final String FILE_PATH = "F:\\url\\url1.txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getUrl("F:\\url.txt");
//		findPicURL("jpg");
		List<String> list = getPageSrc("http://www.2pxpx.com/article/article_561300.html");
		System.out.println(Arrays.asList(list));
	}

	public static List<String> getUrl(String filePath) {
		List<String> urlList = new ArrayList<String>();
		// Matcher m =
		Pattern p = Pattern.compile("http\\:\\/\\/imgserver2.*.{1}jpg");
		Matcher m = null;
		String encoding = "utf-8";
		File file = new File(filePath);
		try {
			if (file.isFile() && file.exists()) { // 判断文件是否存在

				InputStreamReader read = new InputStreamReader(

				new FileInputStream(file), encoding);// 考虑到编码格式

				BufferedReader bufferedReader = new BufferedReader(read);

				String lineTxt = null;

				while ((lineTxt = bufferedReader.readLine()) != null) {

					m = p.matcher(lineTxt);
					if (m.find()) {
						// System.out.println(m.group());
						urlList.add(m.group());
					}

				}

				read.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urlList;
	}

	/**
	 * 获取图片URL 类似于http://xxxx.xxxx.xxxx/xxx/xxx/xx/x/xxx.jpg的url
	 * 
	 * @param suffix
	 *            后缀名，图片格式
	 */
	public static void findPicURL(String suffix) {

		// 拼接图片的URL
		// 严谨的[a-z0-9]+\\:(//)(\\S)*
		// 不严谨的(\\w){4}\\:(//)(\\S)*
		StringBuilder urlRegexExp = new StringBuilder("[a-z0-9]+\\:(//)(\\S)*");// 图片的URI地址和名称
		urlRegexExp.append("(").append(suffix).append(")");// 拼接图片格式

		Pattern pattern = Pattern.compile(urlRegexExp.toString());
		BufferedReader br = null;
		Matcher m = null;
		try {
			br = new BufferedReader(new FileReader(new File(FILE_PATH)));
			String t = "";

			while ((t = br.readLine()) != null) {

				m = pattern.matcher(t);
				if (m.find()) {
					System.out.println(m.group());
					int index = m.end();
					while (m.find(index)) {
						System.out.println(m.group());
						index = m.end();
					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 根据网址获取页面上的图片链接
	 * @param url
	 * @return
	 */
	public static List<String> getPageSrc(String url){
		List<String> urllist = new ArrayList<String>();
		// 拼接图片的URL
		// 严谨的[a-z0-9]+\\:(//)(\\S)*
		// 不严谨的(\\w){4}\\:(//)(\\S)*
		StringBuilder urlRegexExp = new StringBuilder("[a-z0-9]+\\:(//)(\\S)*");// 图片的URI地址和名称
		urlRegexExp.append("(").append("jpg").append(")");// 拼接图片格式

		Pattern pattern = Pattern.compile(urlRegexExp.toString());
		BufferedReader br = null;
		HttpURLConnection myurlcon = null;
		try {
			myurlcon = (HttpURLConnection)(new URL(url)).openConnection();
			myurlcon.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

			InputStream in = myurlcon.getInputStream();
			
			
			
			br = new BufferedReader(new InputStreamReader(in));
			String t = "";
			Matcher m = null;
			while ((t = br.readLine()) != null) {

				m = pattern.matcher(t);
				if (m.find()) {
					urllist.add(m.group());
					int index = m.end();
					while (m.find(index)) {
						urllist.add(m.group());
						index = m.end();
					}

				}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return urllist;
	}
}

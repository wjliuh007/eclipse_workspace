package com.wjliuh.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextArea;

public class Service {
	private static HttpURLConnection myurlcon = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void doParser(String url, JTextArea result) {
		List<String> urllist = new ArrayList<String>();
		// 拼接图片的URL
		// 严谨的[a-z0-9]+\\:(//)(\\S)*
		// 不严谨的(\\w){4}\\:(//)(\\S)*
		String reg = "<a.*?href=\"(.*?)\">";
		Pattern pattern = Pattern.compile(reg);
		BufferedReader br = null;
		HttpURLConnection myurlcon = null;
		try {
			myurlcon = getConnection(url);
			InputStream in = myurlcon.getInputStream();

			br = new BufferedReader(new InputStreamReader(in, "GBK"));
			String t = "";
			Matcher m = null;
			String str = null;
			while ((t = br.readLine()) != null) {

				m = pattern.matcher(t);
				if (m.find()) {

					str = m.group(1);
					if (str.indexOf("ftp") >= 0) {
						appendUrl(str, result);
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

	public static void doParserUrl(String url, JTextArea result) {
		List<String> urllist = new ArrayList<String>();
		// 拼接图片的URL
		// 严谨的[a-z0-9]+\\:(//)(\\S)*
		// 不严谨的(\\w){4}\\:(//)(\\S)*
		String reg = "<a.*?href=\"(.*?)\"";
		String name = "<a[^>]*>([^<]*)</a>";
		Pattern pattern = Pattern.compile(reg);
		Pattern namePattern = Pattern.compile(name);
		BufferedReader br = null;
		HttpURLConnection myurlcon = null;
		try {
			myurlcon = getConnection(url);
			InputStream in = myurlcon.getInputStream();

			br = new BufferedReader(new InputStreamReader(in, "GBK"));
			String t = "";
			Matcher m = null;
			Matcher mname = null;
			String str = null;
			while ((t = br.readLine()) != null) {

				m = pattern.matcher(t);
				if (m.find()) {

					str = m.group(1);
					if(!str.startsWith("thunder:")){
						continue;
					}
					appendUrl(str,result);
				}
				mname = namePattern.matcher(t);
				if (mname.find()) {
					str = mname.group(1);
					appendUrl(str,result);
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

	public static void doParserUrlFromFile(String filename, JTextArea result) {
		List<String> urllist = new ArrayList<String>();
		// 拼接图片的URL
		// 严谨的[a-z0-9]+\\:(//)(\\S)*
		// 不严谨的(\\w){4}\\:(//)(\\S)*
		String reg = "<a.*?href=\"(.*?)\"";
		String name = "<a[^>]*>([^<]*)</a>";
		Pattern pattern = Pattern.compile(reg);
		Pattern namePattern = Pattern.compile(name);
		BufferedReader br = null;
		HttpURLConnection myurlcon = null;
		try {
			File file = new File(filename);
			InputStream in = new FileInputStream(file);

			br = new BufferedReader(new InputStreamReader(in));
			String t = "";
			Matcher m = null;
			Matcher mname = null;
			String str = null;
			while ((t = br.readLine()) != null) {

				m = pattern.matcher(t);
				if (m.find()) {

					str = m.group(1);
					if(!str.startsWith("thunder:")){
						continue;
					}
					appendUrl(str,result);
				}
				mname = namePattern.matcher(t);
				if (mname.find()) {
					str = mname.group(1);
					appendUrl(str,result);
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
	
	public static HttpURLConnection getConnection(String newUrl) {
		try {
			myurlcon = (HttpURLConnection) (new URL(newUrl)).openConnection();
			myurlcon.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return myurlcon;
	}

	public static void appendUrl(String url, JTextArea result) {
		if (result.getText().length() > 0) {
			result.append("\n");
		}
		result.append(url);
	}

}

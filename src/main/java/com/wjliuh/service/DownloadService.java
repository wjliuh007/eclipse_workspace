package com.wjliuh.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import com.wjliuh.context.ApplicationContext;
import com.wjliuh.utils.NetUtils;

public class DownloadService {
	
	public void doDownload() {
		
		ApplicationContext context = ApplicationContext.getInstance();
		
		String savePath = (String) context.getProperties().get("savePath");//文件保存路径
		String picRoomUrl =  (String) context.getProperties().get("picRoomUrl");//图片库地址
		
		List<String> urls = getPageSrc(picRoomUrl);
		String outPath=null;
		for(int i=0;i<urls.size();i++){
			outPath = savePath + File.separator +System.currentTimeMillis() + ".jpg";
			getContext1(urls.get(i),outPath);
			System.out.println("~~~~~"+urls.get(i));
		}

		System.out.println("图片保存完成...");
	}
	
	public void getContext1(String urlStr, String outPath) {// 获得网络资源并写入指定文件
		InputStream in = null;
		OutputStream out = null;
		try {

			//以上地址不能使用ImageIO.read（URL）
			// 用streams，存储获得的资源
			HttpURLConnection myurlcon = NetUtils.getConnection(urlStr);
			in = myurlcon.getInputStream();
			
			/** 此种方式速度快*/
//			ImageIO.write(ImageIO.read(in), "jpg", new File(outPath));
			
			if (outPath == null) {
				out = System.out;
			} else {
				out = new FileOutputStream(outPath);
			}
			// 用输出流out，输出到指定位置
			byte[] buffer = new byte[1024];
			int bytes_read;
			while ((bytes_read = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytes_read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e) {
			}
		}
	}
	
	/**
	 * 根据网址获取页面上的图片链接
	 * @param url
	 * @return
	 */
	public List<String> getPageSrc(String url){
		List<String> urllist = new ArrayList<String>();
		// 拼接图片的URL
		// 严谨的[a-z0-9]+\\:(//)(\\S)*
		// 不严谨的(\\w){4}\\:(//)(\\S)*
		String urlRegexExp = (String) ApplicationContext.getInstance().getProperties().get("picUrlRegex");// 图片的URI地址和名称
		if(null == urlRegexExp){
			ApplicationContext.getInstance();
			urlRegexExp = ApplicationContext.PIC_URL_REGEX;
		}

		Pattern pattern = Pattern.compile(urlRegexExp);
		BufferedReader br = null;
		HttpURLConnection myurlcon = null;
		try {
			myurlcon =  NetUtils.getConnection(url);
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

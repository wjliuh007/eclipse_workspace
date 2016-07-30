package com.wjliuh.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import com.wjliuh.utils.NetUtils;

public class ObtainPics {

	private static String GOLD_PRICE_URL = "http://www.kitco.cn/cn/live_charts/goldcny.gif";
	private static String SILVER_PRICE_URL = "http://www.kitco.cn/cn/live_charts/silvercny.gif";

	private static String SAVE_PATH = "F://pics//";

	private void doObtain(String urlfile) {
		
		String glodOutPath = null;
		
		List<String> urls = ParseUrl.getPageSrc("http://www.2pxpx.com/article/article_5631196167.html");//ParseUrl.getUrl(urlfile);
		
		for(int i=0;i<urls.size();i++){
			glodOutPath = SAVE_PATH + System.currentTimeMillis() + ".jpg";
			getContext1(urls.get(i),glodOutPath);
			System.out.println("~~~~~"+urls.get(i));
		}
//		getContext1("http://imgserver2.imgepic.com/pcc/049021/w2fwcz4krw1w2fwcz4krw1.jpg", glodOutPath);

//		JOptionPane.showMessageDialog(null, "价格保存完成...");
		System.out.println("图片保存完成...");
	}

	public void doObtainPic(String urlpath) {
		
		String glodOutPath = null;
		
		List<String> urls = ParseUrl.getPageSrc(urlpath);//ParseUrl.getUrl(urlfile);
		
		for(int i=0;i<urls.size();i++){
			glodOutPath = SAVE_PATH + System.currentTimeMillis() + ".jpg";
			getContext1(urls.get(i),glodOutPath);
			System.out.println("~~~~~"+urls.get(i));
		}
//		getContext1("http://imgserver2.imgepic.com/pcc/049021/w2fwcz4krw1w2fwcz4krw1.jpg", glodOutPath);

//		JOptionPane.showMessageDialog(null, "价格保存完成...");
		System.out.println("图片保存完成...");
	}
	

	public static void getContext1(String urlStr, String outPath) {// 获得网络资源并写入指定文件
		InputStream in = null;
		OutputStream out = null;
		try {
			HttpURLConnection myurlcon = NetUtils.getConnection(urlStr);
			in = myurlcon.getInputStream();
			//------------新型方法快
//			ImageIO.write(ImageIO.read(in), "jpg", new File(outPath));
			//------------传统I/O保存图片
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
			//------------
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

	public static void main(String[] args) {
		
	}

}

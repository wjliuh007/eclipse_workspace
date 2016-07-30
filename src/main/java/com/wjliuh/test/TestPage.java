package com.wjliuh.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import com.wjliuh.service.PageLayerService;
import com.wjliuh.utils.NetUtils;

public class TestPage {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		InputStream in = null;
		HttpURLConnection myurlcon=null;
		try{
			for(int i=0;i<100;i++){
				myurlcon = NetUtils.getConnection("http://www.cpm25.com/images/weather_148/"+i+".png");
				in = myurlcon.getInputStream();
				
				/** 此种方式速度快*/
				ImageIO.write(ImageIO.read(in), "png", new File("C:\\Users\\JIE\\Desktop\\"+i+".png"));
			}

		}catch(Exception ex){
			
		}finally{
			in.close();
		}
		


	}

	public static void findPicURL() {

		Pattern pattern = Pattern.compile(NetUtils.NEXT_PAGE_REGEX);
		BufferedReader br = null;
		Matcher m = null;
		try {
			br = new BufferedReader(new FileReader(new File("F:\\Noname5.html")));
			String t = "";

			while ((t = br.readLine()) != null) {

				m = pattern.matcher(t);
				if (m.find()) {
					System.out.println(m.group(0)+"0");
					System.out.println(m.group(1)+"1");
					System.out.println(m.group(2)+"2");
					System.out.println(m.group(3)+"3");
					System.out.println(m.group(4)+"4");
					System.out.println(m.group(5)+"5");
					System.out.println(m.group(6)+"6");
					System.out.println(m.group(7)+"7");
					System.out.println(m.group(8)+"8");

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
}

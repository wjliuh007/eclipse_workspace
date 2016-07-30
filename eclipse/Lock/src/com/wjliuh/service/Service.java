package com.wjliuh.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.wjliuh.config.Config;

/**
 * <b>后台处理类，处理内容读写</b>
 * @author <b>liuwjg</b>
 * @since <b>2015-07-14</b>
 */
public class Service {

	private String cache;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 插入内容
	 * 
	 * @param content 具体内容
	 * @return
	 */
	public int insert(String content){
		String insertContent = getAspect(content)+"\n"+cache;
		
		try {
			File f = Config.getInstance().getFile();
		
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(insertContent.getBytes());
			fos.close();
			Config.getInstance().currentDateStr();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	private String getAspect(String content) {
		
		return Config.getInstance().getDateDecorator()+content;
	}

	/**
	 * 读取内容
	 * 
	 * @return result 具体内容
	 * @return
	 */
	public String read(){
		File f = Config.getInstance().getFile();
		StringBuilder result = new StringBuilder();
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line;
			while((line = br.readLine())!=null){
				result.append(line).append("\n");
			}
			br.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		cache = result.toString();
		return cache;
	}

	public String newDay(){
		File f = new File(Config.getInstance().getConfigPath()+"/"+Config.getInstance().currentDateStr()+".dat");
		if(!f.exists()){
			try {
				f.createNewFile();
				OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
				BufferedWriter bw = new BufferedWriter(fos);
				bw.write("");
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return f.getAbsolutePath();
		
	}
	
}

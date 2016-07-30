package com.wjliuh.localfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Vector;

import jcifs.smb.SmbFile;

public class FindLocalFile {

	public static Vector<SmbFile> pool = new Vector<SmbFile>();
	public static int total =0;
	public static FileOutputStream fos;
	public static PipedOutputStream pof;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SmbFile sf = new SmbFile("smb://administrator:ufsoft@192.168.1.107/D$/");
			final SmbFile[] sfs = sf.listFiles();
			Thread get = new Thread(new Runnable() {
				@Override
				public void run() {
					loopList(sfs);
				}
			});
			get.start();

			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					while(true){
						if(pool.size()>0){
							SmbFile file = pool.remove(pool.size()-1);
							copy(file);
							System.out.println("已经复制 "+(total++)+"个，正在复制==》"+file.getCanonicalPath());
						}
					}
				}
			});
			t.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected static void copy(SmbFile file) {
		String baseDir = "D:\\smb\\";
		try {
			File to = new File(baseDir+file.getName());
			if(!to.exists()){
				to.createNewFile();
			}
			fos = new FileOutputStream(to);
			InputStream in = file.getInputStream();
			// 用输出流out，输出到指定位置
			byte[] buffer = new byte[1024];
			int bytes_read;
			while ((bytes_read = in.read(buffer)) != -1) {
				fos.write(buffer, 0, bytes_read);
				fos.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void loopList(SmbFile[] sfs) {
		for(SmbFile file :sfs){
			try{
				if(file.isDirectory()){
					loopList(file.listFiles());
				}
				if(isAccept(file)){
					pool.add(file);
				}
			}catch(Exception ex){
				
			}

		}
		
	}
	

	private static boolean isAccept(SmbFile file){
		String name = file.getName();
		int loc = name.lastIndexOf(".");
		if(TYPE.containsKey(name.substring(loc+1).toLowerCase())){
			return true;
		}
		return false;
	}
	private static HashMap<String,String> TYPE = new HashMap<String,String>();
	static{
		TYPE.put("pdf", "pdf");
		TYPE.put("doc", "doc");
		TYPE.put("docx", "docx");
		TYPE.put("xls", "xls");
		TYPE.put("xlsx", "xlsx");
		TYPE.put("ppt", "ppt");
		TYPE.put("pptx", "pptx");
		TYPE.put("chm", "chm");
//		TYPE.put("xml", "xml");

	}

}

package com.wjliuh.img;

import java.io.File;
import java.nio.file.FileSystem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.filechooser.FileSystemView;

public class FindImg {

	static Pattern p = Pattern.compile("IMG_(\\d)+\\.JPG");
	static Matcher m = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File[] fs = FileSystemView.getFileSystemView().getRoots();
		for(File f:fs){
			loop(f);
		}

	}
	
	private static void loop(File f){
		File[] files = f.listFiles();
		
		for(File file:files){
			if(file.isDirectory()){
				loop(file);
			}else{
				m = p.matcher(file.getName());
				if(m.find()){
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}

}

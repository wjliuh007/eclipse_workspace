package com.wjliuh.zip;

import java.io.File;

import org.junit.Test;

public class JavaZipFile {

	@Test
	public void test(String[] args) {
		File pics = new File("C:/Users/JIE/Desktop/pics");

		System.out.println(pics.length());
	}
	
	
	public static void main(String[] args){
		File pics = new File("C:\\Users\\JIE\\Desktop\\WhatIhaveDone");

		System.out.println(loopCalcSize(pics));
	}
	
	
	public static long loopCalcSize(File file){
		if(file.isDirectory()){
			File[] fs = file.listFiles();
			long ss = 0L;
			for(File f:fs){
				ss += loopCalcSize(f);
			}
			return ss;
		}else{
			return file.length();
		}
	}
	
	
	

}

package com.wjliuh.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Output {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("")),"ISO8859-1"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("F:\\test.txt")),"utf-8"));
		
		bw.write("我爱你！");
		bw.flush();
	}

}

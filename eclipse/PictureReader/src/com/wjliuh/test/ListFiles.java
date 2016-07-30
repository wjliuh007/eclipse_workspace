package com.wjliuh.test;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "F:\\pics\\test";
		// 文件夹的路径
		File file = new File(path);
		String[] files = file.list();
		for (String f : files) {
			System.out.println(f);
		}
	}
}

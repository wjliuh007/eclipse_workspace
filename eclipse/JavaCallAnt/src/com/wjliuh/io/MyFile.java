package com.wjliuh.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class MyFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File path = new File(".");
		
		String[] arrys = path.list(new FilenameFilter() {
			Pattern pattern = Pattern.compile(".java");
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		});
		arrys = path.list();
		System.out.println(arrys);
	}

}

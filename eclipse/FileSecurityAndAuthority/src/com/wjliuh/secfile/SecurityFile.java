package com.wjliuh.secfile;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class SecurityFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileSystemView fsv = FileSystemView.getFileSystemView();
		File[] fss = new File("C:\\Windows").listFiles();
		File fs = fsv.getHomeDirectory();

		System.out.println(fss.length);
		System.out.println(fs);
	}

}

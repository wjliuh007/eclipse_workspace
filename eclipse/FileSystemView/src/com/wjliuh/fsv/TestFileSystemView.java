package com.wjliuh.fsv;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.filechooser.FileSystemView;

public class TestFileSystemView {

	private static FileOutputStream fos;
	
	public static void main(String[] args) throws Exception{
		File home = FileSystemView.getFileSystemView().getHomeDirectory();
		File[] fs = FileSystemView.getFileSystemView().getFiles(new File("C:\\"), true);
		;
		File output = new File("G:\\output.log");
		if(!output.exists()){
			output.createNewFile();
		}
		fos = new FileOutputStream(output,false);
		
		
		for(int i=0;i<fs.length;i++){
			displayFile(fs[i]);
		}
		fos.flush();
		fos.close();
		System.out.println(home.getName());
		
	}
	
	public static void displayFile(File f) throws Exception{
		if(f.isDirectory()){
			File[] inFiles = f.listFiles();
			for(int i=0;i<inFiles.length;i++){
				displayFile(inFiles[i]);
			}
			
		}else{
			System.out.println(f.getAbsolutePath());
			fos.write(f.getAbsolutePath().getBytes());
			fos.write("\n".getBytes());
		}
	}
}

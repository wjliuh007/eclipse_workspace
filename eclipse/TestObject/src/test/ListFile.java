package test;

import java.io.File;

public class ListFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("D:/eclipse3.7.2/configuration/org.eclipse.osgi/bundles");
		System.out.println("==========begin============");
		loopList(file);

	}

	private static void loopList(File file) {
		if(file.isDirectory()){
			File[] fs = file.listFiles();
			for(File f:fs){
				loopList(f);
			}
		}else{
			System.out.println(file.getName());
		}
		
	}

}

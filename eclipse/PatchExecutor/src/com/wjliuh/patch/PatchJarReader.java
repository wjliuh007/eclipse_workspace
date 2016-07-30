/**
 * 
 */
package com.wjliuh.patch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/**
 * @author JIE
 *
 */
public class PatchJarReader {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ZipException 
	 */
	public static void main(String[] args) throws Exception {
		File pathCode = new File("C:/Users/JIE/Desktop/ria/ria/uapbd/patch6.5_mm/code.jar");
		PatchJarReader p = new PatchJarReader();
		p.getEntrys(new ZipFile(pathCode));
		try {
//			JarFile jf = new JarFile(pathCode);
//			Enumeration<JarEntry> jes = jf.entries();
//			while(jes.hasMoreElements()){
//				JarEntry je = jes.nextElement();
//			    String name = je.getName();  
//			    long size = je.getSize();  
//			    long compressedSize = je.getCompressedSize();  
//			    System.out.println(  
//			    		name + "\t" + size + "\t" + compressedSize);  
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
   public ZipEntry[] getEntrys(ZipFile zipFile)
   {
     ArrayList al = new ArrayList();
     Enumeration enum1 = zipFile.entries();
     while (enum1.hasMoreElements()) {
      ZipEntry entry = (ZipEntry)enum1.nextElement();
      al.add(entry);
					System.out.println(entry.getName());
     }
     return (ZipEntry[])al.toArray(new ZipEntry[0]);
   }

}

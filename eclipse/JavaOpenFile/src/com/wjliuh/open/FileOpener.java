package com.wjliuh.open;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileOpener {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		
	   /** ET.Xls.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\et.exe" "%1"
		ET.Xlsx.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\et.exe" "%1"
		ET.Xlsm.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\et.exe" "%1"
		WPP.PPT.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\wpp.exe" "%1"
		WPP.PPTX.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\wpp.exe" "%1"
		WPP.PPTM.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\wpp.exe" "%1"
		WPS.Doc.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\wps.exe" "%1"
		WPS.Docx.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\wps.exe" "%1"
		WPS.Docm.6
		"D:\Program Files (x86)\WPS Office\9.1.0.4994\office6\wps.exe" "%1"
		FoxitReader.Document
		"D:\Program Files (x86)\Foxit Reader.exe" "%1"
		txtfile */
//		for(int i=0;i<Constants.getFileType().length;i++){
//			loop("reg QUERY \"HKEY_CLASSES_ROOT\\"+Constants.getFileType()[i]+"\"");
//		}
		open("");
		
	}

	public static void open(String filePath) throws IOException {
		File file = new File(filePath);
		
		String step1 = step1("reg QUERY \"HKEY_CLASSES_ROOT\\"+getSuffix(file)+"\"");
		String step2 = step2("reg QUERY \"HKEY_CLASSES_ROOT\\"+step1+"\\shell\\open\\command\"");
		if(step2!=null && step2.contains("%1")){
			String run = "cmd /c start " +step2.replace("%1", file.getAbsolutePath());
			Runtime.getRuntime().exec(run);
		}else{
			String run = "notepad.exe \"%1\"".replace("%1", file.getAbsolutePath());
			Runtime.getRuntime().exec(run);
		}
	}

	public static String step1(String type){
		try {
			BufferedReader br = execute(type);
			String line = null;
			java.util.regex.Pattern p = Pattern.compile("^(\\s){4}\\(.*\\)(\\s){4}REG_SZ(\\s){4}(.*)");

			while((line = br.readLine())!=null){
				Matcher m = p.matcher(new String(line.getBytes("ISO8859-1"),"GBK"));
				if(m.find()){
					return m.group(4);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	public static String step2(String name) {
		try {
			BufferedReader br = execute(name);
			String line = null;
			java.util.regex.Pattern p = Pattern.compile("^(\\s){4}\\(.*\\)(\\s){4}REG_SZ(\\s){4}(.*)");

			while((line = br.readLine())!=null){
				Matcher m = p.matcher(new String(line.getBytes("ISO8859-1"),"GBK"));
				if(m.find()){
					return m.group(4);
				}
			}

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static BufferedReader execute(String command) {
		BufferedReader br = null;
		try {
			Process pro = Runtime.getRuntime().exec(command);
			br = new BufferedReader(new InputStreamReader(pro.getInputStream(),"ISO8859-1"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return br;
	}
	public static String getSuffix(File file){
		String type = null;
		if(file != null && file.exists()){
			type = file.getName().substring(file.getName().lastIndexOf("."));
			return type;
		}
		return null;
	}

}

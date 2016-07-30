package com.wjliuh.open;

public class Constants {

	private static String[] fileType = null;
	
	static {
		fileType = new String[]{".xls",
								".xlsx",
								".xlsm",
								".ppt",
								".pptx",
								".pptm",
								".doc",
								".docx",
								".docm",
								".pdf",
								".txt"
			}; 
	}
	
	public static String[] getFileType(){
		return fileType;
	}
}

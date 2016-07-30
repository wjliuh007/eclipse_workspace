package com.wjliuh.config;

public class Config {

	/**默认索引目录*/
	public static final String INDEX_PATH = "G:/licene/first";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String classPath = Config.class.getClassLoader().getResource("config").getPath();
		System.out.println(classPath);
	}

}

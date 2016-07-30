package com.wjliuh.config;

import java.io.File;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Config {

	private static final String TASKLIST_PATH = "config/tasklist.dat";
	private static final String CONFIG_PATH = "config/";
	
	private static File file;
	private static File conf_path;
	
	private static Config instance;
	
	private Config(){
		file = new File(TASKLIST_PATH);
		conf_path = new File(CONFIG_PATH);
	}
	
	public static Config getInstance(){
		if(instance==null){
			instance = new Config();
		}
		return instance;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public String getPath(){
		return TASKLIST_PATH;
	}
	
	public File getFile(){
		return file;
	}
	
	public File getConfigPath(){
		return conf_path;
	}
	
	public String currentDateStr(){
		GregorianCalendar c = new GregorianCalendar(Locale.CHINA);
		StringBuilder s = new StringBuilder();
		s.append(c.get(1)).append(c.get(2)+1).append(c.get(5)).append(c.get(5)).append(c.get(5)).append(c.get(5));
		
		return s.toString();
	}
	
	public String getDateDecorator(){
		GregorianCalendar c = new GregorianCalendar(Locale.CHINA);
		StringBuilder s = new StringBuilder();
		s.append(c.get(1)).append("-")
		.append(format(String.valueOf(c.get(2)+1))).append("-")
		.append(format(String.valueOf(c.get(5)))).append(" ")
		.append(format(String.valueOf(c.get(11)))).append(":")
		.append(format(String.valueOf(c.get(12)))).append(":")
		.append(format(String.valueOf(c.get(13))));
		return "\n"+s.toString()+"\n";
	}
	
	public String format(String value){
		if(value.length()<2){
			return "0"+value;
		}
		return value;
	}
}

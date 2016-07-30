package com.wjliuh.context;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {

	public static final int maxLength = 50;
	
	private String fileSavePath;
	
	private String picRoomUrl;

	private Map<String,Object> properties = new HashMap<String,Object>();
	
	/** 图片的URI地址和名称 */
	// 拼接图片的URL
	// 严谨的[a-z0-9]+\\:(//)(\\S)*
	// 不严谨的(\\w){4}\\:(//)(\\S)*
	public static final String PIC_URL_REGEX = "[a-z0-9]+\\:(//)(\\S)*(jpg)";
	
	/** 下一页的解析正则表达式*/
	public static final String NEXT_PAGE_REGEX = "<(a|A)(\\s)(\\w){4}=\"((\\S)+)\"(\\s)(class=\"next\")>(.*)</(a|A)>";
	
	/** 目录页中文章的地址正则表达式*/
	public static final String IN_PAGE_REGEX = "<(a|A)(\\s)(\\w){4}=\"((\\S)+)\"(\\s)(target=_blank)>(.*)</(a|A)>";

	private static ApplicationContext instance;
	
	private ApplicationContext(){}
	
	public static ApplicationContext getInstance(){
		if(null == instance){
			instance = new ApplicationContext();
		}
		return instance;
	}
	
	
	public String getFileSavePath() {
		return fileSavePath;
	}

	public void setFileSavePath(String fileSavePath) {
		this.fileSavePath = fileSavePath;
	}

	public String getPicRoomUrl() {
		return picRoomUrl;
	}

	public void setPicRoomUrl(String picRoomUrl) {
		this.picRoomUrl = picRoomUrl;
	}

	public Map<String,Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String,Object> properties) {
		this.properties = properties;
	}
	
}

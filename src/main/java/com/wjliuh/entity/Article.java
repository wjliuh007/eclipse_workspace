package com.wjliuh.entity;

import java.util.ArrayList;
import java.util.List;

public class Article {

	private String srcName;
	private String srcUrl;
	private List<String> picUrls = new ArrayList<String>();
	
	public String getSrcName() {
		return srcName;
	}
	public void setSrcName(String srcName) {
		this.srcName = srcName;
	}
	public String getSrcUrl() {
		return srcUrl;
	}
	public void setSrcUrl(String srcUrl) {
		this.srcUrl = srcUrl;
	}
	public List<String> getPicUrls() {
		return picUrls;
	}
	public void addPicUrls(String picUrl) {
		this.picUrls.add(picUrl);
	}
	
}

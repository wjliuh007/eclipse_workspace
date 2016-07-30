package com.wjliuh.entity;

import java.util.ArrayList;
import java.util.List;

public class Page {

	private Page prePage;
	private Page nextPage;
	private String currentPageUrl;
	private int currentLocationIndex;
	private List<Article> currentPageArticles = new ArrayList<Article>();
	
	public Page getPrePage() {
		return prePage;
	}
	public void setPrePage(Page prePage) {
		this.prePage = prePage;
	}
	public Page getNextPage() {
		return nextPage;
	}
	public void setNextPage(Page nextPage) {
		this.nextPage = nextPage;
	}
	public String getCurrentPageUrl() {
		return currentPageUrl;
	}
	public void setCurrentPageUrl(String currentPageUrl) {
		this.currentPageUrl = currentPageUrl;
	}
	public List<Article> getCurrentPageArticles() {
		return currentPageArticles;
	}
	public void addArticles(Article article) {
		currentPageArticles.add(article);
	}
	public int getCurrentLocationIndex() {
		return currentLocationIndex;
	}
	public void setCurrentLocationIndex(int currentLocationIndex) {
		this.currentLocationIndex = currentLocationIndex;
	}
	
	public boolean hasNext(){
		if(null == this.nextPage){
			return false;
		}
		return true;
	}
	
	
}

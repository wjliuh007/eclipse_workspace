package com.wjliuh.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.wjliuh.entity.Article;
import com.wjliuh.entity.Page;
import com.wjliuh.utils.NetUtils;

public class PageLayerService {

	private static final String PREFFIX = "http://www.2pxpx.com/article/";
	private static final String ARTICLE_PREFFIX = "http://www.2pxpx.com";
	
	private static int length =0;
	/**
	 * 根据第一个页面的url获取连续页面的数据，最终返回链表页面的首页
	 * @param entryUrl
	 * @return
	 */
	public Page doProcessPages(String entryUrl){
		Page headPage = new Page();
		
		loopGetPages(entryUrl, headPage);
		
		List<Article> Articles = getArticles(headPage);
		
		downloadPics(Articles);
		return headPage;
	}

	private List<Article> getArticles(Page headPage) {
		List<Article> total = new ArrayList<Article>();
		total.addAll(headPage.getCurrentPageArticles());
		while(headPage.hasNext()){
			headPage = headPage.getNextPage();
			total.addAll(headPage.getCurrentPageArticles());
		}
		
		return total;
	}

	private void loopGetPages(String entryUrl, Page headPage) {
		length++;
		try {
			HttpURLConnection conn = NetUtils.getConnection(entryUrl);
			
			InputStream in = conn.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String t = "";
			
			Pattern nextPattern = Pattern.compile(NetUtils.NEXT_PAGE_REGEX);
			Pattern inPagePattern = Pattern.compile(NetUtils.IN_PAGE_REGEX);
			
			Matcher nextMatcher = null;
			Matcher inMatcher = null;
			
			while ((t = br.readLine()) != null) {
				
				//匹配上下页
				nextMatcher = nextPattern.matcher(t);
				if (nextMatcher.find()) {
					if("上一页".equals(nextMatcher.group(8))){
						Page prePage = new Page();
						prePage.setCurrentPageUrl(PREFFIX+nextMatcher.group(4));
						headPage.setPrePage(prePage);
					}else if("下一页".equals(nextMatcher.group(8))){
						Page nextPage = new Page();
						nextPage.setCurrentPageUrl(PREFFIX+nextMatcher.group(4));
						headPage.setNextPage(nextPage);
					}
					
				}
				
				//匹配文中文章地址
				inMatcher = inPagePattern.matcher(t);
				if (inMatcher.find()) {
					Article art = new Article();
					art.setSrcUrl(ARTICLE_PREFFIX + inMatcher.group(4));
					art.setSrcName(inMatcher.group(8));
					headPage.addArticles(art);
				}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(length == 2){
			return;
		}
		if(headPage.hasNext()){
			loopGetPages(headPage.getNextPage().getCurrentPageUrl(),headPage.getNextPage());
		}
		
	}
	
	public void downloadPics(List<Article> Articles){
		for(Article a :Articles){
			addPicUrl(a);
		}
		
		realDownloadPic(Articles);
	}

	private void realDownloadPic(List<Article> articles) {
		for(Article a :articles){
			for(String url:a.getPicUrls()){
				System.out.println(url);
			}
		}
		
	}

	private void addPicUrl(Article a) {
		try {
			HttpURLConnection conn = NetUtils.getConnection(a.getSrcUrl());
			if(conn.getResponseCode() != 200)return;
			InputStream in = conn.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String t = "";
			
			Pattern picPattern = Pattern.compile(NetUtils.PIC_URL_REGEX);
			
			Matcher picMatcher = null;
			
			while ((t = br.readLine()) != null) {

				picMatcher = picPattern.matcher(t);
				if (picMatcher.find()) {
					a.addPicUrls(picMatcher.group());
					int index = picMatcher.end();
					while (picMatcher.find(index)) {
						a.addPicUrls(picMatcher.group());
						index = picMatcher.end();
					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}		
}

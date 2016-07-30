package com.wjliuh.spider;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class HtmlPageLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		getLinkString(getIs("http://www.sina.com.cn/"));

	}
	

	public static InputStream getIs(String url) throws Exception{
        HttpClient http = new HttpClient();
        http.getParams().setContentCharset("GBK");
        GetMethod get = new GetMethod(url);
        get.addRequestHeader("Host", "mp3.baidu.com");
        get.addRequestHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.8.1.11) Gecko/20071127 Firefox/2.0.0.11");
        get.addRequestHeader("Accept", "text/xml,application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
        get.addRequestHeader("Accept-Language", "zh-cn,zh;q=0.5");
        get.addRequestHeader("Keep-Alive", "300");
        get.addRequestHeader("Connection", "keep-alive");
        if(http.executeMethod(get) == 200){
        	return get.getResponseBodyAsStream();
        }
        get.releaseConnection();
		return null;
	}
	
    private static String getLinkString(InputStream is) {
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(is,"GBK"));
            String length = "";
            Pattern p = Pattern.compile("\"(http:([^\"]*?))\"");
            Matcher m = null;
            while ((length = br.readLine()) !=null) {
            	m = p.matcher(length);
            	if(m.find()){
            		System.out.println(m.group(1));
            	}
            }
            return null;
        } catch (Exception ex) {
            return "";
        } finally {
            try {
            } catch (Exception ex) {
            }
        }
    }
    
    public static void extractAtag(){
    	
    }

}

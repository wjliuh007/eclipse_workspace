package com.zpapi.other.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whalin.MemCached.MemCachedClient;

public class MemcacheUtil {
	private static MemCachedClient client;

	static{
		@SuppressWarnings("resource")
		ApplicationContext atx = new ClassPathXmlApplicationContext(
				"/applicationContext-cache.xml");
		client = (MemCachedClient) atx.getBean("memcachedClient");
	}
	public static MemCachedClient getMemCachedClient() {
		return client;
	}
	
}
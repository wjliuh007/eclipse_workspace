package com.zpapi.other.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whalin.MemCached.MemCachedClient;

public class MemcacheProUtil {
	private static MemCachedClient client;

	static{
		@SuppressWarnings("resource")
		ApplicationContext atx = new ClassPathXmlApplicationContext("/applicationContext-cache.xml");
		client = (MemCachedClient) atx.getBean("memcachedClientPro");
	}
	public static MemCachedClient getMemCachedClient() {
		return client;
	}
}
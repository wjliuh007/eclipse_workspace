package com.zp.commons.util;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

@Component
public class PropertiesUtil {
	private static ConcurrentHashMap<String, Properties> propsMap = new ConcurrentHashMap<String, Properties>();
	private static Logger logger = Logger.getLogger(PropertiesUtil.class);

	/**
	 * 
	 * @Title: getProperty
	 * @Description: 基于Spring读取Properties的文件，返回属性值
	 * @param @param propertyKey 要获取属性值对应的键名
	 * @param @param propertyFileName 属性文件名
	 * @param @return
	 * @return String 属性值
	 * @throws
	 * @author zhupengren
	 * @date 2014年4月17日 下午5:55:13
	 */
	public static String getProperty(String propertyKey, String propertyFileName) {
		if (propsMap.containsKey(propertyFileName)) {
			return propsMap.get(propertyFileName).getProperty(propertyKey);
		}
		Properties props = getPropertys(propertyFileName);
		String value = props == null ? null : props.getProperty(propertyKey);
		return value;
	}

	/**
	 * 
	 * @Title: getPropertys
	 * @Description: 基于Spring读取Properties的文件，返回属性值
	 * @param @param propertyFileName 属性文件名
	 */
	public static Properties getPropertys(String propertyFileName) {
		Properties properties = propsMap.get(propertyFileName);
		try {
			if (properties == null) {
				properties = PropertiesLoaderUtils
						.loadAllProperties(propertyFileName);
				propsMap.put(propertyFileName, properties);
			}
		} catch (IOException e) {
			logger.info(propertyFileName + "文件未找到!=========================");
			logger.error(e.getMessage(), e);
		}
		return properties;
	}

}

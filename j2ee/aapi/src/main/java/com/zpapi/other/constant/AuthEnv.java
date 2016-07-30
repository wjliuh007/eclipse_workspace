
package com.zpapi.other.constant;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.zhen.commons.util.PropertiesUtil;

/**
 * Function: 环境变量. <br/>
 * Date: 2015年12月22日 下午1:46:47 <br/>
 * 
 * @author sunshine
 * @version
 * @since JDK 1.7
 * @see
 */
public class AuthEnv {
	private static Logger logger = Logger.getLogger(AuthEnv.class);
	private static AuthEnv instance = new AuthEnv();
	private Properties properties;

	private AuthEnv() {
		init();
	}

	private void init() {
		try {
			properties = PropertiesLoaderUtils.loadAllProperties("ipconfig.properties");
			Iterator<Entry<Object, Object>> it = properties.entrySet().iterator();
			logger.error("init ipconfig.properties values");
			while (it.hasNext()) {
				Entry<Object, Object> entry = it.next();
				logger.info("the key is " + entry.getKey());
				logger.info("the value is " + entry.getValue());
				entry.getKey();
			}
			// 协助初始化PropertiesUtil，避免其他接口调用时产生并发，后续应该去掉
			PropertiesUtil.getProperty("oauth_ip", "ipconfig.properties");
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	public static AuthEnv getInstance() {
		return instance;
	}

	public String getProperties(String propertyKey) {
		// return PropertiesUtil.getProperty(propertyKey,
		// "ipconfig.properties");
		String value = properties.getProperty(propertyKey);
		System.out.println(value);
		return value;
	}
}

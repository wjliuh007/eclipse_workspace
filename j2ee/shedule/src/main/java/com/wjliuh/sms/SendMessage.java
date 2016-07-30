package com.wjliuh.sms;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.zp.commons.util.PropertiesUtil;

@Component
public class SendMessage {

	private static final SendMessage instance = new SendMessage();

	private static Logger logger = Logger.getLogger(SendMessage.class);

	public static SendMessage getInstance() {
		return instance;
	}

	private static HttpClient httpClient;

	private SendMessage() {
		MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();

		connectionManager.getParams().setDefaultMaxConnectionsPerHost(300);
		connectionManager.getParams().setMaxTotalConnections(50000);

		httpClient = new HttpClient(connectionManager);
		httpClient.getParams().setParameter(
				HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
	}

	// CRM发送信息 post
	public static String sendSMSCRM(String phone, String content)
			throws IOException {
		String sendURL = PropertiesUtil
				.getProperty("sms_url", "msg.properties");

		Map<String, String> getParam = new HashMap<String, String>(4);
		getParam.put("sname",
				PropertiesUtil.getProperty("sms_sname", "msg.properties"));
		getParam.put("spwd",
				PropertiesUtil.getProperty("sms_spwd", "msg.properties"));
		getParam.put("scorpid",
				PropertiesUtil.getProperty("sms_scorpid", "msg.properties"));
		getParam.put("sprdid",
				PropertiesUtil.getProperty("sms_sprdidCRM", "msg.properties"));
		getParam.put("sdst", phone.toString());
		getParam.put("smsg", content);

		String result = SendMessage.executePost(sendURL, getParam, "utf-8");

		return result;
	}

	public static String executePost(String url,
			Map<String, String> paramaters, String returnStrCharacter)
			throws IOException {
		String result = null;

		HttpState state = new HttpState();
		if (null != paramaters.get("server_account_username")
				&& null != paramaters.get("server_account_passowrd")) {
			UsernamePasswordCredentials creds = new UsernamePasswordCredentials(
					(String) paramaters.get("server_account_username"),
					(String) paramaters.get("server_account_passowrd"));
			state.setCredentials(AuthScope.ANY, creds);
		}
		// 创建GET方法的实例
		PostMethod postMethod = new PostMethod(url);
		postMethod.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=UTF-8");
		Iterator<Entry<String, String>> iter = paramaters.entrySet().iterator();

		while (iter.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iter
					.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
			if (null != val) {
				postMethod.setParameter(key.toString(), val.toString());
			}
		}
		try {
			// 执行getMethod
			httpClient.executeMethod(null, postMethod, state);

			byte[] responseBody = new byte[1024]; // getMethod.getResponseBody();
			InputStream resBody = postMethod.getResponseBodyAsStream();
			StringBuffer sb = new StringBuffer();
			int len = -1;
			while ((len = resBody.read(responseBody)) != -1) {
				sb.append(new String(responseBody, 0, len, returnStrCharacter));
			}
			// 处理内容
			result = sb.toString();
		} finally {
			// 释放连接
			postMethod.releaseConnection();
		}
		return result;
	}
}

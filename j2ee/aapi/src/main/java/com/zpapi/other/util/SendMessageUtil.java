package com.zpapi.other.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;

import com.zhen.commons.util.PropertiesUtil;


public class SendMessageUtil {

	private static Logger logger = Logger.getLogger(SendMessageUtil.class);
	private static String[] validIPs = PropertiesUtil.getProperty("valid_ips", "msgConfig.properties").split(
			",");
	private static String[] validRegs = PropertiesUtil.getProperty("valid_reg", "msgConfig.properties")
			.split(",");

	/**
	 * send_url方法
	 * 
	 * @param urlStr
	 * @param param
	 * @throws Exception
	 */
	public static boolean send_url(String urlStr) throws Exception {
		URL url;
		HttpURLConnection url_con = null;
		boolean success = true;
		try {
			url = new URL(urlStr);
			url_con = (HttpURLConnection) url.openConnection();
			url_con.setRequestMethod("GET");
			url_con.setDoOutput(true);
			// Read from the connection. Default is true.
			url_con.setDoInput(true);
			// Set the post method. Default is GET
			url_con.setInstanceFollowRedirects(false);
			// connection.setUseCaches(false);
			url_con.connect();

			InputStream in = url_con.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(in, "gb2312"));

			String lines;
			while ((lines = rd.readLine()) != null) {
				if (lines.lastIndexOf("-") == -1) {
					success = true;
				} else {
					if (lines.equals("-1")) {
						throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_066);
					} else if (lines.equals("-2")) {
						throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_067);
					} else if (lines.equals("-3")) {
						throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_068);
					} else if (lines.equals("-4")) {
						throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_069);
					} else if (lines.equals("-5")) {
						throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_070);
					} else if (lines.equals("-6")) {
						throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_071);
					} else if (lines.equals("-7")) {
						throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_072);
					}
					success = false;
				}
			}
		} catch (ConnectException e) {
			throw new com.zpapi.other.error.BusinessException(com.zpapi.other.error.ErrorCode.sys_074);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (url_con != null) {
				url_con.disconnect();
			}
		}
		return success;
	}

	public static boolean checkIPValid(String ip) {
		if (ArrayUtils.contains(validIPs, ip))
			return true;
		for (String reg : validRegs) {
			if (ip.matches(reg))
				return true;
		}
		return false;
	}

}
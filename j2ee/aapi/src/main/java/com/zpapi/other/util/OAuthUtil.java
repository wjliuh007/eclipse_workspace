package com.zpapi.other.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javacommon.CacheKeyConst;

import org.apache.log4j.Logger;

import com.zpapi.other.constant.AuthEnv;
import com.zpapi.other.error.BusinessException;
import com.zpapi.other.model.OAuthMoel;
import com.zpapi.other.model.UcMembers;
import com.zpapi.other.service.OauthAccessTokenManager;
import com.zpapi.other.service.UcMembersManager;



public class OAuthUtil {
	private static Logger logger = Logger.getLogger(OAuthUtil.class);

	private static String login(String username, String password)
			throws Exception {
		String sessionId = "";
		HttpURLConnection uConnection = null;
		DataOutputStream out = null;
		try {
			// URL u = new URL(PropertiesUtil.getProperty("oauth_ip",
			// "ipconfig.properties") + "login.do");
			URL u = new URL(AuthEnv.getInstance().getProperties("oauth_ip")
					+ "login.do");
			uConnection = (HttpURLConnection) u.openConnection();
			uConnection.setDoOutput(true);
			// Read from the connection. Default is true.
			uConnection.setDoInput(true);
			// Set the post method. Default is GET
			uConnection.setRequestMethod("POST");
			uConnection.setInstanceFollowRedirects(false);
			// Post cannot use caches
			// Post 请求不能使用缓存
			uConnection.setUseCaches(false);
			uConnection.connect();
			out = new DataOutputStream(uConnection.getOutputStream());
			String content = URLEncoder.encode("j_username", "UTF-8") + "="
					+ URLEncoder.encode(username, "UTF-8");
			content += "&" + URLEncoder.encode("j_password", "UTF-8") + "="
					+ URLEncoder.encode(password, "UTF-8");
			content += "&" + URLEncoder.encode("login", "UTF-8") + "="
					+ URLEncoder.encode("Login", "UTF-8");
			// DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写道流里面
			out.writeBytes(content);
			out.flush();
			String key = "";

			if (uConnection != null) {
				for (int i = 1; (key = uConnection.getHeaderFieldKey(i)) != null; i++) {
					if (key.equalsIgnoreCase("set-cookie")) {
						sessionId = uConnection.getHeaderField(key);
						sessionId = sessionId.substring(0,
								sessionId.indexOf(";"));
					}
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
				}
			}
			if (uConnection != null) {
				uConnection.disconnect();
			}
		}
		return sessionId;
	}

	private static OAuthMoel authorizationMethod(String sessionId)
			throws Exception {
		HttpURLConnection connection = null;
		HttpURLConnection connection1 = null;
		DataOutputStream out = null;
		OAuthMoel model = new OAuthMoel();
		try {
			// URL url = new URL(PropertiesUtil.getProperty("oauth_ip",
			// "ipconfig.properties") + "oauth/authorize");
			URL url = new URL(AuthEnv.getInstance().getProperties("oauth_ip")
					+ "oauth/authorize");
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			// Read from the connection. Default is true.
			connection.setDoInput(true);
			// Set the post method. Default is GET
			connection.setRequestMethod("POST");
			connection.setInstanceFollowRedirects(false);
			connection.setRequestProperty("Cookie", sessionId);
			connection.setUseCaches(false);
			connection.connect();
			DataOutputStream output = new DataOutputStream(
					connection.getOutputStream());
			String content1 = URLEncoder.encode("client_id", "UTF-8") + "="
					+ URLEncoder.encode("client1", "UTF-8");
			content1 += "&" + URLEncoder.encode("response_type", "UTF-8") + "="
					+ URLEncoder.encode("token", "UTF-8");
			content1 += "&"
					+ URLEncoder.encode("redirect_uri", "UTF-8")
					+ "="
					+ URLEncoder.encode("http://m.zhenpin.com:8180/zpapi/",
							"UTF-8");
			content1 += "&" + URLEncoder.encode("scope", "UTF-8") + "="
					+ URLEncoder.encode("read,write,delete", "UTF-8");
			content1 += "&" + URLEncoder.encode("grant_type", "UTF-8") + "="
					+ URLEncoder.encode("authorization_code", "UTF-8");
			// DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写道流里面
			output.writeBytes(content1);
			output.flush();
			output.close();
			new BufferedReader(new InputStreamReader(
					connection.getInputStream(), "utf-8"));

			// URL url1 = new URL(PropertiesUtil.getProperty("oauth_ip",
			// "ipconfig.properties") + "oauth/authorize");
			URL url1 = new URL(AuthEnv.getInstance().getProperties("oauth_ip")
					+ "oauth/authorize");
			connection1 = (HttpURLConnection) url1.openConnection();

			connection1.setDoOutput(true);
			// Read from the connection. Default is true.
			connection1.setDoInput(true);
			// Set the post method. Default is GET
			connection1.setRequestMethod("POST");
			connection1.setInstanceFollowRedirects(false);
			connection1.setRequestProperty("Cookie", sessionId);
			// connection.setUseCaches(false);
			connection1.connect();
			out = new DataOutputStream(connection1.getOutputStream());
			String content = URLEncoder.encode("authorize", "UTF-8") + "="
					+ URLEncoder.encode("Authorize", "UTF-8");
			content += "&" + URLEncoder.encode("user_oauth_approval", "UTF-8")
					+ "=" + URLEncoder.encode("true", "UTF-8");
			// DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写道流里面
			out.writeBytes(content);
			out.flush();

			String key = "";
			String access_id = "";
			String expires_in = "";
			if (connection1 != null) {
				for (int i = 1; (key = connection1.getHeaderFieldKey(i)) != null; i++) {
					if (key.equalsIgnoreCase("Location")) {
						access_id = connection1.getHeaderField(key);
						expires_in = access_id.substring(
								access_id.lastIndexOf("=") + 1,
								access_id.length());
						// int t = access_id.indexOf("=");
						// int t2 = access_id.indexOf("&");
						if (access_id != null && !"".equals(access_id)
								&& access_id.indexOf("=") != -1
								&& access_id.indexOf("&") != -1)
							access_id = access_id.substring(
									access_id.indexOf("=") + 1,
									access_id.indexOf("&"));
						else
							access_id = "";

					}
				}
			}
			if (access_id.equals("") || expires_in.equals("")) {
				throw new BusinessException(com.zpapi.other.error.ErrorCode.sys_013);
			}
			model.setAccessId(access_id);
			model.setExpiresIn(expires_in);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
				}
			}
			if (connection != null) {
				connection.disconnect();
			}
			if (connection1 != null) {
				connection1.disconnect();
			}
		}

		return model;
	}

	private static OAuthMoel getToken(String sessionId, String username)
			throws Exception {
		// String access_id = "";
		HttpURLConnection connection = null;
		OAuthMoel token = null;
		try {
			// URL url = new URL(PropertiesUtil.getProperty("oauth_ip",
			// "ipconfig.properties") + "oauth/users/" + username
			// + "/tokens");
			URL url = new URL(AuthEnv.getInstance().getProperties("oauth_ip")
					+ "oauth/users/" + username + "/tokens");
			connection = (HttpURLConnection) url.openConnection();

			connection.setDoOutput(true);
			// Read from the connection. Default is true.
			connection.setDoInput(true);
			// Set the post method. Default is GET
			connection.setInstanceFollowRedirects(false);
			connection.setRequestProperty("Cookie", sessionId);
			// connection.setUseCaches(false);
			connection.connect();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream(), "utf-8"));

			String lines;
			token = new OAuthMoel();
			while ((lines = reader.readLine()) != null) {
				String[] group = lines.split(",");
				if (group == null || group.length < 4) {
					return null;
				}
				String[] expiresIn = group[3].split(":");
				if (expiresIn == null || expiresIn.length < 2) {
					return null;
				}
				String time = expiresIn[1];
				if (time.contains("-") || Integer.valueOf(time) < 3600) {
					// url = new URL(
					// PropertiesUtil.getProperty("oauth_ip",
					// "ipconfig.properties") + "oauth/users/" + username);
					url = new URL(AuthEnv.getInstance().getProperties(
							"oauth_ip")
							+ "oauth/users/" + username);
					connection = (HttpURLConnection) url.openConnection();

					connection.setDoOutput(true);
					// Read from the connection. Default is true.
					connection.setDoInput(true);
					// Set the post method. Default is GET
					connection.setInstanceFollowRedirects(false);
					connection.setRequestProperty("Cookie", sessionId);
					// connection.setUseCaches(false);
					connection.connect();

					reader = new BufferedReader(new InputStreamReader(
							connection.getInputStream(), "utf-8"));

					while ((lines = reader.readLine()) != null) {
						group = lines.split(",");
						if (group == null || group.length < 4) {
							return null;
						}
						expiresIn = group[3].split(":");
						if (expiresIn == null || expiresIn.length < 2) {
							return null;
						}
						String[] access_token = group[0].split(":");
						if (access_token == null || access_token.length < 2) {
							return null;
						}
						String[] refresh_token = group[2].split(":");
						if (refresh_token == null || refresh_token.length < 2) {
							return null;
						}
						token.setExpiresIn(expiresIn[1]);// 过期时间
						token.setAccessId(access_token[1].replaceAll("\"", ""));// token
						token.setRefreshToken(refresh_token[1].replaceAll("\"",
								""));

					}
					return token;
				}
				String[] access_token = group[0].split(":");
				if (access_token == null || access_token.length < 2) {
					return null;
				}
				String[] refresh_token = group[2].split(":");
				if (refresh_token == null || refresh_token.length < 2) {
					return null;
				}
				token.setExpiresIn(time);// 过期时间
				token.setAccessId(access_token[1].replaceAll("\"", ""));// token
				token.setRefreshToken(refresh_token[1].replaceAll("\"", ""));
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
		return token;
	}

	public static void check(OauthAccessTokenManager oauthAccessTokenManager,
			UcMembersManager ucMembersManager, Map<String, String> map) {
		String userid = oauthAccessTokenManager.getUserNamebyaccessToken(map
				.get("accesstoken"));
		if (userid == null) {
			throw new BusinessException(com.zpapi.other.error.ErrorCode.sys_127);
		}
		UcMembers ucmembers = ucMembersManager.getById(Long.valueOf(map
				.get("memberid")));
		String useriddb = ucmembers.getUsername();
		if (ucmembers == null || !useriddb.equals(userid)) {
			throw new BusinessException(com.zpapi.other.error.ErrorCode.sys_024);
		}
	}

	/***
	 * 
	 * @param memberId
	 * @param token
	 * @param oauthAccessTokenManager
	 * @param ucMembersManager
	 * @return 1 token 过期或错误 2 用户异常 3 ok
	 */
	public static Integer checkLogin(String memberId, String token,
			OauthAccessTokenManager oauthAccessTokenManager,
			UcMembersManager ucMembersManager) {
		try {
			String userid = oauthAccessTokenManager
					.getUserNamebyaccessToken(token);
			if (userid == null) {
				return ReturnInfo.token_expire;
			}
			UcMembers ucmembers = ucMembersManager.getById(Long
					.valueOf(memberId));
			if (ucmembers == null) {
				return ReturnInfo.token_error;
			}
			String useriddb = ucmembers.getUsername();
			if (useriddb == null || !useriddb.equals(userid)) {
				return ReturnInfo.token_error;
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return ReturnInfo.token_isOk;
	}

	public static OAuthMoel onLogin(String userName, String password) {
		String key = CacheKeyConst.GetToken + "n_"
				+ Md5Util.getPasswordMd5(userName);
		OAuthMoel token = null;
		Map<String, Object> cacheMap = null;
		try {
			if (MemcacheUtil.getMemCachedClient().get(key) == null) {
				String sessionId = login(userName, password);
				token = getToken(sessionId, userName);
				if (token == null) {
					authorizationMethod(sessionId);
					token = getToken(sessionId, userName);
				}
				if (token != null) {
					long cacheTime = Long.valueOf(token.getExpiresIn()) - 3600;
					long now = System.currentTimeMillis();
					long failTime = now + cacheTime * 1000;
					long EXpiresIn = failTime - now;
					cacheMap = new HashMap<String, Object>(3);
					cacheMap.put("access_token", token.getAccessId());
					cacheMap.put("refresh_token", token.getRefreshToken());
					cacheMap.put("expiresin", token.getExpiresIn());
					cacheMap.put("failTime", failTime);
					token.setExpiresIn(String.valueOf(EXpiresIn));
					MemcacheUtil.getMemCachedClient().set(key, cacheMap,
							new Date(failTime));
				}
			} else {
				cacheMap = (Map<String, Object>) MemcacheUtil
						.getMemCachedClient().get(key);
				if (cacheMap != null) {
					token = new OAuthMoel();
					long failTime = Long.valueOf(cacheMap.get("failTime")
							.toString());
					token.setAccessId(cacheMap.get("access_token").toString());
					token.setRefreshToken(cacheMap.get("refresh_token")
							.toString());
					long EXpiresIn = failTime - System.currentTimeMillis();
					token.setExpiresIn(String.valueOf(EXpiresIn));
					token.setFailTime(cacheMap.get("failTime") == null ? null
							: cacheMap.get("failTime").toString());
				}
			}
			return token;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}
}
package com.zpapi.other.util;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.zhen.commons.util.UniqueStringGenerator;
import com.zpapi.other.query.UcMembersQuery;

public class Md5Util {
	private static Logger logger = Logger.getLogger(Md5Util.class);

	private final static String MD5(String s) {
		try {
			byte[] btInput = s.getBytes();
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < md.length; offset++) {
				i = md[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			return new String(buf.toString());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}

	public static void getPasswordMd5(UcMembersQuery query) {
		String salt = UniqueStringGenerator.getUniqueString()
				.substring(UniqueStringGenerator.getUniqueString().length() - 6);
		String ret = Md5Util.MD5(Md5Util.MD5(query.getPassword()).concat(salt));
		query.setPassword(ret);
		query.setSalt(salt);

	}

	public static boolean checkPasswordLength(UcMembersQuery query) {
		String pwd = query.getPassword();
		boolean result = false;
		if (pwd.length() >= 6 && pwd.length() <= 16) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	// 手机号码验证
	public static boolean isMobileNumber(String mobiles) {
		// Pattern p =
		// Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Pattern p = Pattern.compile("^((13[0-9])|(14[5,7])|(15[^4,\\D])|(17[0-9])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		return m.matches();
	}

	public static String getPasswordMd5(String password, String salt) {
		String ret = Md5Util.MD5(Md5Util.MD5(password).concat(salt));
		return ret;

	}

	public static String getPasswordMd5(String password) {
		String ret = Md5Util.MD5(password);
		return ret;

	}

}
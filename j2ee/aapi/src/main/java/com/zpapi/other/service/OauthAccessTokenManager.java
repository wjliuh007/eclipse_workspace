/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.service;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.EntityDao;
import com.zhen.commons.base.BaseManager;
import com.zpapi.other.dao.OauthAccessTokenDao;
import com.zpapi.other.model.OauthAccessToken;
import com.zpapi.other.query.OauthAccessTokenQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class OauthAccessTokenManager extends BaseManager<OauthAccessToken, java.lang.Integer> {

	private OauthAccessTokenDao oauthAccessTokenDao;

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写 */
	public void setOauthAccessTokenDao(OauthAccessTokenDao dao) {
		this.oauthAccessTokenDao = dao;
	}

	@Override
	public EntityDao getEntityDao() {
		return this.oauthAccessTokenDao;
	}

	@Transactional(readOnly = true)
	public Page findPage(OauthAccessTokenQuery query) {
		return oauthAccessTokenDao.findPage(query);
	}

	public String getUserNamebyaccessToken(String accessToken) {

		return oauthAccessTokenDao.getUserNamebyaccessToken(extractTokenKey(accessToken));
	}

	protected String extractTokenKey(String value) {
		if (value == null) {
			return null;
		}
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException("MD5 algorithm not available.  Fatal (should be in the JDK).");
		}

		try {
			byte[] bytes = digest.digest(value.getBytes("UTF-8"));
			return String.format("%032x", new BigInteger(1, bytes));
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException("UTF-8 encoding not available.  Fatal (should be in the JDK).");
		}
	}
}

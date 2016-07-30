/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatisOauth3Dao;
import com.zpapi.other.model.OauthAccessToken;
import com.zpapi.other.query.OauthAccessTokenQuery;

@Repository
public class OauthAccessTokenDao extends BaseIbatisOauth3Dao<OauthAccessToken, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "OauthAccessToken";
	}

	public Page findPage(OauthAccessTokenQuery query) {
		return pageQuery("OauthAccessToken.findPage", query);
	}

	public String getUserNamebyaccessToken(String accessToken) {

		return (String) getSqlSessionTemplate().selectOne("OauthAccessToken.getUserNamebyaccessToken",
				accessToken);
	}

	@Override
	public void saveOrUpdate(Object entity) throws DataAccessException {
		// TODO Auto-generated method stub

	}

}

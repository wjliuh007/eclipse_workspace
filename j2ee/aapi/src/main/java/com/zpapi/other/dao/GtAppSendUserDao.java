/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.dao;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtAppSendUser;
import com.zpapi.other.model.GtAppSendUserQuery;

@Repository
public class GtAppSendUserDao extends BaseIbatis3Dao<GtAppSendUser, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtAppSendUser";
	}

	public void saveOrUpdate(GtAppSendUser entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtAppSendUserQuery query) {
		return pageQuery("GtAppSendUser.findPage", query);
	}

	public void insert(GtAppSendUser user) {
		getSqlSessionTemplate().insert("GtAppSendUser.insert", user);
	}

	public void updateByModel(GtAppSendUser appUser) {
		getSqlSessionTemplate().update("GtAppSendUser.updateByModel", appUser);

	}

	public Long countByModel(String model) {

		return (Long) getSqlSessionTemplate().selectOne("GtAppSendUser.countByModel", model);
	}

	public Long count(GtAppSendUser appUser) {
		return (Long) getSqlSessionTemplate().selectOne("GtAppSendUser.count", appUser);
	}

	public Long countidfa(String idfa) {

		return (Long) getSqlSessionTemplate().selectOne("GtAppSendUser.countidfa", idfa);
	}

	public void updateByidfa(GtAppSendUser user) {
		getSqlSessionTemplate().update("GtAppSendUser.updateByidfa", user);

	}

}

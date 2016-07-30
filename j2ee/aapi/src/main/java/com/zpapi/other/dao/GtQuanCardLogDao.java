/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtQuanCardLog;
import com.zpapi.other.query.GtQuanCardLogQuery;

@Repository
public class GtQuanCardLogDao extends BaseIbatis3Dao<GtQuanCardLog, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtQuanCardLog";
	}

	@Override
	public void saveOrUpdate(GtQuanCardLog entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtQuanCardLogQuery query) {
		return pageQuery("GtQuanCardLog.findPage", query);
	}

	public void insertUsequanCardLog(GtQuanCardLog model) {
		getSqlSessionTemplate().insert("GtQuanCardLog.insertUsequanCardLog", model);

	}

	public void addCardLog(GtQuanCardLog model) {
		getSqlSessionTemplate().insert("GtQuanCardLog.addCardLog", model);
	}

}

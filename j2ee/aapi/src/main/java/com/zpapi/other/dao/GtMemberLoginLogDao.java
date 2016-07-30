/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtMemberLoginLog;
import com.zpapi.other.query.GtMemberLoginLogQuery;

@Repository
public class GtMemberLoginLogDao extends BaseIbatis3Dao<GtMemberLoginLog, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtMemberLoginLog";
	}

	public void saveOrUpdate(GtMemberLoginLog entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtMemberLoginLogQuery query) {
		return pageQuery("GtMemberLoginLog.findPage", query);
	}

	public GtMemberLoginLog[] getloginlog(Integer memberid) {
		List<GtMemberLoginLog> lst = getSqlSessionTemplate().selectList("GtMemberLoginLog.getloginlog",
				memberid);
		return lst.toArray(new GtMemberLoginLog[0]);
	}

	public Integer checkLoginTimeToday(Integer memberid) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtMemberLoginLog.checkLoginTimeToday",
				memberid);
		return count;
	}

	public void addLoginLog(GtMemberLoginLog LoginLog) {
		getSqlSessionTemplate().insert("GtMemberLoginLog.addLoginLog", LoginLog);
	}

}

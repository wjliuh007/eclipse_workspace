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
import com.zpapi.other.model.GtOrdersLog;
import com.zpapi.other.query.GtOrdersLogQuery;

@Repository
public class GtOrdersLogDao extends BaseIbatis3Dao<GtOrdersLog, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtOrdersLog";
	}

	@Override
	public void saveOrUpdate(GtOrdersLog entity) {
		if (entity.getLogId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtOrdersLogQuery query) {
		return pageQuery("GtOrdersLog.findPage", query);
	}

	public Object insertOrderLog(GtOrdersLog model) {
		// TODO Auto-generated method stub
		return getSqlSessionTemplate().insert("GtOrdersLog.insertOrderLog", model);
	}

	public GtOrdersLog[] getOrderLogByOrderId(String orderId) {
		List<GtOrdersLog> lst = getSqlSessionTemplate().selectList("GtOrdersLog.getOrderLogByOrderId",
				orderId);
		return lst.toArray(new GtOrdersLog[0]);
	}

	public GtOrdersLog[] getSendOrderLogByOrderId(String orderId) {
		List<GtOrdersLog> lst = getSqlSessionTemplate().selectList("GtSendOrdersLog.getOrderLogByOrderId",
				orderId);
		return lst.toArray(new GtOrdersLog[0]);
	}

}

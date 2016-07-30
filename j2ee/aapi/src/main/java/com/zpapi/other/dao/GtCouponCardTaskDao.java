/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.dao;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */
import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtCouponCardTask;
import com.zpapi.other.query.GtCouponCardTaskQuery;

@Repository
public class GtCouponCardTaskDao extends BaseIbatis3Dao<GtCouponCardTask, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtCouponCardTask";
	}

	public void saveOrUpdate(GtCouponCardTask entity) {
		if (entity.getTaskId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtCouponCardTaskQuery query) {
		return pageQuery("GtCouponCardTask.findPage", query);
	}

	public GtCouponCardTask queryByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return (GtCouponCardTask) getSqlSessionTemplate().selectOne("GtCouponCardTask.queryByTaskId", taskId);
	}

	public GtCouponCardTask queryByCardNum(String cardNum) {
		// TODO Auto-generated method stub
		return (GtCouponCardTask) getSqlSessionTemplate().selectOne("GtCouponCardTask.queryByCardNum",
				cardNum);
	}

}

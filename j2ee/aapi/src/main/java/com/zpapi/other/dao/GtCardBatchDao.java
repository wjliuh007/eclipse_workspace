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
import com.zpapi.other.model.GtCardBatch;
import com.zpapi.other.query.GtCardBatchQuery;

@Repository
public class GtCardBatchDao extends BaseIbatis3Dao<GtCardBatch, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtCardBatch";
	}

	public void saveOrUpdate(GtCardBatch entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtCardBatchQuery query) {
		return pageQuery("GtCardBatch.findPage", query);
	}

	public Integer getStatusByCard(String cardnum) {
		// TODO Auto-generated method stub
		return (Integer) getSqlSessionTemplate().selectOne("GtCardBatch.getStatusByCard", cardnum);
	}

	public GtCardBatch getByBatchId(Integer batchId) {
		return (GtCardBatch) getSqlSessionTemplate().selectOne("GtCardBatch.getByBatchId", batchId);
	}

	public GtCardBatch getInfoByCard(String cardnum) {
		// TODO Auto-generated method stub
		return (GtCardBatch) getSqlSessionTemplate().selectOne("GtCardBatch.getInfoByCard", cardnum);
	}

}

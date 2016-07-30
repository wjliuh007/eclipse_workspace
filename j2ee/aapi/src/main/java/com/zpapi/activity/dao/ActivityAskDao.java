/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.activity.dao;

import java.util.List;
import java.util.Map;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatisActivity3Dao;
import com.zpapi.activity.model.ActivityAsk;
import com.zpapi.activity.query.ActivityAskQuery;
import com.zpapi.other.model.GtItem;

@Repository
public class ActivityAskDao extends BaseIbatisActivity3Dao<ActivityAsk, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "ActivityAsk";
	}

	public void saveOrUpdate(ActivityAsk entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(ActivityAskQuery query) {
		return pageQuery("ActivityAsk.findPage", query);
	}

	public ActivityAsk[] getQuestion(Integer memberid) {
		List<ActivityAsk> asks = getSqlSessionTemplate().selectList("ActivityAsk.getQuestion", memberid);
		return asks.toArray(new ActivityAsk[0]);
	}

	public Integer checkRight(String id) {
		Integer asks = (Integer) getSqlSessionTemplate().selectOne("ActivityAsk.checkRight", id);
		return asks;
	}

	@Override
	public void saveOrUpdate(Object entity) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	public List<String> getCartHasActivityProductCount(List<GtItem> items) {
		return getSqlSessionTemplate().selectList("ActivityAsk.getActivityProductSpecIds", items);
	}

	public Integer getActivityProductCountByParam(Map<String, Object> param) {
		return (Integer) getSqlSessionTemplate().selectOne("ActivityAsk.getActivityProductCountByParam",
				param);
	}

	public Map<String, String> getValidationcodeMapByParam(Map<String, String> param) {
		return (Map<String, String>) getSqlSessionTemplate().selectOne(
				"ActivityAsk.getValidationcodeMapByParam", param);
	}

	public List<Map<String, String>> getValidationcodesByCode(String validateCode) {
		return getSqlSessionTemplate().selectList("ActivityAsk.getValidationcodesByCode", validateCode);
	}

	public int updateActivityMobileValidationcode(Map<String, String> param) {
		return getSqlSessionTemplate().update("ActivityAsk.updateActivityMobileValidationcode", param);
	}

	public int insertActivityMobileValidationcode(Map<String, String> param) {
		return getSqlSessionTemplate().update("ActivityAsk.insertActivityMobileValidationcode", param);
	}

}

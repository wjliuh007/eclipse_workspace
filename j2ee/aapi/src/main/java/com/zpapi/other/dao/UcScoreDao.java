/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.dao;

import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatisUc3Dao;
import com.zpapi.other.model.UcScore;
import com.zpapi.other.query.UcScoreQuery;

@Repository
public class UcScoreDao extends BaseIbatisUc3Dao<UcScore, java.lang.Long> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "UcScore";
	}

	public void saveOrUpdate(UcScore entity) {
		if (entity.getUid() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(UcScoreQuery query) {
		return pageQuery("UcScore.findPage", query);
	}

	@Override
	public void saveOrUpdate(Object entity) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	public void insertScore(UcScore ucScore) {
		getSqlSessionTemplate().insert("UcScore.insertScore", ucScore);

	}

	public void updateScore(UcScore ucScore) {
		getSqlSessionTemplate().update("UcScore.updateScore", ucScore);

	}

	public void updateShopScore(Map<String, Object> pMap) {
		getSqlSessionTemplate().update("UcScore.updateShopScore", pMap);
	}

}

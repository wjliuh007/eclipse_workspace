/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtCard;
import com.zpapi.other.query.GtCardQuery;

@Repository
public class GtCardDao extends BaseIbatis3Dao<GtCard, java.lang.Integer> {
	@Override
	public String getIbatisMapperNamesapce() {
		return "GtCard";
	}

	public void saveOrUpdate(GtCard entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtCardQuery query) {
		return pageQuery("GtCard.findPage", query);
	}

	public Integer getValidCardCount(String cardnum) {

		return (Integer) getSqlSessionTemplate().selectOne("GtCard.getValidCardCount", cardnum);
	}

	public Integer getBatchIdByNum(String cardnum) {
		return (Integer) getSqlSessionTemplate().selectOne("GtCard.getBatchIdByNum", cardnum);
	}

	public GtCard getCardInfo(Map map) {
		GtCard card = (GtCard) getSqlSessionTemplate().selectOne("GtCard.getCardInfo", map);
		return card;
	}

	public Integer editCardInfo(Map<String, String> map) {
		Integer ret = getSqlSessionTemplate().update("GtCard.editCardInfo", map);
		return ret;
	}

	public Integer getCardCount(String num) {
		Integer ret = (Integer) getSqlSessionTemplate().selectOne("GtCard.getCardCount", num);
		return ret;
	}

}

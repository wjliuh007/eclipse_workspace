/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtPointCard;
import com.zpapi.other.model.GtPointCardTask;
import com.zpapi.other.query.GtPointCardQuery;

@Repository
public class GtPointCardDao extends BaseIbatis3Dao<GtPointCard, java.lang.Long> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtPointCard";
	}

	@Override
	public void saveOrUpdate(GtPointCard entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtPointCardQuery query) {
		return pageQuery("GtPointCard.findPage", query);
	}

	public GtPointCard getPointCard(String cardnum) {
		List<GtPointCard> lst = getSqlSessionTemplate().selectList("GtPointCard.getCard", cardnum);
		return lst.size() > 0 ? lst.get(0) : null;
	}

	public GtPointCardTask getPointCard(Map map) {
		GtPointCardTask point = (GtPointCardTask) getSqlSessionTemplate().selectOne(
				"GtPointCard.getCardAndTask", map);
		return point;
	}

	public Integer getCardCount(String cardnum) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtPointCard.getCardCount", cardnum);
		return count;
	}

	public Integer getValidCardCount(String cardnum) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtPointCard.getValidCardCount", cardnum);
		return count;
	}

	public Integer checkPointCard(Map map) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtPointCard.checkPointCard", map);
		return count;
	}

	public void createCard(GtPointCard gtPointCard) {
		getSqlSessionTemplate().insert("GtPointCard.createCard", gtPointCard);

	}

	public Integer getCardCountByTaskId(Map map) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtPointCard.getCardCountByTaskId", map);
		if (count == null) {
			count = 0;
		}
		return count;
	}

}

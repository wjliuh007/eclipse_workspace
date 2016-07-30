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
import com.zpapi.other.model.GtDiscountCard;
import com.zpapi.other.query.GtDiscountCardQuery;

@Repository
public class GtDiscountCardDao extends BaseIbatis3Dao<GtDiscountCard, java.lang.Integer> {
	@Override
	public String getIbatisMapperNamesapce() {
		return "GtDiscountCard";
	}

	public void saveOrUpdate(GtDiscountCard entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtDiscountCardQuery query) {
		return pageQuery("GtDiscountCard.findPage", query);
	}

	public GtDiscountCard[] getDiscountcardInfo(String cardnum) {
		List<GtDiscountCard> lst = getSqlSessionTemplate().selectList("GtDiscountCard.getDiscountcardInfo",
				cardnum);
		return lst.toArray(new GtDiscountCard[0]);
	}

	public GtDiscountCard getDiscountCard(String cardnum) {
		return (GtDiscountCard) getSqlSessionTemplate().selectOne("GtDiscountCard.getDiscountcardInfo",
				cardnum);
	}

	public Integer getCardCount(String cardnum) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtDiscountCard.getCardCount", cardnum);
		return count;
	}

	public Integer getValidCardCount(String cardnum) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtDiscountCard.getValidCardCount",
				cardnum);
		return count;
	}

	public void createCard(GtDiscountCard card) {
		getSqlSessionTemplate().insert("GtDiscountCard.createCard", card);

	}

	public Integer getcardType(Map<String, Object> param) {
		return (Integer) getSqlSessionTemplate().selectOne("ZpuserRegCoupon.getcardType", param);
	}

}

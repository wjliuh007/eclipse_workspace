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
import com.zpapi.other.model.GtGiftCard;
import com.zpapi.other.query.GtGiftCardQuery;

@Repository
public class GtGiftCardDao extends BaseIbatis3Dao<GtGiftCard, java.lang.Long> {
	@Override
	public String getIbatisMapperNamesapce() {
		return "GtGiftCard";
	}

	public void saveOrUpdate(GtGiftCard entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtGiftCardQuery query) {
		return pageQuery("GtGiftCard.findPage", query);
	}

	public GtGiftCard getGiftCard(String cardnum) {
		List<GtGiftCard> lst = getSqlSessionTemplate().selectList("GtGiftCard.getCard", cardnum);
		return lst.get(0);
	}

	public Integer getCardCount(String cardnum) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtGiftCard.getCardCount", cardnum);
		return count;
	}

	public Integer getValidCardCount(String cardnum) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtGiftCard.getValidCardCount", cardnum);
		return count;
	}

}

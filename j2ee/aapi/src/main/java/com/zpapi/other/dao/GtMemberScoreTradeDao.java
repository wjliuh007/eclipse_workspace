/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtMemberScoreTrade;
import com.zpapi.other.query.GtMemberScoreTradeQuery;

@Repository
public class GtMemberScoreTradeDao extends BaseIbatis3Dao<GtMemberScoreTrade, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtMemberScoreTrade";
	}

	public void saveOrUpdate(GtMemberScoreTrade entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtMemberScoreTradeQuery query) {
		return pageQuery("GtMemberScoreTrade.findPage", query);
	}

	public Page getScoreTradeList(GtMemberScoreTradeQuery query) {
		return pageQuery("GtMemberScoreTrade.getScoreTradeList", query);
	}

	public Long getScoreByOrderSN(Long ordersn) {
		return (Long) getSqlSessionTemplate().selectOne("GtMemberScoreTrade.getScoreByOrderSN", ordersn);
	}

	public void addScoreTrade(GtMemberScoreTradeQuery query) {
		getSqlSessionTemplate().insert("GtMemberScoreTrade.addScoreTrade", query);
	}

	public Long getScoreBymemberId(String memberid) {

		return (Long) getSqlSessionTemplate().selectOne("GtMemberScoreTrade.getScoreBymemberId", memberid);
	}

	public Page getScoreDetailed(GtMemberScoreTradeQuery query) {
		return pageQuery("GtMemberScoreTrade.getScoreDetailed", query);
	}

}

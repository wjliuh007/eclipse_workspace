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

import com.zhen.commons.base.BaseIbatisShopzpReadOnlyDao;
import com.zpapi.other.model.GtQuanCard;
import com.zpapi.other.query.GtQuanCardQuery;

@Repository
public class GtQuanCardRoDao extends BaseIbatisShopzpReadOnlyDao<GtQuanCard, java.lang.Long> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtQuanCard";
	}

	@Override
	public void saveOrUpdate(GtQuanCard entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtQuanCardQuery query) {
		return pageQuery("GtQuanCard.findPage", query);
	}

	public Integer countQuan(Map map) {

		return (Integer) getSqlSessionTemplate().selectOne("GtQuanCard.countQuan", map);
	}

	public Integer activeCount(Map map) {
		return (Integer) getSqlSessionTemplate().selectOne("GtQuanCard.activeCount", map);
	}

	public GtQuanCard[] getQuanList(GtQuanCardQuery query) {
		List<GtQuanCard> lst = getSqlSessionTemplate().selectList("GtQuanCard.getQuanList", query);
		return lst.toArray(new GtQuanCard[0]);
	}

	public Page getQuanLists(GtQuanCardQuery query) {
		return pageQuery("GtQuanCard.getQuanList", query);
	}

	public GtQuanCard[] getCardInfo(Map<String, String> map) {
		List<GtQuanCard> lst = getSqlSessionTemplate().selectList("GtQuanCard.getCardInfo", map);
		return lst.toArray(new GtQuanCard[0]);
	}

	public GtQuanCard[] getQuancardInfo(Map<String, Object> map) {
		List<GtQuanCard> lst = getSqlSessionTemplate().selectList("GtQuanCard.getQuancardInfo", map);
		return lst.toArray(new GtQuanCard[0]);
	}

	public GtQuanCard getQuanCard(Map map) {
		GtQuanCard card = (GtQuanCard) getSqlSessionTemplate().selectOne("GtQuanCard.getQuancardInfo", map);
		return card;
	}

	public GtQuanCard[] getQuanCardList(String memberid) {
		List<GtQuanCard> lst = getSqlSessionTemplate().selectList("GtQuanCard.getQuanCard", memberid);
		return lst.toArray(new GtQuanCard[0]);
	}

	public Integer[] getQuanMoney(Map<String, String> map) {
		List<Integer> lst = getSqlSessionTemplate().selectList("GtQuanCard.getQuanMoney", map);
		return lst.toArray(new Integer[0]);
	}

	public Integer changeQuancardInfo(Map<String, String> map) {
		Integer ret = getSqlSessionTemplate().update("GtQuanCard.changeQuancardInfo", map);
		return ret;
	}

	public Integer editQuancardInfo(Map<String, String> map) {
		Integer ret = getSqlSessionTemplate().update("GtQuanCard.editQuancardInfo", map);
		return ret;
	}

	public Integer refundQuancard(Map<String, Object> map) {
		return getSqlSessionTemplate().update("GtQuanCard.refundQuancard", map);
	}

	public void addToQuan(GtQuanCard card) {
		getSqlSessionTemplate().insert("GtQuanCard.addCard", card);
	}

	public List<GtQuanCard> getByMemberIdAndOrderSn(Map<String, Object> pMap) {
		return getSqlSessionTemplate().selectList("GtQuanCard.getByMemberIdAndOrderSn", pMap);
	}

	/**
	 * 该方法用户通过OrderSn获取优惠券
	 * 
	 * @param pMap
	 *            {sourceOrderSn : Long, cardType : Integer, status : Integer}
	 */
	public List<GtQuanCard> getBySourceOrderSnAndStatus(Map<String, Object> pMap) {
		return getSqlSessionTemplate().selectList("GtQuanCard.getBySourceOrderSn", pMap);
	}

}

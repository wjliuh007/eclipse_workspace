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
import com.zpapi.other.model.GtMyOrderListNew;
import com.zpapi.other.model.GtOrderProduct;
import com.zpapi.other.model.GtOrdersItem;
import com.zpapi.other.query.GtEvaluateProductListQuery;
import com.zpapi.other.query.GtOrdersItemQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */
@Repository
public class GtOrdersItemDao extends BaseIbatis3Dao<GtOrdersItem, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtOrdersItem";
	}

	@Override
	public void saveOrUpdate(GtOrdersItem entity) {
		if (entity.getOrderItemId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtOrdersItemQuery query) {
		return pageQuery("GtOrdersItem.findPage", query);
	}

	public GtOrdersItem[] getOrderByitemid(String orderitemid) {
		List<GtOrdersItem> lst = getSqlSessionTemplate().selectList("GtOrdersItem.getOrderByitemid",
				orderitemid);
		return lst.toArray(new GtOrdersItem[0]);
	}

	public Integer getunevaluateproduct(Map map) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtOrdersItem.getunevaluateproduct", map);
		return count;
	}

	public Page getEvaluateProductList(GtEvaluateProductListQuery query) {

		return pageQuery("GtOrdersItem.getEvaluateProductList", query);
	}

	public void addOrderItems(GtOrdersItem model) {
		getSqlSessionTemplate().insert("GtOrdersItem.addOrderItems", model);

	}

	public GtOrdersItem queryByLastOne(GtOrdersItem model) {
		List<GtOrdersItem> lst = getSqlSessionTemplate().selectList("GtOrdersItem.queryByLastOne", model, 0,
				1);
		return lst.get(0);
	}

	public List<GtOrdersItem> getByOrderId(Integer orderid) {
		return getSqlSessionTemplate().selectList("GtOrdersItem.getByOrderId", orderid);
	}

	public GtOrderProduct[] getOrderProduct(String orderid) {
		List<GtOrderProduct> lst = getSqlSessionTemplate()
				.selectList("GtOrdersItem.getOrderProduct", orderid);
		return lst.toArray(new GtOrderProduct[0]);
	}

	public GtOrderProduct[] getMemberItemProduct(Map<String, Object> param) {
		List<GtOrderProduct> lst = getSqlSessionTemplate().selectList("GtOrdersItem.getMemberProduct", param);
		return lst.toArray(new GtOrderProduct[0]);
	}

	public Integer checkOrderItemIsValid(Map<String, Object> param) {
		return (Integer) getSqlSessionTemplate().selectOne("GtOrdersItem.getOrderItemCount", param);
	}

	public Integer getnoPayStatus(String memberid) {
		Integer count = (Integer) getSqlSessionTemplate().selectOne("GtOrdersItem.getnoPayStatus", memberid);
		return count;
	}

	public List<GtMyOrderListNew> getImgessList(Integer orderId) {
		// TODO Auto-generated method stub
		return getSqlSessionTemplate().selectList("GtOrdersItem.getImgessList", orderId);
	}

	public List<GtOrdersItem> getDHLOrderItemInfo(String orderSn) {
		return getSqlSessionTemplate().selectList("GtOrdersItem.getDHLOrderItemInfo", orderSn);
	}

	public Long getRejectScore(Long orderSn) {
		return (Long) getSqlSessionTemplate().selectOne("GtOrdersItem.getRejectScore", orderSn);
	}

	public List<GtOrdersItem> getDHLExpressOrderItem(String orderSn) {
		return getSqlSessionTemplate().selectList("GtOrdersItem.getDHLExpressOrderItem", orderSn);
	}

	public GtOrdersItem getOrderBysplit(Map tmpmap) {
		return (GtOrdersItem) getSqlSessionTemplate().selectOne("GtOrdersItem.getOrderBysplit", tmpmap);

	}

	public List<GtMyOrderListNew> getSendImageList(Integer orderId) {

		return getSqlSessionTemplate().selectList("GtSendOrdersItem.getImgessList", orderId);
	}

	public GtOrderProduct[] getSendOrderProduct(String orderid) {
		List<GtOrderProduct> lst = getSqlSessionTemplate().selectList("GtOrdersItem.getSendOrderProduct",
				orderid);
		return lst.toArray(new GtOrderProduct[0]);
	}

}

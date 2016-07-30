/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zpapi.other.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtOrdersNew;
import com.zpapi.other.model.GtSendOrderInfo;
import com.zpapi.other.model.GtSendOrders;
import com.zpapi.other.query.GtSendOrdersQuery;

@Repository
public class GtSendOrdersDao extends BaseIbatis3Dao<GtSendOrders, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtSendOrders";
	}

	@Override
	public void saveOrUpdate(GtSendOrders entity) {
		if (entity.getSendOrderId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtSendOrdersQuery query) {
		return pageQuery("GtSendOrders.findPage", query);
	}

	public List<GtSendOrders> getByOrderSn(Map<String, String> queryParam) {
		return getSqlSessionTemplate().selectList("GtSendOrders.getByOrderSn", queryParam);
	}

	public void insertData(GtSendOrders gtSendOrders) {
		getSqlSessionTemplate().insert("GtSendOrders.insertData", gtSendOrders);
	}

	public void updateSendOrderStatus(GtSendOrders order) {
		getSqlSessionTemplate().update("GtSendOrders.updateSendOrderStatus", order);

	}

	public GtSendOrders getOrderLockById(Integer sendorderid) {

		return (GtSendOrders) getSqlSessionTemplate().selectOne("GtSendOrders.getOrderLockById", sendorderid);
	}

	public int updateCancleOrderById(GtSendOrders order) {

		return getSqlSessionTemplate().update("GtSendOrders.updateCancleOrderById", order);
	}

	public List<GtSendOrders> getOrderByOrderId(Map<String, Object> map) {

		return getSqlSessionTemplate().selectList("GtSendOrders.getOrderByOrderId", map);
	}

	public List<GtSendOrderInfo> getOrderByGenerationSn(String generationSn) {

		return getSqlSessionTemplate().selectList("GtSendOrders.getOrderByGenerationSn", generationSn);
	}

	public Integer updateScore(GtSendOrders orders) {

		return getSqlSessionTemplate().update("GtSendOrders.updateScore", orders);
	}

	public GtSendOrders getExpressGenerationSn(long expressGenerationSn) {
		return (GtSendOrders) getSqlSessionTemplate().selectOne("GtSendOrders.getExpressGenerationSn",
				expressGenerationSn);
	}

	public Integer updateExpressGenerationSn(GtSendOrders orderInfo) {

		return getSqlSessionTemplate().update("GtSendOrders.updateExpressGenerationSn", orderInfo);
	}

	public Integer updateExpressSn(GtSendOrders orderInfo) {

		return getSqlSessionTemplate().update("GtSendOrders.updateExpressSn", orderInfo);
	}

	public GtSendOrders getByOrderSnWithLock(Long orderSn) {

		return (GtSendOrders) getSqlSessionTemplate().selectOne("GtSendOrders.getByOrderSnWithLock", orderSn);
	}

	public Integer frontDeleteOrder(Long orderSn) {

		return getSqlSessionTemplate().update("GtSendOrders.frontDeleteOrder", orderSn);
	}

	public GtOrdersNew getSendOrderList(Map<String, Object> itemMap) {

		return (GtOrdersNew) getSqlSessionTemplate().selectOne("GtOrders.getSendOrderList", itemMap);
	}

	public GtSendOrders getParantSendOrder(Integer orderId) {

		return (GtSendOrders) getSqlSessionTemplate().selectOne("GtSendOrders.getParantSendOrder", orderId);
	}

	public int getWarehouseShelf(Integer productSpecId) {

		return (Integer) getSqlSessionTemplate().selectOne("GtSendOrders.getWarehouseShelf", productSpecId);
	}

	public void updateOrderStatusDone(String orderId) {
		getSqlSessionTemplate().update("GtOrders.updateOrderStatusDone", orderId);
	}

	public List<GtSendOrders> getSendOrdersByIds(Map<String, Object> map) {
		return getSqlSessionTemplate().selectList("GtSendOrders.getSendOrdersByIds", map);
	}

	public GtSendOrders getSendOrderByParant(GtSendOrders gtSendOrders) {
		return (GtSendOrders) getSqlSessionTemplate().selectOne("GtSendOrders.getSendOrderByParant",
				gtSendOrders);
	}

}

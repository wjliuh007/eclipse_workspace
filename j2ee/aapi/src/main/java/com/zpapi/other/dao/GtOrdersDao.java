/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import java.util.List;
import java.util.Map;

import javacommon.CacheKeyConst;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3Dao;
import com.zpapi.other.model.GtCancelReason;
import com.zpapi.other.model.GtOrderInfo;
import com.zpapi.other.model.GtOrders;
import com.zpapi.other.model.GtOrdersNew;
import com.zpapi.other.query.GtMyOrdersQuery;
import com.zpapi.other.query.GtOrdersQuery;
import com.zpapi.other.query.GtRefundQuery;
import com.zpapi.other.query.GtRefundsQuery;
import com.zpapi.other.util.CacheUtil;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Repository
public class GtOrdersDao extends BaseIbatis3Dao<GtOrders, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtOrders";
	}

	@Override
	public void saveOrUpdate(GtOrders entity) {
		if (entity.getOrderId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtOrdersQuery query) {
		return pageQuery("GtOrders.findPage", query);
	}

	public Page gtOrder(GtOrdersQuery query) {
		return pageQuery("GtOrders.gtOrder", query);
	}

	public GtOrderInfo[] getOrderInfo(String ordersn) {
		List<GtOrderInfo> lst = getSqlSessionTemplate().selectList("GtOrders.getOrderInfo", ordersn);
		return lst.toArray(new GtOrderInfo[0]);
	}

	public Page getmyorders(GtMyOrdersQuery query) {

		return pageQuery("GtOrders.getmyorders", query);
	}

	public Page getMyOrderList(GtMyOrdersQuery query) {
		return pageQuery("GtOrders.getMyOrderList", query);
	}

	public GtOrdersNew getMyOrderListNew(Map<String, Long> itemMap) {
		return (GtOrdersNew) getSqlSessionTemplate().selectOne("GtOrders.getMyOrderListNew", itemMap);
	}

	public GtOrders[] getOrderBysn(Map<String, String> map) {
		List<GtOrders> lst = getSqlSessionTemplate().selectList("GtOrders.getOrderBysn", map);
		return lst.toArray(new GtOrders[0]);
	}

	public List<Map<String, Object>> getTaskidInOrdersitemByorderId(String orderId) {
		return getSqlSessionTemplate().selectList("GtOrders.getTaskidInOrdersitemByorderId", orderId);
	}

	public GtOrders[] getByOrderSn(Long ordersn) {
		List<GtOrders> lst = getSqlSessionTemplate().selectList("GtOrders.getByOrderSn", ordersn);
		return lst.toArray(new GtOrders[0]);
	}

	public GtOrders getOrderBysnWithLock(long orderSn) {
		return (GtOrders) getSqlSessionTemplate().selectOne("GtOrders.getOrderBysnWithLock", orderSn);
	}

	public Integer creatOrder(GtOrders model) {

		return getSqlSessionTemplate().insert("GtOrders.creatOrder", model);
	}

	public void cancelOrder(String orderId) {
		getSqlSessionTemplate().insert("GtOrders.cancel", orderId);
	}

	public GtOrders queryByLastOne(String orderId) {
		List<GtOrders> lst = getSqlSessionTemplate().selectList("GtOrders.getById", orderId);
		return lst.get(0);
	}

	public GtOrders getByIdWithLock(Integer orderId) {
		return (GtOrders) getSqlSessionTemplate().selectOne("GtOrders.getByIdForUpdate", orderId);
	}

	public int updateById(GtOrders order) {
		return getSqlSessionTemplate().update("GtOrders.update", order);
	}

	public GtOrderInfo[] getOrderInfoByPay(String ordersn) {
		List<GtOrderInfo> lst = getSqlSessionTemplate().selectList("GtOrders.getOrderInfoByPay", ordersn);
		return lst.toArray(new GtOrderInfo[0]);
	}

	public void updateOrder(GtOrders orders) {
		getSqlSessionTemplate().update("GtOrders.updateOrder", orders);

	}

	/**
	 * 
	 * @Title: payOrder
	 * @Description: 支付用，只更新支付相关字段，避免破坏其他数据
	 * @param orders
	 * @return
	 * @author zhupengren
	 * @date 2015年2月5日 下午4:53:15
	 */
	public int payOrderOnline(GtOrders orders) {
		return getSqlSessionTemplate().update("GtOrders.payOrderOnline", orders);
	}

	public Integer getOrdersByStatus(GtOrdersQuery query) {
		return (Integer) getSqlSessionTemplate().selectOne("GtOrders.getOrdersByStatus", query);

	}

	public Long getSendOrdersByStatus(GtOrdersQuery query) {
		return (Long) getSqlSessionTemplate().selectOne("GtOrders.getMySendOrderList.count", query);

	}

	public void updateStatus(GtOrders order) {
		getSqlSessionTemplate().update("GtOrders.updateStatus", order);
	}

	public GtOrders getOrderInfoByUserId(Map<String, Object> map) {
		return (GtOrders) getSqlSessionTemplate().selectOne("GtOrders.getOrderInfoByUserId", map);
	}

	public GtOrders getOrderByRefundOrderId(Integer refundOrderId) {
		return (GtOrders) getSqlSessionTemplate()
				.selectOne("GtOrders.getOrderByRefundOrderId", refundOrderId);
	}

	public void updateSFExpress(GtOrders orders) {
		getSqlSessionTemplate().update("GtOrders.updateSFExpressSn", orders);
	}

	public List<GtOrderInfo> printSFExpress(String orderSn) {
		return getSqlSessionTemplate().selectList("GtOrders.printSFExpress", orderSn);
	}

	public int updateSFExpressStatus(GtOrders orders) {
		return getSqlSessionTemplate().update("GtOrders.updateSFExpressStatus", orders);

	}

	public Integer frontDeleteOrder(Long ordersn) {
		return getSqlSessionTemplate().update("GtOrders.frontDeleteOrder", ordersn);
	}

	public Page getRefundList(GtRefundsQuery query) {
		return pageQuery("GtOrders.getRefundList", query);
	}

	public Page getMyOrderListNews(GtOrdersQuery ordersQuery) {
		return pageQuery("GtOrders.getMyOrderListNew", ordersQuery);
	}

	public Long getMemberOrderCount(String memberid) {
		return (Long) getSqlSessionTemplate().selectOne("GtOrders.getMemberOrderCount", memberid);
	}

	public void creatAdsOrder(Map<String, Object> adsMap) {
		getSqlSessionTemplate().insert("GtOrdersAds.creatAdsOrder", adsMap);
	}

	// 临时解决方案，订单完全缓存时删除此方法
	public void setOrderCache(GtOrders order) {
		CacheUtil.set(GtOrders.CackeKey_sn + order.getOrderSn(), order, CacheKeyConst.cacheTime_day);
	}

	public List<GtRefundQuery> getRefundLists(String memberid) {
		return getSqlSessionTemplate().selectList("GtOrders.getRefundList", memberid);
	}

	public List<GtCancelReason> getCancelReason() {

		return getSqlSessionTemplate().selectList("GtOrders.getCancelReason", null);
	}

	public List<Integer> countStorageByOrderid(String orderId) {
		return getSqlSessionTemplate().selectList("GtOrders.countStorageByOrderid", orderId);

	}

	public GtOrders getDataByOrderid(String orderId) {
		// TODO Auto-generated method stub
		return (GtOrders) getSqlSessionTemplate().selectOne("GtOrders.getDataByOrderid", orderId);
	}

	// 海外购支付宝获得外币金额
	public void updateFee(Map<String, Object> map) {
		getSqlSessionTemplate().update("GtOrders.updateFee", map);
	}

	public Integer updateOrderStatus(GtOrders order) {
		return getSqlSessionTemplate().update("GtOrders.updateOrderStatus", order);
	}

	public Page getMySendOrderList(GtOrdersQuery query) {

		return pageQuery("GtOrders.getMySendOrderList", query);
	}

	public Long getMemberSendOrderCount(String memberid) {

		return (Long) getSqlSessionTemplate().selectOne("GtOrders.getMemberSendOrderCount", memberid);
	}

	/**
	 * 获取海外清关限额
	 * 
	 * @param storage_id
	 *            仓库ID
	 * @return
	 */
	public String getCountryQuota(int storage_id) {
		return (String) getSqlSessionTemplate().selectOne("GtOrders.getCountryQuota", storage_id);
	}
}

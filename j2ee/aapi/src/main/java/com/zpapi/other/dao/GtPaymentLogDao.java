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
import com.zpapi.other.model.GtPaymentLog;
import com.zpapi.other.model.PaymentLog;
import com.zpapi.other.query.GtPaymentLogQuery;

@Repository
public class GtPaymentLogDao extends BaseIbatis3Dao<GtPaymentLog, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtPaymentLog";
	}

	public void saveOrUpdate(GtPaymentLog entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtPaymentLogQuery query) {
		return pageQuery("GtPaymentLog.findPage", query);
	}

	/*
	 * public Page findPaymentLogBySn(String refundMoneyOrderSn) { return
	 * pageQuery("GtPaymentLog.findPage",refundMoneyOrderSn); }
	 */

	public GtPaymentLog findPaymentLogBySn(String refundMoneyOrderSn) {
		// return pageQuery("GtPaymentLog.findPage",refundMoneyOrderSn);
		return (GtPaymentLog) getSqlSessionTemplate().selectOne("GtPaymentLog.findPaymentLogBySn",
				refundMoneyOrderSn);
	}

	public PaymentLog[] getPaymentLog(String outTradeNo) {
		List<PaymentLog> lst = (List<PaymentLog>) getSqlSessionTemplate().selectList(
				"GtPaymentLog.getPaymentLog", outTradeNo);
		return lst.toArray(new PaymentLog[0]);
	}

	@SuppressWarnings("unchecked")
	public List<GtPaymentLog> getPayMentLogs(Map<String, Object> param) {
		return getSqlSessionTemplate().selectList("GtPaymentLog.getPayMentLogs", param);
	}

	@SuppressWarnings("unchecked")
	public List<GtPaymentLog> getPayMentLogsWithLock(Map<String, Object> param) {
		return getSqlSessionTemplate().selectList("GtPaymentLog.getPayMentLogsWithLock", param);
	}

	public PaymentLog[] getPaymentLogByOrdrsn(String outTradeNo) {
		List<PaymentLog> lst = (List<PaymentLog>) getSqlSessionTemplate().selectList(
				"GtPaymentLog.getPaymentLogByOredrsn", outTradeNo);
		return lst.toArray(new PaymentLog[0]);
	}

	public void insertPaymentLog(GtPaymentLog paymentlog) {
		getSqlSessionTemplate().insert("GtPaymentLog.insertPaymentLog", paymentlog);
	}

	public void insertPaymentOverLog(GtPaymentLog paymentlog) {
		getSqlSessionTemplate().insert("GtPaymentLog.insertPaymentOverLog", paymentlog);
	}

	public void changePaymentLogByPay(GtPaymentLog paymentlog) {
		getSqlSessionTemplate().update("GtPaymentLog.changePaymentLogByPay", paymentlog);
	}

	/**
	 * 通过订单ID获取已经支付(支付状态status=1)的订单， 为了通用性，返回List，该查询正确结果返回最多一个结果。
	 * 
	 * @param orderSn
	 *            订单Id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<GtPaymentLog> getFinishedByOrderSn(Long orderSn) {
		return getSqlSessionTemplate().selectList("GtPaymentLog.getFinishedByOrderSn", orderSn);
	}

	public GtPaymentLog getFinishedByPaySn(Long paySn) {
		return (GtPaymentLog) getSqlSessionTemplate().selectOne("GtPaymentLog.getFinishedByPaySn", paySn);
	}

	public List<GtPaymentLog> getFinishedHaierByPaySn(Long paySn) {
		return (List<GtPaymentLog>) getSqlSessionTemplate().selectList(
				"GtPaymentLog.getFinishedHaierByPaySn", paySn);
	}

	@SuppressWarnings("unchecked")
	public List<GtPaymentLog> getCustomsByOrderSn(String orderSn) {
		return getSqlSessionTemplate().selectList("GtPaymentLog.getCustomsByOrderSn", orderSn);
	}

}

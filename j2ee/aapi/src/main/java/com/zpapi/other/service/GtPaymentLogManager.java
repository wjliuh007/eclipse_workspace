/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.EntityDao;
import com.zhen.commons.base.BaseManager;
import com.zpapi.other.dao.GtPaymentLogDao;
import com.zpapi.other.model.GtPaymentLog;
import com.zpapi.other.model.PaymentLog;
import com.zpapi.other.query.GtPaymentLogQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service("gtPaymentLogManager")
@Transactional
public class GtPaymentLogManager extends BaseManager<GtPaymentLog, java.lang.Integer> {

	private GtPaymentLogDao gtPaymentLogDao;

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写 */
	public void setGtPaymentLogDao(GtPaymentLogDao dao) {
		this.gtPaymentLogDao = dao;
	}

	@Override
	public EntityDao getEntityDao() {
		return this.gtPaymentLogDao;
	}

	@Transactional(readOnly = true)
	public Page findPage(GtPaymentLogQuery query) {
		return gtPaymentLogDao.findPage(query);
	}

	public PaymentLog[] getPaymentLogByPay(String outTradeNo) {
		return gtPaymentLogDao.getPaymentLog(outTradeNo);
	}

	public PaymentLog[] getPaymentLogByOrdrsn(String outTradeNo) {
		return gtPaymentLogDao.getPaymentLogByOrdrsn(outTradeNo);
	}

	public void insertPaymentLog(GtPaymentLog paymentlog) {
		gtPaymentLogDao.insertPaymentLog(paymentlog);
	}

	public void insertPaymentOverLog(GtPaymentLog paymentlog) {
		gtPaymentLogDao.insertPaymentOverLog(paymentlog);
	}

	public void changePaymentLogByPay(Integer id, String tradeno) {
		GtPaymentLog log = new GtPaymentLog();
		log.setId(id);
		log.setPaySerialNumber(tradeno);

		gtPaymentLogDao.changePaymentLogByPay(log);
	}

	@Transactional(readOnly = true)
	public GtPaymentLog findPaymentLogBySn(String refundMoneyOrderSn) {
		return gtPaymentLogDao.findPaymentLogBySn(refundMoneyOrderSn);
	}

	public GtPaymentLog getFinishedByPaySn(Long paySn) {
		return gtPaymentLogDao.getFinishedByPaySn(paySn);
	}

	public List<GtPaymentLog> getCustomsByOrderSn(String orderSn) {
		return gtPaymentLogDao.getCustomsByOrderSn(orderSn);
	}

	public List<GtPaymentLog> getFinishedhaierByPaySn(Long paySn) {
		return gtPaymentLogDao.getFinishedHaierByPaySn(paySn);
	}

}

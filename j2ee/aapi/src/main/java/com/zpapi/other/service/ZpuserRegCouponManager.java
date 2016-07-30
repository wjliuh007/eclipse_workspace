/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhen.commons.base.EntityDao;
import com.zhen.commons.base.BaseManager;
import com.zpapi.other.dao.GtCardDao;
import com.zpapi.other.dao.GtDiscountCardDao;
import com.zpapi.other.dao.GtGiftCardDao;
import com.zpapi.other.dao.GtPointCardDao;
import com.zpapi.other.dao.ZpuserRegCouponDao;
import com.zpapi.other.model.ZpuserRegCoupon;
import com.zpapi.other.query.GtCardQuery;
import com.zpapi.other.query.GtDiscountCardQuery;
import com.zpapi.other.query.GtGiftCardQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class ZpuserRegCouponManager extends BaseManager<ZpuserRegCoupon, java.lang.Integer> {

	private ZpuserRegCouponDao zpuserRegCouponDao;

	private GtPointCardDao gtPointCardDao;

	private GtCardDao gtCardDao;

	private GtGiftCardDao gtGiftCardDao;

	private GtDiscountCardDao gtDiscountCardDao;

	public GtPointCardDao getGtPointCardDao() {
		return gtPointCardDao;
	}

	public void setGtPointCardDao(GtPointCardDao gtPointCardDao) {
		this.gtPointCardDao = gtPointCardDao;
	}

	public GtCardDao getGtCardDao() {
		return gtCardDao;
	}

	public void setGtCardDao(GtCardDao gtCardDao) {
		this.gtCardDao = gtCardDao;
	}

	public GtGiftCardDao getGtGiftCardDao() {
		return gtGiftCardDao;
	}

	public void setGtGiftCardDao(GtGiftCardDao gtGiftCardDao) {
		this.gtGiftCardDao = gtGiftCardDao;
	}

	public GtDiscountCardDao getGtDiscountCardDao() {
		return gtDiscountCardDao;
	}

	public void setGtDiscountCardDao(GtDiscountCardDao gtDiscountCardDao) {
		this.gtDiscountCardDao = gtDiscountCardDao;
	}

	public ZpuserRegCouponDao getZpuserRegCouponDao() {
		return zpuserRegCouponDao;
	}

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写 */
	public void setZpuserRegCouponDao(ZpuserRegCouponDao dao) {
		this.zpuserRegCouponDao = dao;
	}

	@Override
	public EntityDao getEntityDao() {
		return this.zpuserRegCouponDao;
	}

	public List<ZpuserRegCoupon> getTaskId(int type, String chanle) {
		Map<String, Object> param = new HashMap<String, Object>(2);
		param.put("type", type);
		param.put("platform", chanle);
		return zpuserRegCouponDao.getTaskId(param);
	}

	public Integer getcardType(String channel, String taskid) {
		Map<String, Object> param = new HashMap<String, Object>(3);
		param.put("platform", channel);
		param.put("taskid", taskid);
		return gtDiscountCardDao.getcardType(param);
	}

	public Integer getCardCount(Integer cardType, Integer taskId, Long uid) {
		Integer count = 1;
		if (cardType == 1) {// 返券卡
			Map tmap = new HashMap();
			tmap.put("memberId", uid);
			tmap.put("taskId", taskId);
			count = gtPointCardDao.getCardCountByTaskId(tmap);
		} else if (cardType == 2) {// 满减卡
			GtDiscountCardQuery query = new GtDiscountCardQuery();
			query.setTaskId(taskId);
			query.setActiveMemberId(uid);
			count = gtDiscountCardDao.findPage(query).getTotalCount();
		} else if (cardType == 5) {// 礼品卡
			GtGiftCardQuery query = new GtGiftCardQuery();
			query.setTaskId(taskId);
			query.setActiveMemberId(uid);
			count = gtGiftCardDao.findPage(query).getTotalCount();
		} else if (cardType == 3) {// 打折卡
			GtCardQuery query = new GtCardQuery();
			query.setCardBatchId(taskId);
			query.setActiveMemberId(uid.intValue());
			count = gtCardDao.findPage(query).getTotalCount();
		}
		return count;
	}

	public Integer getOnloginCardCount(Integer cardType, Integer taskId, Long uid) {
		Integer count = 1;
		if (cardType == 0) {// 返券卡
			Map tmap = new HashMap();
			tmap.put("memberId", uid);
			tmap.put("taskId", taskId);
			count = gtPointCardDao.getCardCountByTaskId(tmap);
		} else if (cardType == 1) {// 满减卡
			GtDiscountCardQuery query = new GtDiscountCardQuery();
			query.setTaskId(taskId);
			query.setActiveMemberId(uid);
			count = gtDiscountCardDao.findPage(query).getTotalCount();
		} else if (cardType == 2) {// 礼品卡
			GtGiftCardQuery query = new GtGiftCardQuery();
			query.setTaskId(taskId);
			query.setActiveMemberId(uid);
			count = gtGiftCardDao.findPage(query).getTotalCount();
		} else if (cardType == 12) {// 打折卡
			GtCardQuery query = new GtCardQuery();
			query.setCardBatchId(taskId);
			query.setActiveMemberId(uid.intValue());
			count = gtCardDao.findPage(query).getTotalCount();
		}
		return count;
	}

}

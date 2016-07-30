package com.zpapi.activity.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.zpapi.activity.dao.ActivityAskDao;
import com.zpapi.activity.dao.ActivityAskMapper;
import com.zpapi.activity.model.ActivityAsk;
import com.zpapi.activity.query.ActivityAskQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class ActivityAskManager {
	private Logger logger = Logger.getLogger(ActivityAskManager.class);

	@Resource
	private ActivityAskDao activityAskDao;

	public ActivityAskMapper getActivityAskMapper() {
		return activityAskMapper;
	}

	public void setActivityAskMapper(ActivityAskMapper activityAskMapper) {
		this.activityAskMapper = activityAskMapper;
	}

	private ActivityAskMapper activityAskMapper;

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写 */
	public void setActivityAskDao(ActivityAskDao dao) {
		this.activityAskDao = dao;
	}

	// @Override
	// public EntityDao<?, ?> getEntityDao() {
	// // return this.activityAskDao;
	// }

	@Transactional(readOnly = true)
	public Page<?> findPage(ActivityAskQuery query) {
		return activityAskDao.findPage(query);
	}

	public ActivityAsk[] getQuestion(Integer level) {
		List<ActivityAsk> result = activityAskMapper.getQuestion(level);
		return result == null ? null : result.toArray(new ActivityAsk[0]);
	}

	public Integer checkRight(String idd) {
		return activityAskMapper.checkRight(idd);
	}

}
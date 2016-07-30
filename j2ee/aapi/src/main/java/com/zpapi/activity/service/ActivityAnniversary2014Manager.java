/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.activity.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseManager;
import com.zhen.commons.base.EntityDao;
import com.zpapi.activity.dao.ActivityAnniversary2014Dao;
import com.zpapi.activity.dao.ActivityAnniversary2014Mapper;
import com.zpapi.activity.model.ActivityAnniversary2014;
import com.zpapi.activity.query.ActivityAnniversary2014Query;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class ActivityAnniversary2014Manager extends BaseManager<ActivityAnniversary2014, java.lang.Integer> {

	private ActivityAnniversary2014Dao activityAnniversary2014Dao;
	private ActivityAnniversary2014Mapper activityAnniversary2014Mapper;

	public ActivityAnniversary2014Mapper getActivityAnniversary2014Mapper() {
		return activityAnniversary2014Mapper;
	}

	public void setActivityAnniversary2014Mapper(ActivityAnniversary2014Mapper activityAnniversary2014Mapper) {
		this.activityAnniversary2014Mapper = activityAnniversary2014Mapper;
	}

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写 */
	public void setActivityAnniversary2014Dao(ActivityAnniversary2014Dao dao) {
		this.activityAnniversary2014Dao = dao;
	}

	@Override
	public EntityDao getEntityDao() {
		return null;// this.activityAnniversary2014Dao;
	}

	@Transactional(readOnly = true)
	public Page findPage(ActivityAnniversary2014Query query) {
		return activityAnniversary2014Dao.findPage(query);
	}

	/***
	 * 根据memberid查询已经参与活动的程度
	 * 
	 * @param memberid
	 * @return Integer
	 */
	public Integer getLevel(String memberid) {
		ActivityAnniversary2014 aa2014 = activityAnniversary2014Mapper.findByMemberid(memberid);
		Integer level = new Integer(0);
		// 用户新的开始
		if (aa2014 == null) {
			ActivityAnniversary2014 act = new ActivityAnniversary2014();
			act.setFinished(0);
			act.setIsGetCard(0);
			act.setLevel(0);
			act.setMemberId(Long.valueOf(memberid));
			activityAnniversary2014Mapper.insert(act);
			level = act.getLevel() + 1;
		} else {
			level = aa2014.getLevel() + 1;
		}
		return level;
	}

	/**
	 * 根据memberid查询已经回答问题的次数
	 * 
	 * @param memberid
	 * @return Integer
	 */
	public Integer countByMemberid(String memberid) {
		return activityAnniversary2014Mapper.countByMemberid(memberid);
	}

	public Integer countAnswerByMemberid(String memberid) {
		return activityAnniversary2014Mapper.countAnswerByMemberid(memberid);
	}

}
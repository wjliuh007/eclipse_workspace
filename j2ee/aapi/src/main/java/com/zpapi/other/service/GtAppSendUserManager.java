/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.EntityDao;
import com.zhen.commons.base.BaseManager;
import com.zpapi.other.dao.GtAppSendUserDao;
import com.zpapi.other.model.GtAppSendUser;
import com.zpapi.other.model.GtAppSendUserQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class GtAppSendUserManager extends BaseManager<GtAppSendUser, java.lang.Integer> {

	private GtAppSendUserDao gtAppSendUserDao;

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写 */
	public void setGtAppSendUserDao(GtAppSendUserDao dao) {
		this.gtAppSendUserDao = dao;
	}

	@Override
	public EntityDao getEntityDao() {
		return this.gtAppSendUserDao;
	}

	@Transactional(readOnly = true)
	public Page findPage(GtAppSendUserQuery query) {
		return gtAppSendUserDao.findPage(query);
	}

	public void insert(GtAppSendUser user) {
		gtAppSendUserDao.insert(user);

	}

	public void updateByModel(GtAppSendUser appUser) {
		gtAppSendUserDao.updateByModel(appUser);
	}

	public Long countByModel(String model) {
		return gtAppSendUserDao.countByModel(model);

	}

	public Long count(GtAppSendUser appUser) {
		return gtAppSendUserDao.count(appUser);
	}

	public Long countidfa(String idfa) {

		return gtAppSendUserDao.countidfa(idfa);
	}

	public void updateByidfa(GtAppSendUser user) {
		gtAppSendUserDao.updateByidfa(user);
	}

}

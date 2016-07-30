/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.activity.dao;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatisActivity3Dao;
import com.zpapi.activity.model.ActivityAnniversary2014;
import com.zpapi.activity.query.ActivityAnniversary2014Query;

@Repository
public class ActivityAnniversary2014Dao extends
		BaseIbatisActivity3Dao<ActivityAnniversary2014, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "com.zpapi.activity.mapper.ActivityAnniversary2014";
	}

	public void saveOrUpdate(ActivityAnniversary2014 entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(ActivityAnniversary2014Query query) {
		return pageQuery("ActivityAnniversary2014.findPage", query);
	}

	public Integer findByMemberid(String memberid) {
		return (Integer) getSqlSessionTemplate()
				.selectOne("ActivityAnniversary2014.findByMemberid", memberid);
	}

	public Integer countByMemberid(String memberid) {
		return (Integer) getSqlSessionTemplate().selectOne(
				"com.zpapi.activity.mapper.ActivityAnniversary2014.countByMemberid", memberid);

	}

	public Integer countAnswerByMemberid(String memberid) {
		return (Integer) getSqlSessionTemplate().selectOne("ActivityAnniversary2014.countAnswerByMemberid",
				memberid);

	}

	public void insertNewOne(ActivityAnniversary2014 act) {

		getSqlSessionTemplate().insert("ActivityAnniversary2014.insertNewOne", act);
	}

	public void updateLevel(ActivityAnniversary2014 model) {
		// TODO Auto-generated method stub
		getSqlSessionTemplate().update("ActivityAnniversary2014.updateLevel", model);
	}

	@Override
	public void saveOrUpdate(Object entity) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	public void updateCard(ActivityAnniversary2014 model) {
		getSqlSessionTemplate().update("ActivityAnniversary2014.updateCard", model);

	}

	public Integer countCard(String memberid) {
		return (Integer) getSqlSessionTemplate().selectOne("ActivityAnniversary2014.countCard", memberid);
	}

}

/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.zhen.commons.base.BaseIbatisUc3Dao;
import com.zpapi.other.model.UcMemberLog;

@Repository
public class UcMemberLogDao extends BaseIbatisUc3Dao<UcMemberLog, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "UcMemberLog";
	}

	public void saveOrUpdate(UcMemberLog entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	@Override
	public void saveOrUpdate(Object entity) throws DataAccessException {

	}

	public void insertLog(UcMemberLog entity) {
		getSqlSessionTemplate().insert("UcMemberLog.insert", entity);

	}

}

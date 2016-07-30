/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatisUc3Dao;
import com.zpapi.other.model.UcMembers;
import com.zpapi.other.query.UcMembersQuery;

@Repository
public class UcMembersDao extends BaseIbatisUc3Dao<UcMembers, java.lang.Long> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "UcMembers";
	}

	public Page findPage(UcMembersQuery query) {
		return pageQuery("UcMembers.findPage", query);
	}

	public UcMembers getByUsername(java.lang.String v) {
		return (UcMembers) getSqlSessionTemplate().selectOne("UcMembers.getByUsername", v);
	}

	public UcMembers getByMobile(java.lang.String v) {
		return (UcMembers) getSqlSessionTemplate().selectOne("UcMembers.getByMobile", v);
	}

	public UcMembers getByEmail(java.lang.String v) {
		return (UcMembers) getSqlSessionTemplate().selectOne("UcMembers.getByEmail", v);
	}

	public void onRegister(UcMembersQuery query) {
		getSqlSessionTemplate().insert("UcMembers.onRegister", query);

	}

	public void onRegisterByMobileNumber(UcMembersQuery query) {
		getSqlSessionTemplate().insert("UcMembers.onRegisterByMobileNumber", query);

	}

	public Integer exitsUserName(String username) {
		return (Integer) getSqlSessionTemplate().selectOne("UcMembers.exitsUserName", username);
	}

	public Integer exitsEmail(String email) {
		return (Integer) getSqlSessionTemplate().selectOne("UcMembers.exitsEmail", email);
	}

	public Integer exitsMobile(String mobile) {
		return (Integer) getSqlSessionTemplate().selectOne("UcMembers.exitsMobile", mobile);
	}

	public Integer exitsSalt(Map<String, String> map) {
		return (Integer) getSqlSessionTemplate().selectOne("UcMembers.exitsSalt", map);
	}

	public UcMembers getUserByEmail(String email) {
		return (UcMembers) getSqlSessionTemplate().selectOne("UcMembers.getUserByEmail", email);
	}

	public UcMembers getUserByMobileNumber(String mobileNumber) {
		return (UcMembers) getSqlSessionTemplate().selectOne("UcMembers.getUserByMobileNumber", mobileNumber);
	}

	public Integer onLogin(Map<String, String> map) {
		return (Integer) getSqlSessionTemplate().selectOne("UcMembers.onLogin", map);
	}

	public String getSalt(Map<String, String> map) {
		return getSqlSessionTemplate().selectOne("UcMembers.getSalt", map).toString();
	}

	@Override
	public void saveOrUpdate(Object entity) throws DataAccessException {
		if (((UcMembers) entity).getUid() == null)
			save(entity);
		else
			update(entity);

	}

	public Integer checkMember(String memberid) {
		return (Integer) getSqlSessionTemplate().selectOne("UcMembers.checkMember", memberid);
	}

	public void updateErrorNum(UcMembers model) {
		getSqlSessionTemplate().update("UcMembers.updateErrorNum", model);
	}

	public void updateMobile(UcMembersQuery query) {
		getSqlSessionTemplate().update("UcMembers.updateMobile", query);

	}

	public void updateUid(UcMembersQuery query) {
		getSqlSessionTemplate().update("UcMembers.updateUid", query);

	}

	public void updateName(UcMembers model1) {
		getSqlSessionTemplate().update("UcMembers.updateName", model1);
	}

	public List<UcMembers> exutsOpenId(Map<String, String> paramMap) {
		return getSqlSessionTemplate().selectList("UcMembers.exitsOpenId", paramMap);
	}

	public void upThirdName(UcMembers up_uc) {
		getSqlSessionTemplate().update("UcMembers.ThirdUpdateName", up_uc);

	}

	public UcMembers exitThUser(Map tempMap) {
		return (UcMembers) getSqlSessionTemplate().selectOne("UcMembers.exitsThUser", tempMap);
	}

	public UcMembers bindAccount(Map<String, String> paraMap) {
		return (UcMembers) getSqlSessionTemplate().selectOne("UcMembers.bindAccount", paraMap);
	}

	public int bindAccountById(UcMembers ucMember) {
		return getSqlSessionTemplate().update("UcMembers.bindAccountById", ucMember);
	}

	public Long getUesrHasThirdId(Map<String, String> paraMap2) {
		return (Long) getSqlSessionTemplate().selectOne("UcMembers.UesrHasThirdId", paraMap2);
	}

	public int passwordToken(UcMembers uc) {

		return (Integer) getSqlSessionTemplate().selectOne("UcMembers.passwordToken", uc);
	}

}

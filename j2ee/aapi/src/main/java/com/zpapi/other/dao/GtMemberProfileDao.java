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

import com.zhen.commons.base.BaseIbatisGT3Dao;
import com.zpapi.other.model.GtMemberProfile;
import com.zpapi.other.query.GtMemberProfileQuery;

@Repository
public class GtMemberProfileDao extends BaseIbatisGT3Dao<GtMemberProfile, java.lang.Long> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtMemberProfile";
	}

	public void saveOrUpdate(GtMemberProfile entity) {
		if (entity.getMemberId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtMemberProfileQuery query) {
		return pageQuery("GtMemberProfile.findPage", query);
	}

	public GtMemberProfile getmyprofile(String memberid) {

		return (GtMemberProfile) getSqlSessionTemplate().selectOne("GtMemberProfile.getmyprofile", memberid);
	}

	public GtMemberProfile getMyProfileForUpdate(int memberid) {

		return (GtMemberProfile) getSqlSessionTemplate().selectOne("GtMemberProfile.getMyProfileForUpdate",
				memberid);
	}

	public Integer getmembergift(String memberid) {

		return (Integer) getSqlSessionTemplate().selectOne("GtMemberProfile.getmembergift", memberid);
	}

	public GtMemberProfile[] getAccount(Map<String, String> map) {
		List<GtMemberProfile> lst = getSqlSessionTemplate().selectList("GtMemberProfile.getAccount", map);
		return lst.toArray(new GtMemberProfile[0]);
	}

	public int updateMemberGift(Map map) {
		return getSqlSessionTemplate().update("GtMemberProfile.updateMemberGift", map);

	}

	public void updatePoint(Map map) {
		getSqlSessionTemplate().update("GtMemberProfile.updatePoint", map);
	}

	public void updateMoney(Map map) {
		getSqlSessionTemplate().update("GtMemberProfile.updateMoney", map);
	}

	public void addMemberProfile(GtMemberProfileQuery query) {
		getSqlSessionTemplate().insert("GtMemberProfile.addMemberProfile", query);
	}

	public void addMemberProfileByMobile(GtMemberProfileQuery query) {
		getSqlSessionTemplate().insert("GtMemberProfile.addMemberProfileByMobile", query);
	}

	/**
	 * 由于历史程序等造成数据原因，可能一个电话对应多条记录，只取最近插入的一条
	 * 
	 * @param mobile
	 * @return
	 */
	public GtMemberProfile getMemberProfileByMobile(String mobile) {
		return (GtMemberProfile) getSqlSessionTemplate().selectOne(
				"GtMemberProfile.getMemberProfileByMobile", mobile);
	}

	public void updateGift(Map map) {
		getSqlSessionTemplate().update("GtMemberProfile.updateGifts", map);
	}

	public int updateScore(Map map) {
		return getSqlSessionTemplate().update("GtMemberProfile.updateScore", map);
	}

	public Long getScore(String memberid) {
		Long score = (Long) getSqlSessionTemplate().selectOne("GtMemberProfile.getScoreByMemberId", memberid);
		return score;
	}

	public Long getMemberBalance(String memberid) {
		return (Long) getSqlSessionTemplate().selectOne("GtMemberProfile.getMemberBalance", memberid);
	}

	public Integer updateMemberBalance(Map<String, Long> map) {
		return getSqlSessionTemplate().update("GtMemberProfile.updateMemberBalance", map);
	}

	@Override
	public void saveOrUpdate(Object entity) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	public void updatename(GtMemberProfile model1) {
		getSqlSessionTemplate().update("GtMemberProfile.updatename", model1);

	}

	public void updateCustInfo(Map<String, Object> map) {
		getSqlSessionTemplate().update("GtMemberProfile.updateCustInfo", map);
	}

	public int vilidateID(Map<String, Object> map) {

		return (Integer) getSqlSessionTemplate().selectOne("GtMemberProfile.vilidateID", map);
	}

}

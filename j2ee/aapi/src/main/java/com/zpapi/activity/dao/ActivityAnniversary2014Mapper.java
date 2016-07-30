package com.zpapi.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.activity.model.ActivityAnniversary2014;
import com.zpapi.activity.model.ActivityAnniversary2014Example;

public interface ActivityAnniversary2014Mapper {
	int countByExample(ActivityAnniversary2014Example example);

	int deleteByExample(ActivityAnniversary2014Example example);

	int deleteByPrimaryKey(Integer id);

	int insert(ActivityAnniversary2014 record);

	int insertSelective(ActivityAnniversary2014 record);

	List<ActivityAnniversary2014> selectByExample(ActivityAnniversary2014Example example);

	ActivityAnniversary2014 selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") ActivityAnniversary2014 record,
			@Param("example") ActivityAnniversary2014Example example);

	int updateByExample(@Param("record") ActivityAnniversary2014 record,
			@Param("example") ActivityAnniversary2014Example example);

	int updateByPrimaryKeySelective(ActivityAnniversary2014 record);

	int updateByPrimaryKey(ActivityAnniversary2014 record);

	/** 根据memberid查询已经参与的问题数 */
	int countByMemberid(String memberid);

	ActivityAnniversary2014 findByMemberid(String memberid);

	int countAnswerByMemberid(String memberid);
}
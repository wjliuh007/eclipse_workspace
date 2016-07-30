package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtMemberProfile;
import com.zpapi.other.model.GtMemberProfileExample;
import com.zpapi.other.model.GtMemberProfileWithBLOBs;

public interface GtMemberProfileMapper {
	int countByExample(GtMemberProfileExample example);

	int deleteByExample(GtMemberProfileExample example);

	int deleteByPrimaryKey(Long memberId);

	int insert(GtMemberProfileWithBLOBs record);

	int insertSelective(GtMemberProfileWithBLOBs record);

	List<GtMemberProfileWithBLOBs> selectByExampleWithBLOBs(GtMemberProfileExample example);

	List<GtMemberProfile> selectByExample(GtMemberProfileExample example);

	GtMemberProfileWithBLOBs selectByPrimaryKey(Long memberId);

	int updateByExampleSelective(@Param("record") GtMemberProfileWithBLOBs record,
			@Param("example") GtMemberProfileExample example);

	int updateByExampleWithBLOBs(@Param("record") GtMemberProfileWithBLOBs record,
			@Param("example") GtMemberProfileExample example);

	int updateByExample(@Param("record") GtMemberProfile record,
			@Param("example") GtMemberProfileExample example);

	int updateByPrimaryKeySelective(GtMemberProfileWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(GtMemberProfileWithBLOBs record);

	int updateByPrimaryKey(GtMemberProfile record);
}
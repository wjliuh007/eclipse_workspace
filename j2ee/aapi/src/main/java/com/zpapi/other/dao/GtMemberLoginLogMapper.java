package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtMemberLoginLog;
import com.zpapi.other.model.GtMemberLoginLogExample;

public interface GtMemberLoginLogMapper {
	int countByExample(GtMemberLoginLogExample example);

	int deleteByExample(GtMemberLoginLogExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(GtMemberLoginLog record);

	int insertSelective(GtMemberLoginLog record);

	List<GtMemberLoginLog> selectByExample(GtMemberLoginLogExample example);

	GtMemberLoginLog selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") GtMemberLoginLog record,
			@Param("example") GtMemberLoginLogExample example);

	int updateByExample(@Param("record") GtMemberLoginLog record,
			@Param("example") GtMemberLoginLogExample example);

	int updateByPrimaryKeySelective(GtMemberLoginLog record);

	int updateByPrimaryKey(GtMemberLoginLog record);
}
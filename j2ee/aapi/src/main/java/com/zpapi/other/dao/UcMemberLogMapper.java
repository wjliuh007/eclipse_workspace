package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.UcMemberLog;
import com.zpapi.other.model.UcMemberLogExample;

public interface UcMemberLogMapper {
	int countByExample(UcMemberLogExample example);

	int deleteByExample(UcMemberLogExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(UcMemberLog record);

	int insertSelective(UcMemberLog record);

	List<UcMemberLog> selectByExample(UcMemberLogExample example);

	UcMemberLog selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") UcMemberLog record,
			@Param("example") UcMemberLogExample example);

	int updateByExample(@Param("record") UcMemberLog record, @Param("example") UcMemberLogExample example);

	int updateByPrimaryKeySelective(UcMemberLog record);

	int updateByPrimaryKey(UcMemberLog record);
}
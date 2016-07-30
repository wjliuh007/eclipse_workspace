package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtOrdersLog;
import com.zpapi.other.model.GtOrdersLogExample;

public interface GtOrdersLogMapper {
	int countByExample(GtOrdersLogExample example);

	int deleteByExample(GtOrdersLogExample example);

	int deleteByPrimaryKey(Integer logId);

	int insert(GtOrdersLog record);

	int insertSelective(GtOrdersLog record);

	List<GtOrdersLog> selectByExample(GtOrdersLogExample example);

	GtOrdersLog selectByPrimaryKey(Integer logId);

	int updateByExampleSelective(@Param("record") GtOrdersLog record,
			@Param("example") GtOrdersLogExample example);

	int updateByExample(@Param("record") GtOrdersLog record, @Param("example") GtOrdersLogExample example);

	int updateByPrimaryKeySelective(GtOrdersLog record);

	int updateByPrimaryKey(GtOrdersLog record);
}
package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtQuanCardLog;
import com.zpapi.other.model.GtQuanCardLogExample;

public interface GtQuanCardLogMapper {
	int countByExample(GtQuanCardLogExample example);

	int deleteByExample(GtQuanCardLogExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(GtQuanCardLog record);

	int insertSelective(GtQuanCardLog record);

	List<GtQuanCardLog> selectByExample(GtQuanCardLogExample example);

	GtQuanCardLog selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") GtQuanCardLog record,
			@Param("example") GtQuanCardLogExample example);

	int updateByExample(@Param("record") GtQuanCardLog record, @Param("example") GtQuanCardLogExample example);

	int updateByPrimaryKeySelective(GtQuanCardLog record);

	int updateByPrimaryKey(GtQuanCardLog record);
}
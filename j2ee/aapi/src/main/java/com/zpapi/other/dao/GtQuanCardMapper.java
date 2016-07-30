package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtQuanCard;
import com.zpapi.other.model.GtQuanCardExample;

public interface GtQuanCardMapper {
	int countByExample(GtQuanCardExample example);

	int deleteByExample(GtQuanCardExample example);

	int deleteByPrimaryKey(Long id);

	int insert(GtQuanCard record);

	int insertSelective(GtQuanCard record);

	List<GtQuanCard> selectByExample(GtQuanCardExample example);

	GtQuanCard selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") GtQuanCard record,
			@Param("example") GtQuanCardExample example);

	int updateByExample(@Param("record") GtQuanCard record, @Param("example") GtQuanCardExample example);

	int updateByPrimaryKeySelective(GtQuanCard record);

	int updateByPrimaryKey(GtQuanCard record);
}
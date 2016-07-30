package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtPointCard;
import com.zpapi.other.model.GtPointCardExample;

public interface GtPointCardMapper {
	int countByExample(GtPointCardExample example);

	int deleteByExample(GtPointCardExample example);

	int deleteByPrimaryKey(Long id);

	int insert(GtPointCard record);

	int insertSelective(GtPointCard record);

	List<GtPointCard> selectByExample(GtPointCardExample example);

	GtPointCard selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") GtPointCard record,
			@Param("example") GtPointCardExample example);

	int updateByExample(@Param("record") GtPointCard record, @Param("example") GtPointCardExample example);

	int updateByPrimaryKeySelective(GtPointCard record);

	int updateByPrimaryKey(GtPointCard record);
}
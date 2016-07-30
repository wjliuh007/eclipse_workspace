package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtOrdersItem;
import com.zpapi.other.model.GtOrdersItemExample;

public interface GtOrdersItemMapper {
	int countByExample(GtOrdersItemExample example);

	int deleteByExample(GtOrdersItemExample example);

	int deleteByPrimaryKey(Integer orderItemId);

	int insert(GtOrdersItem record);

	int insertSelective(GtOrdersItem record);

	List<GtOrdersItem> selectByExampleWithBLOBs(GtOrdersItemExample example);

	List<GtOrdersItem> selectByExample(GtOrdersItemExample example);

	GtOrdersItem selectByPrimaryKey(Integer orderItemId);

	int updateByExampleSelective(@Param("record") GtOrdersItem record,
			@Param("example") GtOrdersItemExample example);

	int updateByExampleWithBLOBs(@Param("record") GtOrdersItem record,
			@Param("example") GtOrdersItemExample example);

	int updateByExample(@Param("record") GtOrdersItem record, @Param("example") GtOrdersItemExample example);

	int updateByPrimaryKeySelective(GtOrdersItem record);

	int updateByPrimaryKeyWithBLOBs(GtOrdersItem record);

	int updateByPrimaryKey(GtOrdersItem record);
}
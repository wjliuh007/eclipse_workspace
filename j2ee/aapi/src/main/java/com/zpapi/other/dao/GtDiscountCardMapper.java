package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtDiscountCard;
import com.zpapi.other.model.GtDiscountCardExample;

public interface GtDiscountCardMapper {
	int countByExample(GtDiscountCardExample example);

	int deleteByExample(GtDiscountCardExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(GtDiscountCard record);

	int insertSelective(GtDiscountCard record);

	List<GtDiscountCard> selectByExample(GtDiscountCardExample example);

	GtDiscountCard selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") GtDiscountCard record,
			@Param("example") GtDiscountCardExample example);

	int updateByExample(@Param("record") GtDiscountCard record,
			@Param("example") GtDiscountCardExample example);

	int updateByPrimaryKeySelective(GtDiscountCard record);

	int updateByPrimaryKey(GtDiscountCard record);
}
package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtGiftCard;
import com.zpapi.other.model.GtGiftCardExample;

public interface GtGiftCardMapper {
	int countByExample(GtGiftCardExample example);

	int deleteByExample(GtGiftCardExample example);

	int deleteByPrimaryKey(Long id);

	int insert(GtGiftCard record);

	int insertSelective(GtGiftCard record);

	List<GtGiftCard> selectByExample(GtGiftCardExample example);

	GtGiftCard selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") GtGiftCard record,
			@Param("example") GtGiftCardExample example);

	int updateByExample(@Param("record") GtGiftCard record, @Param("example") GtGiftCardExample example);

	int updateByPrimaryKeySelective(GtGiftCard record);

	int updateByPrimaryKey(GtGiftCard record);
}
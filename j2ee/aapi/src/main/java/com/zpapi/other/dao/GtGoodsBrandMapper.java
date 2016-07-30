package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtGoodsBrand;
import com.zpapi.other.model.GtGoodsBrandExample;

public interface GtGoodsBrandMapper {
	int countByExample(GtGoodsBrandExample example);

	int deleteByExample(GtGoodsBrandExample example);

	int deleteByPrimaryKey(Integer brandId);

	int insert(GtGoodsBrand record);

	int insertSelective(GtGoodsBrand record);

	List<GtGoodsBrand> selectByExampleWithBLOBs(GtGoodsBrandExample example);

	List<GtGoodsBrand> selectByExample(GtGoodsBrandExample example);

	GtGoodsBrand selectByPrimaryKey(Integer brandId);

	int updateByExampleSelective(@Param("record") GtGoodsBrand record,
			@Param("example") GtGoodsBrandExample example);

	int updateByExampleWithBLOBs(@Param("record") GtGoodsBrand record,
			@Param("example") GtGoodsBrandExample example);

	int updateByExample(@Param("record") GtGoodsBrand record, @Param("example") GtGoodsBrandExample example);

	int updateByPrimaryKeySelective(GtGoodsBrand record);

	int updateByPrimaryKeyWithBLOBs(GtGoodsBrand record);

	int updateByPrimaryKey(GtGoodsBrand record);
}
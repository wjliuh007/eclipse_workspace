package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtOrders;
import com.zpapi.other.model.GtOrdersExample;
import com.zpapi.other.model.GtOrdersWithBLOBs;

public interface GtOrdersMapper {
	int countByExample(GtOrdersExample example);

	int deleteByExample(GtOrdersExample example);

	int deleteByPrimaryKey(Integer orderId);

	int insert(GtOrdersWithBLOBs record);

	int insertSelective(GtOrdersWithBLOBs record);

	List<GtOrdersWithBLOBs> selectByExampleWithBLOBs(GtOrdersExample example);

	List<GtOrders> selectByExample(GtOrdersExample example);

	GtOrdersWithBLOBs selectByPrimaryKey(Integer orderId);

	int updateByExampleSelective(@Param("record") GtOrdersWithBLOBs record,
			@Param("example") GtOrdersExample example);

	int updateByExampleWithBLOBs(@Param("record") GtOrdersWithBLOBs record,
			@Param("example") GtOrdersExample example);

	int updateByExample(@Param("record") GtOrders record, @Param("example") GtOrdersExample example);

	int updateByPrimaryKeySelective(GtOrdersWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(GtOrdersWithBLOBs record);

	int updateByPrimaryKey(GtOrders record);
}
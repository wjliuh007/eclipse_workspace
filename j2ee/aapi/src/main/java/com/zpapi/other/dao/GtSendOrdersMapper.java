package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtSendOrders;
import com.zpapi.other.model.GtSendOrdersExample;

public interface GtSendOrdersMapper {
	int countByExample(GtSendOrdersExample example);

	int deleteByExample(GtSendOrdersExample example);

	int deleteByPrimaryKey(Integer sendOrderId);

	int insert(GtSendOrders record);

	int insertSelective(GtSendOrders record);

	List<GtSendOrders> selectByExample(GtSendOrdersExample example);

	GtSendOrders selectByPrimaryKey(Integer sendOrderId);

	int updateByExampleSelective(@Param("record") GtSendOrders record,
			@Param("example") GtSendOrdersExample example);

	int updateByExample(@Param("record") GtSendOrders record, @Param("example") GtSendOrdersExample example);

	int updateByPrimaryKeySelective(GtSendOrders record);

	int updateByPrimaryKey(GtSendOrders record);
}
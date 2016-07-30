package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtPaymentLog;
import com.zpapi.other.model.GtPaymentLogExample;

public interface GtPaymentLogMapper {
	int countByExample(GtPaymentLogExample example);

	int deleteByExample(GtPaymentLogExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(GtPaymentLog record);

	int insertSelective(GtPaymentLog record);

	List<GtPaymentLog> selectByExampleWithBLOBs(GtPaymentLogExample example);

	List<GtPaymentLog> selectByExample(GtPaymentLogExample example);

	GtPaymentLog selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") GtPaymentLog record,
			@Param("example") GtPaymentLogExample example);

	int updateByExampleWithBLOBs(@Param("record") GtPaymentLog record,
			@Param("example") GtPaymentLogExample example);

	int updateByExample(@Param("record") GtPaymentLog record, @Param("example") GtPaymentLogExample example);

	int updateByPrimaryKeySelective(GtPaymentLog record);

	int updateByPrimaryKeyWithBLOBs(GtPaymentLog record);

	int updateByPrimaryKey(GtPaymentLog record);
}
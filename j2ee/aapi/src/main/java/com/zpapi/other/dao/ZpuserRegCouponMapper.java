package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.ZpuserRegCoupon;
import com.zpapi.other.model.ZpuserRegCouponExample;

public interface ZpuserRegCouponMapper {
	int countByExample(ZpuserRegCouponExample example);

	int deleteByExample(ZpuserRegCouponExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(ZpuserRegCoupon record);

	int insertSelective(ZpuserRegCoupon record);

	List<ZpuserRegCoupon> selectByExample(ZpuserRegCouponExample example);

	ZpuserRegCoupon selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") ZpuserRegCoupon record,
			@Param("example") ZpuserRegCouponExample example);

	int updateByExample(@Param("record") ZpuserRegCoupon record,
			@Param("example") ZpuserRegCouponExample example);

	int updateByPrimaryKeySelective(ZpuserRegCoupon record);

	int updateByPrimaryKey(ZpuserRegCoupon record);
}
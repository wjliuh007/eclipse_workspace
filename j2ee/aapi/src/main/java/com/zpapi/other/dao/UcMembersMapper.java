package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.UcMembers;
import com.zpapi.other.model.UcMembersExample;

public interface UcMembersMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int countByExample(UcMembersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int deleteByExample(UcMembersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int deleteByPrimaryKey(Long uid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int insert(UcMembers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int insertSelective(UcMembers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	List<UcMembers> selectByExample(UcMembersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	UcMembers selectByPrimaryKey(Long uid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int updateByExampleSelective(@Param("record") UcMembers record, @Param("example") UcMembersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int updateByExample(@Param("record") UcMembers record, @Param("example") UcMembersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int updateByPrimaryKeySelective(UcMembers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table uc_members
	 *
	 * @mbggenerated Fri Apr 01 19:47:31 CST 2016
	 */
	int updateByPrimaryKey(UcMembers record);
}
package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtAppSendUser;
import com.zpapi.other.model.GtAppSendUserExample;

public interface GtAppSendUserMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int countByExample(GtAppSendUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int deleteByExample(GtAppSendUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int insert(GtAppSendUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int insertSelective(GtAppSendUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	List<GtAppSendUser> selectByExample(GtAppSendUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	GtAppSendUser selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int updateByExampleSelective(@Param("record") GtAppSendUser record,
			@Param("example") GtAppSendUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int updateByExample(@Param("record") GtAppSendUser record, @Param("example") GtAppSendUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int updateByPrimaryKeySelective(GtAppSendUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_app_send_user
	 *
	 * @mbggenerated Fri Apr 01 20:16:56 CST 2016
	 */
	int updateByPrimaryKey(GtAppSendUser record);
}
package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtCardBatch;
import com.zpapi.other.model.GtCardBatchExample;

public interface GtCardBatchMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int countByExample(GtCardBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int deleteByExample(GtCardBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int insert(GtCardBatch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int insertSelective(GtCardBatch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	List<GtCardBatch> selectByExample(GtCardBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	GtCardBatch selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int updateByExampleSelective(@Param("record") GtCardBatch record,
			@Param("example") GtCardBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int updateByExample(@Param("record") GtCardBatch record, @Param("example") GtCardBatchExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int updateByPrimaryKeySelective(GtCardBatch record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table gt_card_batch
	 *
	 * @mbggenerated Fri Apr 01 20:18:14 CST 2016
	 */
	int updateByPrimaryKey(GtCardBatch record);
}
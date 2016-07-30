package com.zpapi.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.activity.model.ActivityAsk;
import com.zpapi.activity.model.ActivityAskExample;

public interface ActivityAskMapper {
	int countByExample(ActivityAskExample example);

	int deleteByExample(ActivityAskExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(ActivityAsk record);

	int insertSelective(ActivityAsk record);

	List<ActivityAsk> selectByExample(ActivityAskExample example);

	ActivityAsk selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") ActivityAsk record,
			@Param("example") ActivityAskExample example);

	int updateByExample(@Param("record") ActivityAsk record, @Param("example") ActivityAskExample example);

	int updateByPrimaryKeySelective(ActivityAsk record);

	int updateByPrimaryKey(ActivityAsk record);

	List<ActivityAsk> getQuestion(Integer level);

	int checkRight(String id);
}
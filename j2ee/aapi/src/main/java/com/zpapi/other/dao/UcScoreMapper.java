package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.UcScore;
import com.zpapi.other.model.UcScoreExample;

public interface UcScoreMapper {
	int countByExample(UcScoreExample example);

	int deleteByExample(UcScoreExample example);

	int deleteByPrimaryKey(Long uid);

	int insert(UcScore record);

	int insertSelective(UcScore record);

	List<UcScore> selectByExample(UcScoreExample example);

	UcScore selectByPrimaryKey(Long uid);

	int updateByExampleSelective(@Param("record") UcScore record, @Param("example") UcScoreExample example);

	int updateByExample(@Param("record") UcScore record, @Param("example") UcScoreExample example);

	int updateByPrimaryKeySelective(UcScore record);

	int updateByPrimaryKey(UcScore record);
}
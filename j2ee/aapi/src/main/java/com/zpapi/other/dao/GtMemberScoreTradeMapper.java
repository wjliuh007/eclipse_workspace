package com.zpapi.other.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zpapi.other.model.GtMemberScoreTrade;
import com.zpapi.other.model.GtMemberScoreTradeExample;

public interface GtMemberScoreTradeMapper {
	int countByExample(GtMemberScoreTradeExample example);

	int deleteByExample(GtMemberScoreTradeExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(GtMemberScoreTrade record);

	int insertSelective(GtMemberScoreTrade record);

	List<GtMemberScoreTrade> selectByExample(GtMemberScoreTradeExample example);

	GtMemberScoreTrade selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") GtMemberScoreTrade record,
			@Param("example") GtMemberScoreTradeExample example);

	int updateByExample(@Param("record") GtMemberScoreTrade record,
			@Param("example") GtMemberScoreTradeExample example);

	int updateByPrimaryKeySelective(GtMemberScoreTrade record);

	int updateByPrimaryKey(GtMemberScoreTrade record);
}
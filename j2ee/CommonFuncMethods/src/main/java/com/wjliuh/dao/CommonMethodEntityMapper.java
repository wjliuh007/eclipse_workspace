package com.wjliuh.dao;

import java.util.List;
import java.util.Map;

import com.wjliuh.model.CommonMethodEntity;

public interface CommonMethodEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(CommonMethodEntity record);

    int insertSelective(CommonMethodEntity record);

    CommonMethodEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommonMethodEntity record);

    int updateByPrimaryKey(CommonMethodEntity record);
    
    List<CommonMethodEntity> selectAll();
    
    List<CommonMethodEntity> selectByWhere(CommonMethodEntity record);

	List<CommonMethodEntity> selectByOptions(Map<Object, Object> param);
	
	List<CommonMethodEntity> fullTextSearcher(Map<Object, Object> param);
}
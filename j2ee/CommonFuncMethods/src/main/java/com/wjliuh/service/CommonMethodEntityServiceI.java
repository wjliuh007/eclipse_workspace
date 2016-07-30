package com.wjliuh.service;

import java.util.List;
import java.util.Map;

import com.wjliuh.model.CommonMethodEntity;

public interface CommonMethodEntityServiceI {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public CommonMethodEntity getCommonMethodEntityById(String id);
	
	/**
	 * 全检索
	 * @return
	 */
	public List<CommonMethodEntity> queryCommonMethodEntity();
	
	/**
	 * 新增
	 * @param entity
	 * @return
	 */
	public int insertCommonMethod(CommonMethodEntity entity);
	
	/**
	 * 按条件检索
	 * @param param 参数map
	 * @return 实体列表
	 */
	public List<CommonMethodEntity> selectByWhere(CommonMethodEntity entity);

	/**
	 * 按条件检索
	 * @param param 参数map
	 * @return 实体列表
	 */
	public List<CommonMethodEntity> selectByOptions(Map<Object,Object> param);
	
	/**
	 * 模拟全文检索
	 * @param param 参数map
	 * @return 实体列表
	 */
	public List<CommonMethodEntity> fullTextSearcher(Map<Object,Object> param);
}

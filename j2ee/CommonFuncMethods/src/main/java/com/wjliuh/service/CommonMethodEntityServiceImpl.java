package com.wjliuh.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjliuh.dao.CommonMethodEntityMapper;
import com.wjliuh.model.CommonMethodEntity;

@Service("commonMethodEntityService")
public class CommonMethodEntityServiceImpl implements CommonMethodEntityServiceI {

	private CommonMethodEntityMapper mapper;
	
	@Override
	public CommonMethodEntity getCommonMethodEntityById(String id) {
		
		return mapper.selectByPrimaryKey(id);
	}

	public CommonMethodEntityMapper getMapper() {
		return mapper;
	}

	@Autowired
	public void setMapper(CommonMethodEntityMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<CommonMethodEntity> queryCommonMethodEntity() {
		return mapper.selectAll();
	}

	@Override
	public int insertCommonMethod(CommonMethodEntity entity) {
		return mapper.insert(entity);
		
	}

	@Override
	public List<CommonMethodEntity> selectByWhere(CommonMethodEntity entity) {
		return mapper.selectByWhere(entity);
	}

	@Override
	public List<CommonMethodEntity> selectByOptions(Map<Object, Object> param) {
		return mapper.selectByOptions(param);
	}

	@Override
	public List<CommonMethodEntity> fullTextSearcher(Map<Object, Object> param) {
		return mapper.fullTextSearcher(param);
	}

}

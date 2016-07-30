/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.BaseIbatis3SlaveDao;
import com.zpapi.other.model.GtGoodsBrand;
import com.zpapi.other.query.GtGoodsBrandQuery;

@Repository
public class GtGoodsBrandDao extends BaseIbatis3SlaveDao<GtGoodsBrand, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "GtGoodsBrand";
	}

	public void saveOrUpdate(GtGoodsBrand entity) {
		if (entity.getBrandId() == null)
			save(entity);
		else
			update(entity);
	}

	public Page findPage(GtGoodsBrandQuery query) {
		return pageQuery("GtGoodsBrand.findPage", query);
	}

	public GtGoodsBrand[] getBrand(Map map) {
		List<GtGoodsBrand> lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getBrand", map, 0, 160);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public GtGoodsBrand[] getBrandBySort(Map map) {
		List<GtGoodsBrand> lst;
		if (map.get("num") != null) {
			lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getBrandBySort", map);
		} else {
			lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getBrandBySort", map.get("order"));
		}

		return lst.toArray(new GtGoodsBrand[0]);

	}

	public GtGoodsBrand[] getProductBrand(String brandid) {
		List<GtGoodsBrand> lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getProductBrand", brandid);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public GtGoodsBrand[] getBrand(String brandid) {
		List<GtGoodsBrand> lst = getSqlSessionTemplate()
				.selectList("GtGoodsBrand.getBrandByBrandId", brandid);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public GtGoodsBrand[] getBrandByTempTable(String tempTable) {
		List<GtGoodsBrand> lst = getSqlSessionTemplate().selectList(
				"GtGoodsBrand.getBrandByBrandIdForTempTable", tempTable);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public GtGoodsBrand[] getBrandTree(String[] ids) {
		List<GtGoodsBrand> lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getBrandTree1", ids);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public GtGoodsBrand[] getBrandTree() {
		List<GtGoodsBrand> lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getBrandTree", null);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public GtGoodsBrand[] getCurBrand(String id) {
		List<GtGoodsBrand> lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getCurBrand", id);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public GtGoodsBrand[] getAllBrand() {
		List<GtGoodsBrand> lst = getSqlSessionTemplate().selectList("GtGoodsBrand.getAllBrand", null);
		return lst.toArray(new GtGoodsBrand[0]);
	}

	public LinkedHashMap getBrandByName(String cgroup) {
		LinkedHashMap<String, List<GtGoodsBrand>> map = new LinkedHashMap<String, List<GtGoodsBrand>>();
		String[] paras = cgroup.split(",");
		for (String para : paras) {
			map.put(para, getSqlSessionTemplate().selectList("GtGoodsBrand.getBrandByName", para));
		}

		return map;
	}

	public GtGoodsBrand[] getBrandObject(Map<String, String> brandMap) {
		List<GtGoodsBrand> li = getSqlSessionTemplate().selectList("GtGoodsBrand.getBrandObject", brandMap);
		return li.toArray(new GtGoodsBrand[0]);
	}

	/**
	 * 根据品牌首字母筛选品牌信息 GtGoodsBrandDao.queryBrandByNature()<BR>
	 * <P>
	 * Author : hanweiwang
	 * </P>
	 * <P>
	 * Date : 2015年9月11日
	 * </P>
	 * 
	 * @param brandMap
	 *            {nature:"a"}
	 * @return
	 */
	public List<GtGoodsBrand> queryBrandByNature(Map<String, Object> brandMap) {
		return getSqlSessionTemplate().selectList("GtGoodsBrand.queryBrandByNature", brandMap);
	}

	public List<GtGoodsBrand> queryBrandByName(Map<String, Object> map) {
		return getSqlSessionTemplate().selectList("GtGoodsBrand.queryBrandByName", map);
	}
}

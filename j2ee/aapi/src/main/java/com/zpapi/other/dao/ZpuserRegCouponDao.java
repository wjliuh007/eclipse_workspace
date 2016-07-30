/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.dao;

import java.util.List;
import java.util.Map;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */
import org.springframework.stereotype.Repository;

import com.zhen.commons.base.BaseIbatisZpuser3Dao;
import com.zpapi.other.model.ZpuserRegCoupon;

@Repository
public class ZpuserRegCouponDao extends BaseIbatisZpuser3Dao<ZpuserRegCoupon, java.lang.Integer> {

	@Override
	public String getIbatisMapperNamesapce() {
		return "ZpuserRegCoupon";
	}

	@Override
	public void saveOrUpdate(ZpuserRegCoupon entity) {
		if (entity.getId() == null)
			save(entity);
		else
			update(entity);
	}

	public List<ZpuserRegCoupon> getTaskId(Map<String, Object> param) {
		return this.getSqlSessionTemplate().selectList("ZpuserRegCoupon.getTaskId", param);
	}

}

package com.wjliuh.tran;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wjliuh.json.JsonTranObject;
import com.wjliuh.model.CommonMethodEntity;

public class TranPlatform {

	public static void main(String[] args) {
		listObjectJson();
		List<Map> lsit = new ArrayList<Map>();

		for (int i = 0; i < 10; i++) {
			Map<String, CommonMethodEntity> map = new HashMap<String, CommonMethodEntity>();
			CommonMethodEntity cme = new CommonMethodEntity();
			cme.setId("007" + i);
			cme.setAppendix("功夫熊猫3" + i);
			cme.setAppendixpath("ftp://www.wjliuh.com" + i);
			cme.setMethodCode("main" + i);
			cme.setMethodName("主方法" + i);
			cme.setUpdatetime("2015-02-02" + i);
			map.put("007" + i, cme);
			lsit.add(map);
		}
		System.out.println(CommonMethodEntity.class.getName());
		String json = JSONArray.toJSONString(lsit);

		System.out.println(json);

		List<JSONObject> tranlist = JSONArray
				.parseArray(json, JSONObject.class);
		JSONObject entity;
		for (Map map : tranlist) {
			Iterator iter = map.keySet().iterator();
			if (iter.hasNext()) {
				String key = (String) iter.next();
				entity = (JSONObject) map.get(key);
				JsonTranObject jto = new JsonTranObject<CommonMethodEntity>();
				CommonMethodEntity a = (CommonMethodEntity) jto.parseFromJson(
						entity, CommonMethodEntity.class);
				System.out.println(a.toString());
			}

		}
		System.out.println(tranlist.toArray());

	}

	/***
	 * 测试json和对象的数组互转
	 */
	private static void listObjectJson() {
		List<CommonMethodEntity> lsit = new ArrayList<CommonMethodEntity>();

		for (int i = 0; i < 10; i++) {
			CommonMethodEntity cme = new CommonMethodEntity();
			cme.setId("007" + i);
			cme.setAppendix("功夫熊猫3" + i);
			cme.setAppendixpath("ftp://www.wjliuh.com" + i);
			cme.setMethodCode("main" + i);
			cme.setMethodName("主方法" + i);
			cme.setUpdatetime("2015-02-02" + i);
			lsit.add(cme);
		}

		String json = JSONArray.toJSONString(lsit);

		System.out.println(json);

		List<CommonMethodEntity> tranlist = JSONArray.parseArray(json,
				CommonMethodEntity.class);
		System.out.println(tranlist.size());
	}
}

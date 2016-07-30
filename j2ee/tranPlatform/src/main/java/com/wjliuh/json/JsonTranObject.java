package com.wjliuh.json;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class JsonTranObject<T> {

	private List<String> fields;

	private void initClass(Class<T> clazz) {
		Field[] fieldArry = clazz.getDeclaredFields();
		fields = new ArrayList<String>();
		for (Field f : fieldArry) {
			fields.add(f.getName());
		}

	}

	public T parseFromJson(JSONObject json, Class<T> clazz) {
		initClass(clazz);
		Object bean;
		try {
			Class classType = Class.forName(clazz.getName());
			bean = classType.newInstance();
			for (String field : fields) {
				if (json.get(field) != null) {
					Field f = classType.getDeclaredField(field);
					f.setAccessible(true);
					f.set(bean, json.get(field).toString());

				}
			}
			return (T) bean;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

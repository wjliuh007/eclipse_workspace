package com.wjliuh.ssi.service.intf;

import java.util.List;

public interface BaseServiceItf<T> {

	public int insert(T t);
	public int batchInsert(List<T> list);
	public int delete(T t);
	public int batchDelete(List<T> list);
	public int update(T t);
	public int batchUpdate(List<T> list);
	public T query(T t);
//	public int query(QuerySchema schema);
}

package com.zpapi.other.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.zhen.commons.cache.ValueHandle;
import com.zhen.commons.cache.ValueParam;

import javacommon.CacheKeyConst;

public class CacheUtil {
	/**
	 * 
	 * @Title: set 
	 * @Description: 设置缓存
	 * @param key
	 * @param value
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月21日 下午1:43:56
	 */
	public static boolean set(String key, Object value){
		return MemcacheUtil.getMemCachedClient().set(key, value);
	}
	/**
	 * 
	 * @Title: set 
	 * @Description: 设置缓存，同时设置有效期
	 * @param key		缓存key
	 * @param value		缓存值
	 * @param expire	缓存增量有效期
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月21日 下午1:43:56
	 */
	public static boolean set(String key, Object value, Long expire){
		return MemcacheUtil.getMemCachedClient().set(key, value, new Date(System.currentTimeMillis() + expire));
	}
	/**
	 * 
	 * @Title: getValue 
	 * @Description: 获取缓存对象，无缓存，则返回null
	 * @param key
	 * @return 
	 * @author zhupengren
	 * @date 2015年6月8日 下午3:23:57
	 */
	public static <E> E getValue(String key){
		return handleValue(key, null, null, null, false);
	}
	/**
	 * 
	 * @Title: getValue 
	 * @Description: 获取缓存对象，穿透时获取值，并设置有效期
	 * @param key	缓存key
	 * @param param	回调函数查询参数
	 * @param expire	过期时间，为null时，表示永久有效
	 * @param handle	缓存穿透时，获取数据的操作接口
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月23日 下午4:18:33
	 */
	public static <E> E getValue(String key, ValueParam param, Long expire, ValueHandle handle){
		return handleValue(key, param, expire, handle, false);
	}
	/**
	 * 
	 * @Title: getValue 
	 * @Description: 获取缓存对象
	 * @param key  缓存key
	 * @param param  回调函数使用的查询参数
	 * @param handle  缓存穿透时，获取数据操作的回调接口
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月21日 下午1:45:56
	 */
	public static <E> E getValue(String key, ValueParam param, ValueHandle handle){
		return getValue(key, param, null, handle);
	}
	/**
	 * 
	 * @Title: getValue 
	 * @Description: 获取缓存对象，单回调参数使用，内部调用getValue(String key, ValueParam param, ValueHandle handle)方法。
	 * @param key  缓存key
	 * @param param  回调函数使用的查询参数，可以直接用param.getParam获取
	 * @param handle  缓存穿透时，获取数据操作的回调接口
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月21日 下午1:48:58
	 */
	public static <E> E getValue(String key, Object param, ValueHandle handle){
		return getValue(key, param, null, handle);
	}
	/**
	 * 
	 * @Title: getValue 
	 * @Description: 获取缓存对象，穿透时获取并设置值。
	 * @param key	缓存key
	 * @param param	查询数据时的参数
	 * @param expire	设置缓存值的有效期(当前时间的增量毫秒数)，null：为永久有效
	 * @param handle	穿透时，查询值接口
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月23日 下午4:10:51
	 */
	public static <E> E getValue(String key, Object param, Long expire, ValueHandle handle){
		return handleValue(key, new ValueParam().setParam(param), expire, handle, false);
	}
	
	public static <E> E updateValue(String key, Object param, Long expire, ValueHandle handle){
		return handleValue(key, new ValueParam().setParam(param), expire, handle, true);
	}
	public static <E> E updateValue(String key, Object param, ValueHandle handle){
		return updateValue(key, param, null, handle);
	}
	public static <E> E updateValue(String key, ValueParam param, ValueHandle handle){
		return updateValue(key, param, null, handle);
	}
	public static <E> E updateValue(String key, ValueParam param, Long expire, ValueHandle handle){
		return handleValue(key, param, expire, handle, true);
	}
	/**
	 * 
	 * @Title: handleValue 
	 * @Description:	 缓存处理具体操作方法
	 * @param key	缓存key
	 * @param param		缓存穿透是获取值操作的参数
	 * @param expire	缓存穿透时设置缓存值的有效期
	 * @param handle	缓存穿透时的获取值操作实现
	 * @param isUpdate	是否为更新操作，true时直接根据获取值操作的返回结果更新缓存
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月26日 下午12:00:51
	 */
	@SuppressWarnings("unchecked")
	private static <E> E handleValue(String key, ValueParam param, Long expire, ValueHandle handle, boolean isUpdate){
		Object result = isUpdate ? null : MemcacheUtil.getMemCachedClient().get(key);
		if(result == null){
			if(handle != null){
				result = handle.getValue(param);
				if(result == null){
					MemcacheUtil.getMemCachedClient().set(key, CacheKeyConst.NullValue, new Date(System.currentTimeMillis() + (1000 * 60 * 1)));
				}else{
					if(expire == null || expire == 0L){
						MemcacheUtil.getMemCachedClient().set(key, result);
					}else{
						MemcacheUtil.getMemCachedClient().set(key, result, new Date(System.currentTimeMillis() + expire));
					}
				}
			}
		}
		return result == null || CacheKeyConst.NullValue.equals(result) ? null : (E) result;
	}
	/**
	 * 
	 * @Title: getMultiArray 
	 * @Description: 获取多个缓存对象，包装MemCachedClient的getMultiArray(String[] keys)方法
	 * @param keys
	 * @return 
	 * @author zhupengren
	 * @date 2015年4月21日 下午1:55:04
	 */
	public static Object[] getMultiArray(String[] keys){
		return MemcacheUtil.getMemCachedClient().getMultiArray(keys);
	}
	public static long addOrIncr(String key, long inc){
		return MemcacheUtil.getMemCachedClient().addOrIncr(key, inc);
	}
	public static boolean delete(String key){
		return MemcacheUtil.getMemCachedClient().delete(key);
	}
	
	public static List<String> getAllKeys() {
		List<String> list = new ArrayList<String>();
		Map<String, Map<String, String>> items = MemcacheUtil
				.getMemCachedClient().statsItems();
		for (Iterator<String> itemIt = items.keySet().iterator(); itemIt
				.hasNext();) {
			String itemKey = itemIt.next();
			Map<String, String> maps = items.get(itemKey);
			for (Iterator<String> mapsIt = maps.keySet().iterator(); mapsIt
					.hasNext();) {
				String mapsKey = mapsIt.next();
				String mapsValue = maps.get(mapsKey);
				if (mapsKey.endsWith("number")) { // memcached key 类型// item_str:integer:number_str
					String[] arr = mapsKey.split(":");
					int slabNumber = Integer.valueOf(arr[1].trim());
					int limit = Integer.valueOf(mapsValue.trim());
					Map<String, Map<String, String>> dumpMaps = MemcacheUtil
							.getMemCachedClient().statsCacheDump(slabNumber,
									limit);
					for (Iterator<String> dumpIt = dumpMaps.keySet().iterator(); dumpIt
							.hasNext();) {
						String dumpKey = dumpIt.next();
						Map<String, String> allMap = dumpMaps.get(dumpKey);
						for (Iterator<String> allIt = allMap.keySet()
								.iterator(); allIt.hasNext();) {
							String allKey = allIt.next();
							list.add(allKey.trim());
						}
					}
				}
			}
		}
		return list;
	}

}
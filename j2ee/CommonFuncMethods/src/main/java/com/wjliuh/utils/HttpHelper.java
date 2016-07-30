package com.wjliuh.utils;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.wjliuh.model.CommonMethodEntity;

public class HttpHelper {

    /** 使用表单元素创建 Form Bean (表单元素的名称和 Form Bean 属性名完全一致) */
    public <T> T createFormBean(HttpServletRequest request, Class<T> clazz)
    {
        return createFormBean(request, clazz, null);
    }

    /** 使用表单元素创建 Form Bean (用 keyMap 映射与表单元素名称不对应的 Form Bean 属性) */
    public   <T> T createFormBean(HttpServletRequest request, Class<T> clazz, Map<String, String> keyMap)
    {
        Map<String, String[]> properties = getParamMap(request);
        return null;
    }
    
    /** 使用表单元素填充 Form Bean (表单元素的名称和 Form Bean 属性名完全一致) */
    public   <T> void fillFormBeanProperties(HttpServletRequest request, T bean)
    {
        fillFormBeanProperties(request, bean, null);
    }
    
    /** 使用表单元素填充 Form Bean (用 keyMap 映射与表单元素名称不对应的 Form Bean 属性) */
    public   <T> void fillFormBeanProperties(HttpServletRequest request, T bean, Map<String, String> keyMap)
    {
     Map<String, String[]> properties = getParamMap(request);
//     setProperties(bean, properties, keyMap);
    }
    
    /** 获取 {@link HttpServletRequest} 的所有参数名称和值 */
    public   Map<String, String[]> getParamMap(HttpServletRequest request)
    {
        return request.getParameterMap();
    }
    
    public static CommonMethodEntity getFormBean(HttpServletRequest request, Class<CommonMethodEntity> class1){
    	
    	CommonMethodEntity entity = new CommonMethodEntity();
    	entity.setMethodCode(String.valueOf(System.currentTimeMillis()));
    	entity.setAppendix(request.getParameter("appendix"));
    	entity.setAppendixpath(request.getParameter("appendixpath"));
    	entity.setCreatetime(request.getParameter("createtime"));
    	entity.setDescription(request.getParameter("description"));
    	
    	String isDelete = request.getParameter("isdelete");
    	if("on".equals(isDelete)){
    		entity.setIsdelete("Y");
    	}else{
    		entity.setIsdelete("N");
    	}
    	
    	entity.setMethodName(request.getParameter("methodName"));
    	entity.setUpdatetime(request.getParameter("updatetime"));
    	entity.setId(UUID.randomUUID().toString());
    	return entity;
    }
}

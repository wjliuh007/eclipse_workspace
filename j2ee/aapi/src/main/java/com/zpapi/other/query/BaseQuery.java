package com.zpapi.other.query;

import org.apache.log4j.Logger;

import cn.org.rapid_framework.page.PageRequest;

public class BaseQuery extends PageRequest implements java.io.Serializable {
	private static final long serialVersionUID = -360860474471966681L;
	public static final int DEFAULT_PAGE_SIZE = 10;
	private static Logger logger = Logger.getLogger(BaseQuery.class);
	
    static {
    	logger.info("BaseQuery.DEFAULT_PAGE_SIZE="+DEFAULT_PAGE_SIZE);
    }
    
	public BaseQuery() {
		setPageSize(DEFAULT_PAGE_SIZE);
	}
	  
}

package com.zpapi.other.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
@Deprecated
public class BaseErrorTool{
	
	private static final Logger logger = LoggerFactory.getLogger(BaseErrorTool.class);
	
	public static ModelAndView create(ErrorCode error) {
		logger.error(error.getCode()+":"+error.getMsg());
		ModelAndView ret = new ModelAndView();
		ret.addObject("error", error.getMsg());
		ret.addObject("error_code", error.getCode());
		return ret;
	}
	
	public static ModelAndView create(Exception e) {
		logger.error(e.getMessage(), e);
		ModelAndView ret = new ModelAndView();
		if(e instanceof BusinessException){
			ret.addObject("error", ((BusinessException)e).getError().getMsg());
			ret.addObject("error_code", ((BusinessException)e).getError().getCode());
		}else{
			ret.addObject("error", ErrorCode.sys_001.getMsg());
			ret.addObject("error_code", ErrorCode.sys_001.getCode());
		}
		return ret;
	}
	
}
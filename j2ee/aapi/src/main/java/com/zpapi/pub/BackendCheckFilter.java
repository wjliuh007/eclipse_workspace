package com.zpapi.pub;

import java.io.IOException;




import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.zpapi.other.util.SendMessageUtil;
import com.zpapi.other.util.StringUtils;


public class BackendCheckFilter implements Filter{
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		if(!SendMessageUtil.checkIPValid(StringUtils.getRealRemoteAddr((HttpServletRequest)arg0))){
			arg1.setCharacterEncoding("utf-8");
			arg1.setContentType("application/json;charset=UTF-8");
			arg1.getWriter().println("{\"code\":\"" + com.zpapi.other.error.ErrorCode.sys_004.getCode() + "\",\"codeMsg\":\"" + com.zpapi.other.util.ErrorCode.sys_004.getCodeMsg() + "\"}");
			return;
		}
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
}

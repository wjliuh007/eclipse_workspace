package com.zpapi.pub;

import java.io.IOException;

import javacommon.util.ReturnInfo;

import com.zpapi.other.service.OauthAccessTokenManager;
import com.zpapi.other.service.UcMembersManager;
import com.zpapi.other.util.OAuthUtil;
import com.zpapi.other.util.SpringContextUtil;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class OauthCheckFilter implements Filter {
	private static OauthAccessTokenManager oauthAccessTokenManager = SpringContextUtil.getBean("oauthAccessTokenManager");
	private static UcMembersManager ucMembersManager = SpringContextUtil.getBean("ucMembersManager");

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;

		Integer isOK = OAuthUtil.checkLogin(request.getParameter("memberid"), request.getParameter("access_token"),
				oauthAccessTokenManager, ucMembersManager);
		if (isOK == ReturnInfo.token_expire) {
			arg1.setCharacterEncoding("utf-8");
			arg1.setContentType("application/json;charset=UTF-8");
			arg1.getWriter().println("{\"code\":\"" + com.zpapi.other.util.ErrorCode.sys_016.getCode() + "\",\"codeMsg\":\""
					+ com.zpapi.other.util.ErrorCode.sys_016.getCodeMsg() + "\"}");
			return;
		} else if (isOK != ReturnInfo.token_isOk) {
			arg1.setCharacterEncoding("utf-8");
			arg1.setContentType("application/json;charset=UTF-8");
			arg1.getWriter().println("{\"code\":\"" + com.zpapi.other.util.ErrorCode.sys_010.getCode() + "\",\"codeMsg\":\""
					+ com.zpapi.other.util.ErrorCode.sys_010.getCodeMsg() + "\"}");
			return;
		}
		arg2.doFilter(arg0, arg1);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

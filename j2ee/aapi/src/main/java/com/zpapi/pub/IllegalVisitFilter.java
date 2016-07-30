package com.zpapi.pub;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.zpapi.other.util.SendMessageUtil;
import com.zpapi.other.util.StringUtils;

/**
 * 登录、订单、购物车1秒三次以上封30秒(双十一临时加)
 * 
 * @author Administrator
 *
 */
public class IllegalVisitFilter implements Filter {

	private Logger logger = Logger.getLogger(IllegalVisitFilter.class);

	// 登录、订单、购物车1秒三次以上封30秒
	ConcurrentHashMap<String, String> loginMap;
	ConcurrentHashMap<String, String> orderMap;
	ConcurrentHashMap<String, String> cartMap;

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		loginMap = new ConcurrentHashMap<String, String>();
		orderMap = new ConcurrentHashMap<String, String>();
		cartMap = new ConcurrentHashMap<String, String>();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		if (SendMessageUtil.checkIPValid(StringUtils.getRealRemoteAddr(req))) {
			filter.doFilter(request, response);
		} else {
			String uri = req.getRequestURI();
			boolean flag = true;
			try {
				if (uri.contains("/initOrder.json")) {// 订单
					flag = check(orderMap, ((HttpServletRequest) request).getParameter("memberid"));
				} else if (uri.contains("/ucmembers/onLogin.json")) {// 登录
					flag = check(loginMap, ((HttpServletRequest) request).getParameter("username"));
				} else if (uri.contains("/cart/initPage.json")) {// 购物车
					flag = check(cartMap, ((HttpServletRequest) request).getParameter("memberid"));
				}

				if (!flag) {
					response.setCharacterEncoding("utf-8");
					response.setContentType("application/json;charset=UTF-8");
					response.getWriter().println(
							"{\"code\":\"" + com.zpapi.other.util.ErrorCode.sys_013.getCode()
									+ "\",\"codeMsg\":\""
									+ com.zpapi.other.util.ErrorCode.sys_013.getCodeMsg() + "\"}");
					return;
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
			filter.doFilter(request, response);
		}
	}

	private boolean check(ConcurrentHashMap<String, String> visitMap, String key) {
		Long nowTime = System.currentTimeMillis();
		if (StringUtils.isEmpty(key)) {// 没有用户id
			return true;
		} else if (StringUtils.isEmpty(visitMap.get(key))) {// 之前没请求过
			visitMap.put(key, nowTime + ",1");
			return true;
		}
		String[] sign = visitMap.get(key).split("\\,");
		Long lastVisitTime = Long.valueOf(sign[0]);
		int times = Integer.valueOf(sign[1]);
		if (nowTime - lastVisitTime > 1000L) {// 距离上一次请求已过1秒
			visitMap.put(key, nowTime + ",1");
			return true;
		} else if (nowTime - lastVisitTime < 1000L && nowTime - lastVisitTime > 0L) {// 距离上一次请求不足1秒，但是并没有超过3次被置30秒的
			if (times <= 2) {
				times++;
				visitMap.put(key, lastVisitTime + "," + times);
				return true;
			} else {
				visitMap.put(key, (nowTime + 30000L) + ",1");
				return false;
			}
		} else {// 被置30秒的，以当前时间继续延长30秒，无限请求则无限延长
			visitMap.put(key, (nowTime + 30000L) + ",1");
			return false;
		}
	}

	@Override
	public void destroy() {
	}
}

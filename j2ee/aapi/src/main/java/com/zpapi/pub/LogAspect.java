
package com.zpapi.pub;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zhen.commons.util.NetworkUtil;

/**
 * Function: request请求日志记录AOP实现. <br/>
 * Date: 2015年11月19日 上午10:02:49 <br/>
 * 
 * @author sunshine
 * @version
 * @since JDK 1.7
 * @see
 */

@Aspect
public class LogAspect {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 环绕触发 <br/>
	 *
	 * @param pjp
	 * @return
	 * @throws Throwable
	 * @author sunshine
	 * @date 2015年11月19日 上午10:05:08
	 */
	// @Around("execution(* com.**.controller.*(..))")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		long startTimeMillis = System.currentTimeMillis(); // 记录方法开始执行的时间
		/**
		 * 1.获取request信息 2.根据request获取session 3.从session中取出登录用户信息
		 */
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes sra = (ServletRequestAttributes) ra;
		HttpServletRequest request = sra.getRequest();
		// 获取请求IP
		String remoteIP = NetworkUtil.getIpAddress(request);
		// 获取请求地址
		String requestPath = request.getRequestURI();
		// 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
		// result的值就是被拦截方法的返回值
		try {
			Object result = pjp.proceed();
			if (result != null) {
				long endTimeMillis = System.currentTimeMillis(); // 记录方法执行完成的时间
				String beginTime = format.format(startTimeMillis);
				String endTime = format.format(endTimeMillis);

				logger.info("received zpapi request,url：" + requestPath + "; remoteIP :" + remoteIP + " beginTime："
						+ beginTime + " endTime：" + endTime + " cost：" + (endTimeMillis - startTimeMillis) + "ms ;");
			}
			return result;
		} catch (Exception e) {
			long endTimeMillis = System.currentTimeMillis(); // 记录方法执行完成的时间
			String beginTime = format.format(startTimeMillis);
			String endTime = format.format(endTimeMillis);
			logger.error(e.getMessage(), e);
			logger.info("received zpapi request,url：" + requestPath + "; remoteIP :" + remoteIP + " beginTime："
					+ beginTime + " endTime：" + endTime + " cost：" + (endTimeMillis - startTimeMillis) + "ms ;");
			throw e;
		}
	}
}

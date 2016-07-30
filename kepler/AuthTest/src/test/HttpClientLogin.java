package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * @author 作者 ：chenzenan E-mail:chen.ze.nan@163.com
 * @version 创建时间：2012-8-10 下午04:35:48 Copyright ? 2012-8-10 Shanghai XXX Co.
 *          Ltd. All right reserved.
 */
public class HttpClientLogin {

	public static void main(String[] args) {
		// 登陆 Url
		String loginUrl = "https://passport.csdn.net/account/login";
		// 需登陆后访问的 Url
		String dataUrl = "http://my.csdn.net/kukudetian";

		HttpClient httpClient = new HttpClient();

		// 模拟登陆，按实际服务器端要求选用 Post 或 Get 请求方式
		PostMethod postMethod = new PostMethod(loginUrl);

		// 设置登陆时要求的信息，用户名和密码
		NameValuePair[] data = { new NameValuePair("username", "kukudetian"), new NameValuePair("password", "287935651kutian") };
		postMethod.setRequestBody(data);
		try {
			// 设置 HttpClient 接收 Cookie,用与浏览器一样的策略
			httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
			httpClient.executeMethod(postMethod);
			// 获得登陆后的 Cookie
			Cookie[] cookies = httpClient.getState().getCookies();
			StringBuffer tmpcookies = new StringBuffer();
			for (Cookie c : cookies) {
				tmpcookies.append(c.toString() + ";");
			}
			postMethod.releaseConnection();
			// 进行登陆后的操作1581,1602,1603,1610,1609,1608,1607,1606,1605,1620,1619,1617,1616,1622,1626,1642,1648,1647,1657
			GetMethod getMethod = new GetMethod(dataUrl);
			// 每次访问需授权的网址时需带上前面的 cookie 作为通行证
			getMethod.setRequestHeader("cookie", tmpcookies.toString());
			// 你还可以通过 PostMethod/GetMethod 设置更多的请求后数据
			// 例如，referer 从哪里来的，UA 像搜索引擎都会表名自己是谁，无良搜索引擎除外
			getMethod.setRequestHeader("Referer", "http://www.cc");
			getMethod.setRequestHeader("User-Agent", "www Spot");
			httpClient.executeMethod(getMethod);
			// 打印出返回数据，检验一下是否成功
			InputStream ins = getMethod.getResponseBodyAsStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(ins,"utf-8"));
			
			String line;
			while((line = reader.readLine())!=null){
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

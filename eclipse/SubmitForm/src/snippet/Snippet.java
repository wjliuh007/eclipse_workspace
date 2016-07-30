package snippet;

import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import com.wjliuh.dialog.DisplayValidatePic;

public class Snippet {
	@SuppressWarnings("deprecation")
	public static void Login() throws Exception {
		String url = "https://mail.sina.com.cn/register/regmail.php";
		HttpClient hc = new HttpClient();
//		hc.startSession(new URL(url));
		DisplayValidatePic obtain = new DisplayValidatePic();
		obtain.show();
		String vcode = obtain.showModel();
		PostMethod postMethod = new PostMethod(url);
		// 填入各个表单域的值
		NameValuePair[] data = {
				new NameValuePair("act", "1"),
				new NameValuePair("agreement", "on"),
				new NameValuePair("email", "liukeijng@sina.cn"),
				new NameValuePair("extcode", "12e0f59a38bc609367e75ff6b0e74092"),
				new NameValuePair("forbin", "257bd15ab51946829a51f8e39eb32a5e_1418642560"), 
				new NameValuePair("imgvcode", vcode),
				new NameValuePair("psw","0123456789"),
				new NameValuePair("r",""),
				new NameValuePair("showcode","imgCodeEN"),
				new NameValuePair("swfimgsk","6889fc98332504e5a80500d290da40f9")
				};
		// 将表单的值放入postMethod中
		postMethod.setQueryString(data);
		// 执行postMethod
		int statusCode = 0;
		try {
			statusCode = hc.executeMethod(postMethod);
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// HttpClient对于要求接受后继服务的请求，象POST和PUT等不能自动处理转发
		// 301或者302
		if (statusCode == HttpStatus.SC_MOVED_PERMANENTLY
				|| statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {
			// 从头中取出转向的地址
			Header locationHeader = postMethod.getResponseHeader("location");
			String location = null;
			if (locationHeader != null) {
				location = locationHeader.getValue();
				System.out.println("diandianLogin:" + location);
			} else {
				System.err.println("Location field value is null.");
			}
			return;
		} else {
			System.out.println(postMethod.getStatusCode());
			String str = "";
			try {
				str = new String(postMethod.getResponseBody(),"utf-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(str);
		}
		return;
	}

	// 其中需要的jar包：
	//
	// 1、 commons-httpclient.jar
	//
	// 2、commons-codec.jar
	//
	// 3、commons-logging.jar
	public static void main(String[] args){
		try {
			Login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

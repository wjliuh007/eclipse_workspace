package gao;

import java.util.HashMap;
import java.util.Map;

import com.api.pub.http.HttpClientUtil;

public class Test {

	public static void main(String[] args) {

		Map<String, String> params = new HashMap<String, String>();
		params.put("loginName", "ZCHS");
		params.put("password", "zchs001");
		String result = HttpClientUtil
				.executePost(
						"http://xzsp1.bjfda.gov.cn/odpclientweb/loginAction.do",
						params);
		System.out.println(result);

	}

}

package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wjliuh.ssi.service.SsiService;

public class Test {
	ApplicationContext ac;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@org.junit.Test
	public void testRedis(){
		//
		ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		SsiService ss = (SsiService) ac.getBean("ssiService");
		
		ss.query("");

	}

}

package com.wjliuh.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wjliuh.aop.Pointcut;
import com.wjliuh.model.CommonMethodEntity;
import com.wjliuh.service.CommonMethodEntityServiceI;

public class JUnitTestMybatis {
	ApplicationContext ac;
	CommonMethodEntityServiceI service;
	
	/**
	 * û�н��spring-test
	 * һ���û���ʼ��������
	 */
	@Before
	public void before(){
		//
		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		service = (CommonMethodEntityServiceI)ac.getBean("commonMethodEntityService");

	}
	
	/**
	 * û�н��spring-test
	 */
	@Test
	public void test1(){
		CommonMethodEntity entity  = service.getCommonMethodEntityById("juijjhuuj7");
	
		System.out.println(entity.getMethodName());
	
	
	}
	
	@Test
	public void testAop(){
		Pointcut pc = (Pointcut)ac.getBean("testPointcut");
		pc.testPointcut();
		pc.testPointcut(null);
	}

}

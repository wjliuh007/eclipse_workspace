package com.wjliuh.box;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class JUnitTestMybatis {
	ApplicationContext ac;
	First f;

	@Before
	public void before(){
		//
	    Resource resource = new ClassPathResource("beans.xml");
	    BeanFactory factory = new XmlBeanFactory(resource);
	    f = (First)factory.getBean("first");
	    
	    ac = new ClassPathXmlApplicationContext("/beans.xml");
		
	}
	

	@Test
	public void test1(){
	
	System.out.println(f.getUser());
	}

}

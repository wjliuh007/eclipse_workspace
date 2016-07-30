package com.wjliuh.test;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wjliuh.model.CommonMethodEntity;
import com.wjliuh.service.CommonMethodEntityServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class SpringTestMybatis {
	CommonMethodEntityServiceI service;
	Logger logger = Logger.getLogger(this.getClass());
	public CommonMethodEntityServiceI getService() {
		return service;
	}

	@Autowired
	public void setService(CommonMethodEntityServiceI service) {
		this.service = service;
	}

	@Test
	public void test1(){
		CommonMethodEntity entity  = service.getCommonMethodEntityById("juijjhuuj7");
	
		logger.info(JSON.toJSON(entity));
	
	
	}
	
	public static void main(String[] args){
		UUID u = UUID.randomUUID();
		System.out.println(u.toString());
		System.out.println(u);
	}
}

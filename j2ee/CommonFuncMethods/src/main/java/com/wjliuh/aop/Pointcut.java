package com.wjliuh.aop;

public class Pointcut {

	public void testPointcut(){
		System.out.println("测试切面！");
	}
	public void testPointcut(String args){
		System.out.println("测试切面！有参数的方法");
	}
}

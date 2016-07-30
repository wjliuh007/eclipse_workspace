package com.wjliuh.aspect;

public class Advice {

	public void doBefore(){
		System.out.println("前处理");
	}
	public void doAfter(){
		System.out.println("后处理");
	}
	public void doAround(){
		System.out.println("包围处理");
	}
	public void doWhenException(){
		System.out.println("抛出异常时处理");
	}
}

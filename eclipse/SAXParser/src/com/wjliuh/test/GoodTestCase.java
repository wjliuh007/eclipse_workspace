package com.wjliuh.test;

import java.io.InputStream;
import java.util.List;

import junit.framework.TestCase;

import com.wjliuh.entity.Good;
import com.wjliuh.parser.GoodParser;

public class GoodTestCase extends TestCase{

	public void runTest() throws Throwable{
		GoodParser sax = new GoodParser();
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("goods.xml");
		List<Good> goods = sax.getGoods(input);
		for(Good good : goods){
			System.out.println(good.toString());
		}
	}

	public static void main(){
		
	}

}

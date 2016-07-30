package com.wjliuh.cn;


public class StringFormat {

    public static void main(String[] agrs) {

//	StringBuilder sb=null;
//	for (int i = 0; i < 100; i++) {
//	    sb = new StringBuilder();
//	    sb.append(StringUtils.leftPad("name"+i, 15, " "));
//	    sb.append(StringUtils.leftPad("age"+i, 15, " "));
//	    sb.append(StringUtils.leftPad("address"+i, 15, " "));
//	    sb.append(StringUtils.leftPad("salary"+i, 15, " "));
//	    System.out.println(sb.toString());
//	}
	String res = String.format("%15s%15s", "name","age");
	System.out.println(res);
	for(int i=0;i<99;i++) {
		res = String.format("%15s%15s", "name"+i,"age"+i);
		System.out.println(res);
	}


    }
}

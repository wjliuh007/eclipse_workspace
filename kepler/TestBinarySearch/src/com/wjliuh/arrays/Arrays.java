package com.wjliuh.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrays {

	public static void main(String[] args){
		String regx = "(\\w)+\\/(src)\\/((client)|(private)|(public))";
		String str = "vermatch/src/private/nc/pubimpl/bd/vermatch/pub/bp/MatchQueryUtil.java";
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(str);
		m.find();
		System.out.println(m.group(0));
		System.out.println(str.replaceAll(regx, "@@@@@@"));
	}
}

/**
 * 
 */
package com.wjliuh.algorithm;

/**
 * 根据数字翻译成中文汉字
 * @author JIE
 * @since 2015-7-25 下午11:03:47
 */
public class TranslteMoney {

    private static final String[] MONEY_STR = new String[] {"零","一","二","三","四","五","六","七","八","九","十","百","千","万"};
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }
    
    private String doTranslater(int money) {
	StringBuilder sb  = new StringBuilder();
	
	byte[] temp = String.valueOf(money).getBytes();
	for(int i=temp.length-1;i>=0;i--) {
	}
	return "";
    }

}

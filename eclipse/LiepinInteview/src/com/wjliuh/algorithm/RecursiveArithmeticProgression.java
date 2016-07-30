/**
 * 
 */
package com.wjliuh.algorithm;

/**
 * 递归方式实现等差数列
 * 
 * @author JIE
 * @since 2015-7-25 下午10:50:46
 */
public class RecursiveArithmeticProgression {

    /**
     * @param args
     */
    public static void main(String[] args) {
	RecursiveArithmeticProgression rap = new RecursiveArithmeticProgression();
	System.out.println(rap.doRecursive(8));

    }
    
    private int doRecursive(int n) {
	if(1==n) {
	    return 10;
	}else {
	    return 2+ doRecursive(n-1);
	}
    }

}

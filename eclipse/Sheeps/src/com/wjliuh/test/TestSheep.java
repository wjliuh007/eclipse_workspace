package com.wjliuh.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 一头母羊的寿命是5年,它会在第2年底和第4年底各生下一头母羊,第5年底死去,
 * 问一开始农场有1头母羊,N年后,农场会有多少只母羊？
 * @author JIE
 *
 */
public class TestSheep {

	public static void main(String[] args){
		System.out.println(getSheeps(5));
	}
	
	// n为过的年数
    public static int getSheeps(int n) {
        // sheeps表示整个羊的生态圈
        ArrayList<Sheep> sheeps = new ArrayList<Sheep>();
        sheeps.add(new Sheep());
        
        List<Sheep> addSheeps = new ArrayList<Sheep>();//待添加到生态圈的新羊
        List<Sheep> delSheeps = new ArrayList<Sheep>();//待从生态圈删除的羊

        for (int i = 1; i <= n; i++) {
            for (Sheep s : sheeps) {
                s.age++;
                if (s.age==2||s.age==4) {// 羊仍存活
                    addSheeps.add(new Sheep());
                } else if(s.age==5){ // 羊死亡，加入删除列表delSheeps中，等待删除
                    delSheeps.add(s);
                }
            }

            sheeps.addAll(addSheeps);
            sheeps.removeAll(delSheeps);
            addSheeps.clear();//清空addSheeps
            delSheeps.clear();//清空待删除列表中的元素
        }

         return sheeps.size(); // 最后总羊数即羊生态圈中的羊数目
    }
}

class Sheep{
	public int age = 0; // 默认一只新羊的年龄为0
}

package com.wjliuh.entity;

import java.util.List;

public class ShoppingCart {

	private List<Good> goodsList;

	public ShoppingCart(List<Good> goodsList){
		this.goodsList = goodsList;
	}
	
	public void list(){
		for(Good good : goodsList){
			System.out.println(good.toString());
		}
	}
	
	public float getTotalCost(){
		float total =0L;
		if(goodsList!=null){
			for(Good good:goodsList){
				total +=good.getCost();
			}
		}
		return total;
		
	}
	
	public List<Good> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Good> goodsList) {
		this.goodsList = goodsList;
	}
	
	
}

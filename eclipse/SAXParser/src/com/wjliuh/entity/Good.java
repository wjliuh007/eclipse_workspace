package com.wjliuh.entity;

public class Good {

	private String code;
	private String name;
	private float weight;
	private float price;
	private String brand;
	private String orign;
	
	private float cost;
	
	
	public float getCost() {
		return this.weight * this.price;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOrign() {
		return orign;
	}
	public void setOrign(String orign) {
		this.orign = orign;
	}
	
	@Override
	public String toString(){
		return this.code+":"+this.name+":"+this.weight+":"+this.price+":"+this.brand+":"+this.orign+":"+getCost();
	}
	
}

package com.wjliuh.model;

public class TestModel {
	private String name;
	private String address;
	private String job;
	private String like;
	private int age;
	private static TestModel model = new TestModel();
	
	public static TestModel getInstance(){
		return model;
	}
	
	private TestModel(){
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

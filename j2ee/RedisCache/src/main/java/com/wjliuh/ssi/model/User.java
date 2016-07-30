package com.wjliuh.ssi.model;

import java.io.Serializable;

public class User implements Serializable{  
	  
	private static final long serialVersionUID = 3577946099294257884L;
	
	private static final String USER_KEY = "USER";
	
	private String id;  
    private String name;  
    private String pwd;  
    private int age;  
    private String sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}  
  
    public static String getUserKey(){
    	return USER_KEY;
    }
  
} 

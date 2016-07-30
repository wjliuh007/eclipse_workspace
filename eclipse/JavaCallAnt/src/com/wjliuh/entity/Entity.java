package com.wjliuh.entity;

import java.io.Serializable;

public class Entity implements Serializable {

	private static final long serialVersionUID = 5735782824219562995L;

	public static final String ID = "20150731007";

	private String user_name;
	private String user_id;
	private String sex;
	private String like;
	private int age;

	public Entity(String user_name, String user_id, String sex, String like,
			int age) {
		this.user_name = user_name;
		this.user_id = user_id;
		this.sex = sex;
		this.like = like;
		this.age = age;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String toString() {
		return this.user_name + this.user_id + this.sex + this.like + this.age;
	}

}

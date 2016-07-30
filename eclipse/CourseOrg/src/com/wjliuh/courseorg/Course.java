package com.wjliuh.courseorg;

public class Course {

    private String code;
    private String name;
    private int priority;
    private int number;
    
    public Course(String code,String name,int priority,int number) {
	this.code = code;
	this.name=name;
	this.priority=priority;
	this.number=number;
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
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
    
}

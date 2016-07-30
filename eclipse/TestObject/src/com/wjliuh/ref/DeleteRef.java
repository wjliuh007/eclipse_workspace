package com.wjliuh.ref;

public class DeleteRef {
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public boolean isPersonNull(){
		return person == null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeleteRef dr = new DeleteRef();
		Person p = new Person();
		p.setAddress("用友软件园");
		p.setName("刘文杰");
		dr.setPerson(p);
		Company com = new Company();
		com.setPerson(dr.getPerson());
		//=============
		
		com.clear();
		System.out.println(com.isPersonNull());
		
		System.out.println(dr.isPersonNull());
		
		
		
		
		
		
	}

}

class Company{
	private Person person;
	
	public boolean isPersonNull(){
		return person == null;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void clear(){
		person = null;
	}
	
}

class Person {
	private String name;
	private String address;
	private String job;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

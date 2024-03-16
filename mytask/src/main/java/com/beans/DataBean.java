package com.beans;

public class DataBean {
	public int id;
	public String name;
	public String email;
	public int age;
	public String dob;
	
	public DataBean(int id, String name, String email, int age, String dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	
	public void print()
	{
		System.out.println("id"+" "+this.id);
		System.out.println("name "+name);
		System.out.println("email "+email);
		System.out.println("age "+age);
		System.out.println("dob "+dob);
		
	}
}

package com.dto;


import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("#{stu.name}")
	private String name;
	@Value("#{stu.age}")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
}

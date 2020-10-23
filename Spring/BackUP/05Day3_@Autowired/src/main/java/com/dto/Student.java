package com.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int age;
	
	@Autowired
	private Cat cat;
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자");
	}
	

	public Student(String name, int age, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.cat = cat;
		System.out.println("인자있는 생성자");
	}


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

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
	
	
	
	
	
	
}

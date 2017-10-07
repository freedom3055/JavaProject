package com.javapractice.reflection;

public class Student extends Person {
	private  String name;
	private int age;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		//super.sayHello();
		System.out.println("Say hello from Student");
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

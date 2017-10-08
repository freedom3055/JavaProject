package com.javapractice.reflection.DynamicProxy;

public class DogProxy implements Animal {

	private Dog target;
	
	public DogProxy(Dog target) {
		super();
		this.target = target;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Do somethings at proxy");
		target.eat();
	}

}

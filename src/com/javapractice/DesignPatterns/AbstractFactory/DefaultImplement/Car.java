package com.javapractice.DesignPatterns.AbstractFactory.DefaultImplement;

import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Vehicle;

public class Car extends Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The car that abstract vehicle impl at running");
	}

}

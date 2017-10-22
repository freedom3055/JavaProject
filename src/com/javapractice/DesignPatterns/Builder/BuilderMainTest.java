package com.javapractice.DesignPatterns.Builder;

public class BuilderMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerBuilder builder1 = new MacComputerBuilder();
		Director director1 = new Director(builder1);
		director1.constract();
		System.out.println(builder1.getResult());
		
		ComputerBuilder builder2 = new PersonComputerBuilder();
		Director director2 = new Director(builder2);
		director2.constract();
		System.out.println(builder2.getResult());
	}

}

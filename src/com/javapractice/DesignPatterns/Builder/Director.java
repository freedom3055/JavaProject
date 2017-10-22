package com.javapractice.DesignPatterns.Builder;

public class Director {
	private ComputerBuilder builder;

	public Director(ComputerBuilder builder) {
		super();
		this.builder = builder;
	}
	public void constract(){
		this.builder.buildCpu();
		this.builder.buildRam();
		this.builder.buildSize();
	}
}

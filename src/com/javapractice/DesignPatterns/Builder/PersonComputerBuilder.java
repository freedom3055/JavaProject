package com.javapractice.DesignPatterns.Builder;

public class PersonComputerBuilder implements ComputerBuilder {

	private Computer computer = new Computer();
	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("Inter i5");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		computer.setRam("4g");
	}

	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		computer.setSize("14 in");
	}

	@Override
	public Computer getResult() {
		// TODO Auto-generated method stub
		return computer;
	}

}

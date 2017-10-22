package com.javapractice.DesignPatterns.Builder;

public class MacComputerBuilder implements ComputerBuilder {

	private Computer computer = new Computer();
	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("Intel i7");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		computer.setRam("8g");
	}

	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		computer.setSize("13 in");
	}

	@Override
	public Computer getResult() {
		// TODO Auto-generated method stub
		return computer;
	}

}

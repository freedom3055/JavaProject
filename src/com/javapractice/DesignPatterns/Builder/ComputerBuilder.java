package com.javapractice.DesignPatterns.Builder;

public interface ComputerBuilder {
	void buildCpu();
	void buildRam();
	void buildSize();
	Computer getResult();
}

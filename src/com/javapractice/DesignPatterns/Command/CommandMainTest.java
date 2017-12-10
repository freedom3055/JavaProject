package com.javapractice.DesignPatterns.Command;

public class CommandMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		Command command = new SayHelloCommand(people);
		command.execute();
	}

}

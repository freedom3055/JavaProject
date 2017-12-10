package com.javapractice.DesignPatterns.Command;

public class SayHelloCommand implements Command {

	private final People people;
	
	public SayHelloCommand(People people) {
		super();
		this.people = people;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Execute say hello begin SayHelloCommand");
		people.sayHello();
	}

}

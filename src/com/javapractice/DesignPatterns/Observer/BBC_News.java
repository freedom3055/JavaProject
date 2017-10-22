package com.javapractice.DesignPatterns.Observer;

public class BBC_News implements NewsObserver {

	@Override
	public void notifyNews() {
		// TODO Auto-generated method stub
		System.out.println("BBC receive news from subject");
	}

}

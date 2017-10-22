package com.javapractice.DesignPatterns.Observer;

public class CCTV_News implements NewsObserver {

	@Override
	public void notifyNews() {
		// TODO Auto-generated method stub
		System.out.println("CCTV receive news from subject");
	}

}

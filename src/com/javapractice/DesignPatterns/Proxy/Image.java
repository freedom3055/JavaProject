package com.javapractice.DesignPatterns.Proxy;

public class Image implements Graphic {

	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Image init");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Really image draw");
	}

}

package com.javapractice.DesignPatterns.Proxy;

public class ImageProxy implements Graphic {

	private Graphic image;
	
	public ImageProxy() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Image proxy init");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if (image == null) {
			image = new Image();
		}
		image.draw();
	}

}

package com.javapractice.DesignPatterns.Observer;

public class ObserverMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsSubject subject = new NewsSubject();
		BBC_News bbc = new BBC_News();
		CCTV_News cctv = new CCTV_News();
		
		subject.attach(bbc);
		subject.attach(cctv);
		
		subject.newsNotify();
		
		System.out.println("-------------------------------------");
		subject.detach(cctv);
		subject.newsNotify();
	}

}

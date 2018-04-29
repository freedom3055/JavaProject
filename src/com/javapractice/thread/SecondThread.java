package com.javapractice.thread;

public class SecondThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Thread:"+Thread.currentThread().getName());
	}
}

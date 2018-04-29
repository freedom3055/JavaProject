package com.javapractice.thread;

public class ThreadMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Thread(new FirstThread(), "Thread with runnable interface").start();
//		new SecondThread().start();
		
		Thread thread = new SecondThread();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

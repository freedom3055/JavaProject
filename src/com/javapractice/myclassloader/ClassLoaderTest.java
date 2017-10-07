package com.javapractice.myclassloader;

import java.io.IOException;

public class ClassLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);
		/*
		 * extension class loader
		 */
		System.out.println(systemClassLoader.getParent());
		/**
		 * Out null, because of this class loader implement by c or c++
		 */
		System.out.println(systemClassLoader.getParent().getParent());
		//System.out.println(ClassLoaderTest.class.getResource ("").getFile ());
		
//		MyCalssLoader loader = new MyCalssLoader();
////		ClassLoader loader =  ClassLoader.getSystemClassLoader();
//		try {
//			Class clazz = loader.loadClass("CustomLoadClass");
//			System.out.println(clazz);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			Runtime.getRuntime().exec("cmd javac CustomLoadClass.java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

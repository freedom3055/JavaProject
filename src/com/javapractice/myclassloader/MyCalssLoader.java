package com.javapractice.myclassloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyCalssLoader extends ClassLoader {
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		byte[] raw = getCassBytes(name);
		System.out.println(name);
		Class clazz = defineClass(name, raw, 0, raw.length);
		return clazz;//super.findClass(name);
	}

	private byte[] getCassBytes(String name) {
		String path = "/C:/Users/Your/workspace/JavaProject/src/com/javapractice/myclassloader/";//MyCalssLoader.class.getResource ("").getFile ();
		File javaFile = new File(path, name+".java");
//		String tempPath = javaFile.getAbsolutePath().replaceAll("\\", "/");
		System.out.println(javaFile);
		try {
			Process process = Runtime.getRuntime().exec("javac "+name+".java");
			process.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path2 = "/C:/Users/Your/workspace/JavaProject/src/com/javapractice/myclassloader/";
		File javaClass = new File(path2,name+".class");
		byte[] raw = new byte[(int) javaClass.length()];
		System.out.println(javaClass);
		try {
			FileInputStream fis = new FileInputStream(javaClass);
			fis.read(raw);
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return raw;
	}
}

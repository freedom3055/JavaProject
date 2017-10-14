package com.javapractice.reflection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.javapractice.reflection.Student;
import com.javapractice.reflection.ReflectionAndGeneric.GenericAtMethodTest;

public class ObjectPoolFactory {

	private Map<String, Object> objectPool = new HashMap<>();

	private Object createObject(String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Class name = "+className);
		Class<?> clazz = Class.forName(className);
		return clazz.newInstance();
	}
	public Object getObject(String name){
		return objectPool.get(name);
	}

	private void initPool(String fileName)
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		InputStream fis = null;
		try {
			fis = getClass().getResourceAsStream(fileName);
			Properties properties = new Properties();
			properties.load(fis);
			for (String name : properties.stringPropertyNames()) {
				objectPool.put(name, createObject(properties.getProperty(name)));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ObjectPoolFactory factory = new ObjectPoolFactory();
		try {
			factory.initPool("Property");
			
			System.out.println(factory.getObject(Student.class.getSimpleName()));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

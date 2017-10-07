package com.javapractice.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class<?> clazz  = Class.forName("com.javapractice.reflection.Person");
			Class<Student> clazz  = (Class<Student>) Class.forName("com.javapractice.reflection.Student");
			Person person = clazz.newInstance();
			person.sayHello();
			
			Constructor<Student> constructor = clazz.getConstructor(String.class,int.class);
			Student student = constructor.newInstance("maguoqiang",25);
			System.out.println(student);
			
			System.out.println(clazz.getPackage().getName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

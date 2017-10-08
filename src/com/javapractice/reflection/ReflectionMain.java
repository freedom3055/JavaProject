package com.javapractice.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class<?> clazz  = Class.forName("com.javapractice.reflection.Person");
			Class<Student> clazz  = (Class<Student>) Class.forName("com.javapractice.reflection.Student");
			Person person = clazz.newInstance();
			System.out.println(person);
			person.sayHello();
			
			Constructor<Student> constructor = clazz.getConstructor(String.class,int.class);
			Student student = constructor.newInstance("xiaoming",25);
			System.out.println(student);
			
			System.out.println(clazz.getPackage().getName());
			System.out.println(clazz.getSuperclass().getName());
			
			//Constructor<?>[] constructors = clazz.getConstructors();
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> constructor2 : constructors) {
				System.out.println(constructor2);
				System.out.println(Modifier.toString(constructor2.getModifiers()));
				/**
				 * Out null, because of SuppressWarnings target source not runtime
				 */
				System.out.println(constructor2.getAnnotation(SuppressWarnings.class));
			}
			
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

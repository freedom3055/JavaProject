package com.javapractice.reflection.ReflectionAndGeneric;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.javapractice.reflection.Student;

public class GenericAtMethodTest {

	/**
	 * package visible
	 */
	static <E> E createObject(Class<E> clazz){
		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = GenericAtMethodTest.createObject(Student.class);
		System.out.println(student);
		
		int[] array = (int[]) Array.newInstance(int.class, 3);
		System.out.println(Arrays.toString(array));
		
	}

}

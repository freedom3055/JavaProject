package com.javapractice.reflection.ReflectionAndGeneric;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import com.javapractice.reflection.Student;

public class GenericTest {

	@SuppressWarnings("unused")
	private Map<String, Integer> score;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<GenericTest> clazz = GenericTest.class;

		try {
			Field field = clazz.getDeclaredField("score");
			System.out.println(field);

			Class<?> t1 = field.getType();
			System.out.println(t1);

			Type gType = field.getGenericType();
			System.out.println(gType);

			if (gType instanceof ParameterizedType) {
				ParameterizedType pType = (ParameterizedType) gType;
				Type rType = pType.getRawType();
				System.out.println(rType);

				Type[] types = pType.getActualTypeArguments();
				for (Type type : types) {
					System.out.println(type);
				}

			} else {
				System.out.println("Get generic error");
			}

			/**
			 * Dynamic get a object generic class
			 */
			A<Student> a = new B();
			/**
			 * Is implement, not hierarchy
			 */
			Type aType = a.getClass().getGenericInterfaces()[0];
			System.out.println(a.getClass());
			if (aType instanceof ParameterizedType) {
				ParameterizedType pType = (ParameterizedType) aType;

				Type[] types = pType.getActualTypeArguments();
				for (Type type : types) {
					System.out.println(type);
					System.out.println(((Class)type).newInstance());
				}
			} else {
				System.out.println("error");
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

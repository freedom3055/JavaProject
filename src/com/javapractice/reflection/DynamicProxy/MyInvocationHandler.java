package com.javapractice.reflection.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;
	
	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object object, Method method, Object[] objects) throws Throwable {
		readyFood();
		Object result = method.invoke(target, objects);
		return result;
	}

	private void readyFood() {
		System.out.println("Ready food");
	}

}

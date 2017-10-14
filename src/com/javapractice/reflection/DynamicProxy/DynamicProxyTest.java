package com.javapractice.reflection.DynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * dynamic proxy 
		 */
		Dog targetDog = new Dog();
		MyInvocationHandler dogHandler = new MyInvocationHandler(targetDog);
		Animal dog = getAnimalProxy(dogHandler);
		dog.eat();
	
		/**
		 * hardcode proxy
		 */
		DogProxy dogProxy = new DogProxy(targetDog);
		dogProxy.eat();

		Pig targetPig = new Pig();
		MyInvocationHandler pigHandler = new MyInvocationHandler(targetPig);
		Animal pig = getAnimalProxy(pigHandler);
		pig.eat();

	}

	private static Animal getAnimalProxy(MyInvocationHandler dogHandler) {
		return (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(), new Class[] { Animal.class },
				dogHandler);
	}

}

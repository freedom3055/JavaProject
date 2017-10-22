package com.javapractice.DesignPatterns.AbstractFactory;

import com.javapractice.DesignPatterns.AbstractFactory.Abstract.AbstractFactory;
import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Food;
import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Vehicle;
import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Weapon;
import com.javapractice.DesignPatterns.AbstractFactory.DefaultImplement.DefaultFactory;

public class AbstractFactoryMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * The disadvantage is that the product is not easy to expand
		 */
		AbstractFactory factory = new DefaultFactory();
		Vehicle vehicle = factory.createVehicle();
		Weapon weapon = factory.createWeapon();
		Food food = factory.createFood();
		
		vehicle.run();
		weapon.shoot();
		food.printName();
	}

}

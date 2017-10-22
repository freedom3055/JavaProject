package com.javapractice.DesignPatterns.AbstractFactory.DefaultImplement;

import com.javapractice.DesignPatterns.AbstractFactory.Abstract.AbstractFactory;
import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Food;
import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Vehicle;
import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Weapon;

public class DefaultFactory extends AbstractFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new AK47();
	}

}

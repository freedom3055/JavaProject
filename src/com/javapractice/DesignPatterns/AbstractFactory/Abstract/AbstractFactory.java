package com.javapractice.DesignPatterns.AbstractFactory.Abstract;

public abstract class AbstractFactory {
	public abstract Vehicle createVehicle();
	public abstract Food createFood();
	public abstract Weapon createWeapon();
}

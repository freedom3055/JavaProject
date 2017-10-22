package com.javapractice.DesignPatterns.Factory;

public class CarFactory extends VehicleFactory {

	@Override
	public Moveable createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}

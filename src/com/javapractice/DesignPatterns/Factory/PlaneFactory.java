package com.javapractice.DesignPatterns.Factory;

public class PlaneFactory extends VehicleFactory {

	@Override
	public Moveable createVehicle() {
		// TODO Auto-generated method stub
		return new Plane();
	}

}

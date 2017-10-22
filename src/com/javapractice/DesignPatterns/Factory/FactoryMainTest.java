package com.javapractice.DesignPatterns.Factory;

public class FactoryMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * The disadvantage is factory flooding
		 */
		VehicleFactory factory1 = new CarFactory();
		Moveable moveable1 = factory1.createVehicle();
		moveable1.run();
		
		VehicleFactory factory2 = new PlaneFactory();
		Moveable moveable2 = factory2.createVehicle();
		moveable2.run();
	}

}

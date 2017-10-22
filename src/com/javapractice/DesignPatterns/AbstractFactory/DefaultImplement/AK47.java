package com.javapractice.DesignPatterns.AbstractFactory.DefaultImplement;

import com.javapractice.DesignPatterns.AbstractFactory.Abstract.Weapon;

public class AK47 extends Weapon {

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("AK47 that implements abstract weapon at shooting");
	}

}

package com.javapractice.DesignPatterns.Strategy;

public class CatHeightComparator implements CatComparator<Cat> {

	@Override
	public int compare(Cat first, Cat second) {
		// TODO Auto-generated method stub
		//System.out.println("compare");
		if (first.getHeight() > second.getHeight()) {
			return 1;
		} else if (first.getHeight() < second.getHeight()) {
			return -1;
		}
		return 0;
	}

}

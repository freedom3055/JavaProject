package com.javapractice.DesignPatterns.Strategy;

public class CatWeightComparator implements CatComparator<Cat>{

	@Override
	public int compare(Cat first, Cat second) {
		// TODO Auto-generated method stub
		if (first.getWeight() > second.getWeight()) {
			return 1;
		}else if (first.getWeight() < second.getWeight()) {
			return -1;
		}
		return 0;
	}

}

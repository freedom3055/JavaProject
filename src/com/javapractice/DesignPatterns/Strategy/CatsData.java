package com.javapractice.DesignPatterns.Strategy;

public class CatsData {
	private CatComparator<Cat> comparator;

	public CatsData(CatComparator<Cat> comparator) {
		super();
		this.comparator = comparator;
	}
	
	public void sort(Cat[] cats){
		if (comparator == null) {
			throw new IllegalStateException("comparator not be null");
		}
		for (int i = 0; i < cats.length; i++) {
			for (int j = i+1; j < cats.length; j++) {
				if (comparator.compare(cats[i], cats[j])>0) {
					Cat cat = cats[i];
					cats[i] = cats[j];
					cats[j] = cat;
					//System.out.println("swap");
				}
			}
		}
	}
}

package com.javapractice.DesignPatterns.Strategy;

import java.util.Arrays;

public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat[] cats = {new Cat(7, 3),new Cat(5, 1),new Cat(19, 4),new Cat(31, 0),new Cat(9, 6)};
		CatsData catsData = new CatsData(new CatHeightComparator());
		catsData.sort(cats);
		System.out.println(Arrays.toString(cats));
		
		catsData = new CatsData(new CatWeightComparator());
		catsData.sort(cats);
		System.out.println(Arrays.toString(cats));

	}

}

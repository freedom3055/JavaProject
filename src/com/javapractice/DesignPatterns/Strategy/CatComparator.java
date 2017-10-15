package com.javapractice.DesignPatterns.Strategy;

public interface CatComparator<T> {
	int compare(T first, T second);
}

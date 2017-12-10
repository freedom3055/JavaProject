package com.javapractice.DesignPatterns.Composite;

public interface ViewGroup extends View {
	void addView(View view);
	void removeView(View view);
}

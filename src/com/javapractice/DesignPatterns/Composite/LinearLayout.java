package com.javapractice.DesignPatterns.Composite;

import java.util.HashSet;
import java.util.Set;

public class LinearLayout implements ViewGroup {

	private Set<View> views = new HashSet<>();
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw LinearLayout self");
		for (View view : views) {
			view.draw();
		}
	}

	@Override
	public void addView(View view) {
		// TODO Auto-generated method stub
		views.add(view);
	}

	@Override
	public void removeView(View view) {
		// TODO Auto-generated method stub
		views.remove(view);
	}

}

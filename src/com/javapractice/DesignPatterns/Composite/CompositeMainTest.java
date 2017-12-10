package com.javapractice.DesignPatterns.Composite;

public class CompositeMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewGroup viewGroup = new LinearLayout();
		viewGroup.addView(new TextView());
		viewGroup.addView(new ImageView());
		
		ViewGroup rootView = new LinearLayout();
		rootView.addView(new TextView());
		rootView.addView(viewGroup);
		
		rootView.draw();
	}

}

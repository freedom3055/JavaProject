package com.javapractice.DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject {
	private List<NewsObserver> observers = new ArrayList<>();
	public void attach(NewsObserver observer){
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}
	public void detach(NewsObserver observer){
		observers.remove(observer);
	}
	
	public void newsNotify(){
		for (NewsObserver newsObserver : observers) {
			newsObserver.notifyNews();
		}
	}
}

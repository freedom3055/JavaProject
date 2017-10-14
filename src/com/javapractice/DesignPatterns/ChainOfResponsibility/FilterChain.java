package com.javapractice.DesignPatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	private List<Filter> filters = new ArrayList<>();
	private int index;
	public FilterChain addFilter(Filter filter){
		this.filters.add(filter);
		return this;
	}
	
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		if (index == filters.size()) {
			return;
		}
		Filter filter = filters.get(index);
		index++;
		filter.doFilter(request, response, chain);
	}
}

package com.javapractice.DesignPatterns.ChainOfResponsibility;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}

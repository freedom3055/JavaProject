package com.javapractice.DesignPatterns.ChainOfResponsibility;

public class SecondChain implements Filter{
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		request.msg = request.msg +"--SecondChain--";
		chain.doFilter(request, response, chain);
		/**
		 * This code run after next filter finished;
		 */
		response.msg = response.msg + "--SecondChain--";
	}
}

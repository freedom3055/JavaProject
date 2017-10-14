package com.javapractice.DesignPatterns.ChainOfResponsibility;

public class FristChain implements Filter{
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		request.msg = request.msg +"--FristChain--";
		/**
		 * run next filter
		 */
		chain.doFilter(request, response, chain);
		/**
		 * This code run after next filter's doFilter finished;
		 */
		response.msg = response.msg + "--FristChain--";
		
	}
}

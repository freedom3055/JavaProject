package com.javapractice.DesignPatterns.ChainOfResponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FristChain fristChain = new FristChain();
		SecondChain secondChain = new SecondChain();
		FilterChain chain = new FilterChain();
		chain.addFilter(fristChain).addFilter(secondChain);
		Request request = new Request("request");
		Response response = new Response("response");
		
		chain.doFilter(request, response, chain);
		
		System.out.println(request.msg);
		System.out.println(response.msg);
	}

}

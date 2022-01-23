package com.strategypattern;

public class MainClass {

	public static void main(String[] args) {
		Context context=new Context(new Multiplication());
		System.out.println(context.execute(10, 20));
		
		
	}

}

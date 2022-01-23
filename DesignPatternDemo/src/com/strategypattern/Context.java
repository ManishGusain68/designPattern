package com.strategypattern;

public class Context {

	Strategy strategy;

	Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	int execute(int m,int n){
		return strategy.action(m, n);
	}

}

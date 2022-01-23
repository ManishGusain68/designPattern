package com.strategypattern;

public class Multiplication implements Strategy{

	@Override
	public int action(int x, int y) {
		return x*y;
	}

}

package com.strategypattern;

public class Division implements Strategy{

	@Override
	public int action(int x, int y) {
		return x/y;
	}

}

package com.strategypattern;

public class Addition implements Strategy{

	@Override
	public int action(int x, int y) {
		return x+y;
	}

}

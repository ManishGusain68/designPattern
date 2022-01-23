package com.factorypattern;

public class DotNetTrainer implements Trainer {

	int salary;
	String name;
	int bonus = 12000;

	public DotNetTrainer(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	@Override
	public void teach() {
		System.out.println("dot net teached is teaching");
	}

	@Override
	public void addBonus() {
		salary = this.salary + bonus;
	}

}

package com.factorypattern;

public class PythonTrainer implements Trainer {

	int salary;
	String name;
	int bonus = 15000;

	public PythonTrainer(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	@Override
	public void teach() {
		System.out.println("Python trainer is teaching");
	}

	@Override
	public void addBonus() {
		salary = this.salary + bonus;
	}

}

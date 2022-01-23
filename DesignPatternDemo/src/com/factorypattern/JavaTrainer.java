package com.factorypattern;

public class JavaTrainer implements Trainer{
	
	int salary;
	String name;
	int bonus=10000;
	
	

	public JavaTrainer(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	@Override
	public void teach() {
		System.out.println("Java trainer is teaching");
	}

	@Override
	public void addBonus() {
		salary = this.salary + bonus;
		
	}

	@Override
	public String toString() {
		return "JavaTrainer [salary=" + salary + ", name=" + name + ", bonus=" + bonus + "]";
	}
	
	

}

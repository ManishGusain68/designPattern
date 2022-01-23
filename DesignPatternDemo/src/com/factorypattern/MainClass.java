package com.factorypattern;

public class MainClass {

	public static void main(String[] args) {
	//	TrainerFactory factory=new TrainerFactory();
		
		Trainer trainer=TrainerFactory.getTrainer("java");  //Trainer trainer=new JavaTrainer();
		trainer.teach();
		trainer.addBonus();
		System.out.println(trainer);
		
		
		Trainer trainer1=TrainerFactory.getTrainer("PYTHON");
		trainer1.teach();

	}

}

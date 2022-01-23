package com.mvcdesignpattern;

public class MainClass {
	
//	static Trainer getModel(){
//		Trainer manish=new Trainer(112, "manish", 100000);
//		return manish;
//	}

	public static void main(String[] args) {
		Trainer model= new Trainer(112, "manish", 100000);
	
		
		TrainerView view = new TrainerView();
		
		TrainerController controller=new TrainerController(model, view);
		controller.setTrainerName("Shubham");
		
		controller.callView();

	}

}

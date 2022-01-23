package com.factorypattern;

public class TrainerFactory {

	static Trainer getTrainer(String trainerSkill) {
		if (trainerSkill.equalsIgnoreCase("JAVA")) {
			return new JavaTrainer(120000, "Manish");
		} else if (trainerSkill.equalsIgnoreCase("DOTNET")) {
			return new DotNetTrainer(150000,"Sanjeeta");
		} else if (trainerSkill.equalsIgnoreCase("PYTHON")) {
			return new PythonTrainer(100000,"Rakesh");
		} else
			return null;
	}

}

package com.mvcdesignpattern;

public class TrainerController {

	private Trainer model;
	private TrainerView view;

	public TrainerController(Trainer model, TrainerView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void setTrainerName(String name) {
		model.setName(name);
	}

	public String getTrainerName() {
		return model.getName();
	}

	public void setTrainerId(int id) {
		model.setId(id);
	}

	public int getTrainerId() {
		return model.getId();
	}

	public void setTrainerSalary(int salary) {
		model.setSalary(salary);
	}

	public int getTrainerSalary() {
		return model.getSalary();
	}
	
	public void callView(){
		view.callingView(model.getName(), model.getId(), model.getSalary());
	}

}

package com.oops.inheritance.abstract2;

public class Science extends Student {
	private double physics;
	private double checmistry;
	private double maths;

	public Science(String name) {
		super(name);
		this.physics = 0.0;
		this.checmistry = 0.0;
		this.maths = 0.0;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChecmistry() {
		return checmistry;
	}

	public void setChecmistry(double checmistry) {
		this.checmistry = checmistry;
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	@Override
	public double calculatePercentage() {
		System.out.println("Child class method");
		double percentage = (this.physics + this.checmistry + this.maths) / 3.0;
		super.setPercentages(percentage);
		return percentage;
	}

	@Override
	public String toString() {
		return "ScienceStudent [physics=" + physics + ", checmistry=" + checmistry + ", maths=" + maths
				+ ", Percentages=" + getPercentages() + ", RollNo=" + getRollNo() + ", Name=" + getName() + "]";
	}

}

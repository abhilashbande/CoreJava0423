package com.oops.inheritance;

public class Manager extends Employee {
	private int numberFeaturesDeveloped;

	public Manager(String name, String address, double salary, int noOfFeatures) {
		super(salary, name, address);
		numberFeaturesDeveloped = noOfFeatures;
	}

	public Manager(String name, double salary, int noOfFeatures) {
		super(salary, name);
		numberFeaturesDeveloped = noOfFeatures;
	}

	public int getNumberFeaturesDeveloped() {
		return numberFeaturesDeveloped;
	}

	public void setNumberFeaturesDeveloped(int numberFeaturesDeveloped) {
		this.numberFeaturesDeveloped = numberFeaturesDeveloped;
	}

	@Override
	public String toString() {
		return "Manager [Name=" + getName() + ", Address=" + getAddress() + ", Salary=" + getSalary() + ", EmpId="
				+ getEmpId() + ", Number of features developed =" + this.numberFeaturesDeveloped + "]";
	}

}

package com.oops.inheritance;

public class HR extends Employee {
	private int noOfHires;
	private double incentive;

	public HR(String name, double salary, int noOfHires, double incentive) {
		super(salary, name);
		this.noOfHires = noOfHires;
		this.incentive = incentive;
	}

	public HR(String name, String address, double salary, int noOfHires, double incentive) {
		super(salary, name, address);
		this.noOfHires = noOfHires;
		this.incentive = incentive;
	}

	public int getNoOfHires() {
		return noOfHires;
	}

	public void setNoOfHires(int noOfHires) {
		this.noOfHires = noOfHires;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "HR [Name=" + getName() + ", Address=" + getAddress() + ", noOfHires=" + noOfHires + ", incentive="
				+ incentive + ", Salary=" + getSalary() + ", EmpId=" + getEmpId() + "]";
	}
	
	@Override
	public double calculateSalary() {
		return super.getSalary() + this.incentive * this.noOfHires;
	}
}

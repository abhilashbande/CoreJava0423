package com.oops.inheritance;

public class HR extends Employee {
	public double incentive;
	public int noOfHires;

	public HR() {
		this.incentive = 0;
		this.noOfHires = 0;
		System.out.println("HR default ctor");
	}

	public HR(int id, String name, double salary, double incentive, int noOfHires) {
		super(id, name, salary);
		this.incentive = incentive;
		this.noOfHires = noOfHires;
		System.out.println("HR parameterized ctor");
	}

	public String toString() {
		return "HR [incentive=" + incentive + ", noOfHires=" + noOfHires + "]";
	}

}

package com.oops.inheritance;

public class HR extends Employee {
	private int noOfHires;
	private double bonusPerHire;

	public HR(String name, String address, double salary, double bonusPerHire) {
		super(name, address, salary);
		this.noOfHires = 0;
		this.bonusPerHire = bonusPerHire;
	}

	public HR(String name, double salary, double bonusPerHire) {
		super(name, salary);
		this.noOfHires = 0;
		this.bonusPerHire = bonusPerHire;
	}

	public int getNoOfHires() {
		return noOfHires;
	}

	public void setNoOfHires(int noOfHires) {
		this.noOfHires = noOfHires;
		calculateSalary();
	}

	public double getBonusPerHire() {
		return bonusPerHire;
	}

	public void setBonusPerHire(double bonusPerHire) {
		this.bonusPerHire = bonusPerHire;
		calculateSalary();
	}

	@Override
	public String toString() {
		return "HR [EmpId=" + getEmpId() + ", Name=" + getName() + ", Address=" + getAddress() + ", noOfHires="
				+ noOfHires + ", bonusPerHire=" + bonusPerHire + ", Salary=" + getSalary() + "]";
	}

	@Override
	public double calculateSalary() {
		double salaryAfterBonus = super.getSalary() + (this.bonusPerHire * this.noOfHires);
		super.setSalary(salaryAfterBonus);
		return salaryAfterBonus;
	}
}

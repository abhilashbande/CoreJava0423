package com.oops.inheritance;

public class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String address, double salary) {
		super(name, address, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [EmpId=" + getEmpId() + ", Name=" + getName() + ", Address=" + getAddress() + ", Salary="
				+ getSalary() + "]";
	}

}

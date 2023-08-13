package com.oops.inheritance;

public class Employee extends Person {
	private int empId;
	private double salary;

	private static int empIdGenerator;

	static {
		empIdGenerator = 0;
	}

	public Employee(double salary, String name, String address) {
		super(name, address);
		this.salary = salary;
		this.empId = ++empIdGenerator;
	}
	
	public Employee(double salary, String name) {
		super(name);
		this.salary = salary;
		this.empId = ++empIdGenerator;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public static int getEmpIdGenerator() {
		return empIdGenerator;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + getName() + ", Address()=" + getAddress() + "empId=" + empId + ", salary=" + salary
				+ "]";
	}
	
	public double calculateSalary() {
		return this.salary;
	}
}

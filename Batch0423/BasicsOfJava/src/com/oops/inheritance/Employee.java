package com.oops.inheritance;

// is a relation
public class Employee extends Person {
	private int empId;
	private static int nextId;
	private double salary;

	static {
		nextId = 0;
	}

	public Employee(String name, double salary) {
		super(name);
		this.empId = ++nextId;
		this.salary = salary;
	}

	public Employee(String name, String address, double salary) {
		super(name, address);
		this.empId = ++nextId;
		this.salary = salary;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
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

	public double calculateSalary() {
		return salary;
	}


}

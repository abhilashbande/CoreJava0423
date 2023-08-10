package com.oops.inheritance;

public class Employee {
	public String name;
	public int id;
	public double salary;

	public Employee() {
		System.out.println("Employee default ctor");
		this.name = "";
		this.id = -1;
		this.salary = 0.0;
	}

	public Employee(int id, String name, double salary) {
		System.out.println("Employee parameterized ctor");
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}

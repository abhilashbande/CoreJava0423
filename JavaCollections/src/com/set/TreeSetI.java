package com.set;

import java.util.TreeSet;
import java.util.Set;

class Employee implements Comparable<Employee> {
	private static int idGenerator = 0;
	private int empId;
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.empId = ++idGenerator;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee obj) {
		return this.name.compareTo(obj.name);

		// return this.empId.compareTo(obj.empId);

	}

}

public class TreeSetI {
	static Set<Employee> set = new TreeSet<Employee>();

	// create
	private static void addToList() {
		set.add(new Employee("Mercy", 985665.56));
		set.add(new Employee("Sandhya", 54478.56));
		set.add(new Employee("Anup", 783365.56));
		set.add(new Employee("Madhavi", 654874.56));
	}

	// read
	private static void print() {
		// System.out.println(set);

		for (Employee e : set) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create
		addToList();

		// read
		print();
	}

}

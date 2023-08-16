package com.oops.inheritance.abstract2;

public class Student {
	private static int nextId;

	private int rollNo;
	private String name;
	private double percentages;

	static {
		nextId = 0;
	}

	public Student(String name) {
		this.rollNo = ++nextId;
		this.name = name;
		this.percentages = 0.0;
	}

	public double getPercentages() {
		return percentages;
	}

	public void setPercentages(double percentage) {
		this.percentages = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	
	public double calculatePercentage() {
		System.out.println("Parent class method");
		return percentages;
	}

}

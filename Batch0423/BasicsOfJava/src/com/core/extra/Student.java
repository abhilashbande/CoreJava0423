package com.core.extra;

public class Student {
	public static int id;
	private int rollNo;
	private String name;

	public Student(String name) {
		super();
		this.rollNo = ++id;
		this.name = name;
	}

	@Override
	public String toString() {
		return rollNo + " - " + name;
	}

}

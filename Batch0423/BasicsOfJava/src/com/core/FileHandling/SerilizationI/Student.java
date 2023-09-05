package com.core.FileHandling.SerilizationI;

import java.io.Serializable;

@SuppressWarnings("serial")		// optional
public class Student implements Serializable {

	private static int rollNoGenerator = 0;
	private int rollNo;
	private String name;
	private double marks;

	public Student(String name, double marks) {
		super();
		this.rollNo = ++rollNoGenerator;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}

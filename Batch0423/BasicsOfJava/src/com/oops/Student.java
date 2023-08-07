package com.oops;

public class Student {
	// data -> data members / properties

	private int id;
	private String name;
	private float marks;
	private String address;

	// default
	public Student() {
		name = "undefined";
		address = "undefined";
		id = -1;
		marks = -1.0f;
	}

	// parameterized
	public Student(int id, String name, String address, float marks) {
		this.name = name;
		this.address = address;
		this.id = id;
		this.marks = marks;
	}

	public Student(String name, String address, float marks) {
		this.name = name;
		this.address = address;
		id = 0;
		this.marks = marks;
	}

	// member functions
	// setters/mutators
	public void setMarks(float marks) {
		if (marks > 100 || marks < 0) {
			System.out.println("Error : Invalid marks!!!");
			this.marks = -1.0f;
			return;
		}
		this.marks = marks;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// getters/accessors
	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}
}

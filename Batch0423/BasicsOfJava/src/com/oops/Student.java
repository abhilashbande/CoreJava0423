package com.oops;

public class Student {

	private static int studentCount;
	private static int nextId;

	private int id;
	private String name;

	static {
		studentCount = 0;
		nextId = 0;
	}
	
	public Student() {
		this.id = ++nextId;
		studentCount++;
	}

	public Student(String name) {
		System.out.println("Adding " + name + " to the class");
		this.id = ++nextId;
		this.name = name;
		studentCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

package com.list;

import java.util.ArrayList;

class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private double marks;

	private static int rollNoGenerator = 0;

	public Student(String name, double marks) {
		super();
		this.rollNo = ++rollNoGenerator;
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks > o.marks)
			return 1;
		else if (this.marks < o.marks)
			return -1;
		return 0;
	}

}

public class ArrayListI {

	private ArrayList<Student> students = new ArrayList<Student>();

	private void addStudents(String name, double marks) {
		Student s1 = new Student(name, marks);
		students.add(s1);
		// students.add(new Student(name));
	}

	private void addStudents() {
		addStudents("Prashant", 75);
		addStudents("Anup", 78);
		addStudents("Rajat", 98.45);
		addStudents("Sandhya", 87);
		addStudents("Latesh", 65);
		addStudents("Paresh", 79);
	}

	private void print() {
		// System.out.println(students);
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void sort() {
		students.sort(null);
	}

	public static void main(String[] args) {
		ArrayListI app = new ArrayListI();

		app.addStudents();
		app.print();

		System.out.println("*********************************");
		// app.sort();
		// app.print();

		// System.out.println(i1.compareTo(i2));

	}

}

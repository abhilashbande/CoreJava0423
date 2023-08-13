package com.oops;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// class -> a template used to create objects
		// (user defined data type)
		// object -> is an instance of the class
		// Student s1 = new Student();
		// System.out.println(s1.getName());
		//
		// Student s2 = new Student(2, "Prashant", "Mumbai", 87.65f);
		// Student s3 = new Student("Prashant", "Mumbai", 87.65f);
		// System.out.println(s2.getName());
		//
		// //setters
		// s1.setId(1);
		// s1.setName("Madhra");
		// s1.setAddress("Pune");
		// s1.setMarks(57.66f);
		// // s1.setMarks(573.66f);
		//
		//
		// getters
		// System.out.println("ID : " + s1.getId());
		// System.out.println("Name : " + s1.getName());
		// System.out.println("Address : " + s1.getAddress());
		// System.out.println("Marks : " + s1.getMarks());

		// Car c1 = new Car();
		// c1.setEngine("started");
		// c1.run();
		// System.out.println(c1.getEngine());

		// Student s1 = new Student(); // -> default
		// Student s2 = new Student("Deepti"); // -> parameterized

		//

		// Student.setTrainerName("Abhilash");
		// Student s1 = new Student(1, "Sharvari");
		// Student s2 = new Student(2, "Paresh ");
		//
		// System.out.println(s1.getTrainerName());
		// System.out.println(s2.getTrainerName());
		//
		// Student.setTrainerName("XYZ");
		//
		// System.out.println(s1.getTrainerName());
		// System.out.println(s2.getTrainerName());
		// System.out.println(Student.getTrainerName()); // to call static methods we
		// can use classname

		// Student s[] = new Student[3];
		// Scanner sc = new Scanner(System.in);
		// for (int i = 0; i < s.length; i++) {
		// System.out.print("Enter name of the student : ");
		// String name = sc.next();
		// s[i] = new Student(i, name);
		// }
		//
		//// for (int i = 0; i < s.length; i++) {
		//// System.out.println(s[i]);
		//// }
		//
		// // for each
		// for (Student stud : s) {
		// System.out.println(stud);
		// }

		int i = 10;
		
		Student s1 = new Student("Saurabh");
		Student s2 = new Student("Sehar");

		
		s2 =  s1;

		System.gc();
		System.runFinalization();

		// System.out.println(s1);
		// System.out.println(s2);
		// System.out.println(s3);
		// System.out.println(s4);
		// System.out.println(s5);

		System.out.println("There are " + Student.getStudentCount() + " students in the class");

	}

}

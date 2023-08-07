package com.oops;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// class -> a template used to create objects
		// (user defined data type)
		// object -> is an instance of the class
		Student s1 = new Student();
		System.out.println(s1.getName());
		
		Student s2 = new Student(2, "Prashant", "Mumbai", 87.65f);
		Student s3 = new Student("Prashant", "Mumbai", 87.65f);
		System.out.println(s2.getName());
//		
//		//setters
//		s1.setId(1);
//		s1.setName("Madhra");
//		s1.setAddress("Pune");
//		s1.setMarks(57.66f);
//		// s1.setMarks(573.66f);
//
//		
		// getters 
//		System.out.println("ID : " + s1.getId());
//		System.out.println("Name : " + s1.getName());
//		System.out.println("Address : " + s1.getAddress());
//		System.out.println("Marks : " + s1.getMarks());
		

		Car c1 = new Car();
		//c1.setEngine("started");
		//c1.run();
		//System.out.println(c1.getEngine());
		
	}

}

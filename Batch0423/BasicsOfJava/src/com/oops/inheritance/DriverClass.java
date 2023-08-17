package com.oops.inheritance;

import java.util.Iterator;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		System.out.print("Enter number of managers to add :: ");
//		int size = sc.nextInt();
//
//		Manager manager[] = new Manager[size];
//
//		for (int i = 0; i < manager.length; i++) {
//			System.out.print("Enter name for manager :: ");
//			String name = sc.next();
//			System.out.print("Enter address for manager :: ");
//			String address = sc.next();
//			System.out.print("Enter salary for manager :: ");
//			double salary = sc.nextDouble();
//			manager[i] = new Manager(name, address, salary);
//		}
//		
//		manager[0].calculateSalary();
//
//		System.out.println("\n*************************************\n");
//		for (Manager m : manager) {
//			System.out.println(m);
//		}
//
//		System.out.print("Enter number of HRs to add :: ");
//		size = sc.nextInt();
//
//		// create array for HR
//		HR hr[] = new HR[size];
//
//		for (int i = 0; i < hr.length; i++) {
//			System.out.print("Enter name for HR :: ");
//			String name = sc.next();
//			System.out.print("Enter address for HR :: ");
//			String address = sc.next();
//			System.out.print("Enter salary for HR :: ");
//			double salary = sc.nextDouble();
//			System.out.print("Enter incentive per fire for HR :: ");
//			double incentive = sc.nextDouble();
//			hr[i] = new HR(name, address, salary, incentive);
//		}
//		
//		
//		hr[0].setNoOfHires(2);
//		
//		
//		//hr[1].setNoOfHires(5);
//		//hr[1].calculateSalary();
//		
//		System.out.println("\n*************************************\n");
//		for (HR h : hr) {
//			System.out.println(h);
//		}
		
		System.out.print("Enter number of employees to add :: ");
		int size = sc.nextInt();
		
		Employee emp[] = new Employee[size];
		
		
		
		for (int i = 0; i < emp.length; i++) {
			System.out.print("Enter name of the Employee :: ");
			String name = sc.next();
			System.out.print("Enter address of the Employee :: ");
			String address = sc.next();
			System.out.print("Enter salary of the Employee :: ");
			double salary = sc.nextDouble();
			
			emp[i] = new HR(name, address, salary, 1000);
		}
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		
	}

}

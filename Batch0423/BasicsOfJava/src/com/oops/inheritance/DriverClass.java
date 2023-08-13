package com.oops.inheritance;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter number of employees : ");
//		int size = sc.nextInt();
//		
//		HR hr[] = new HR[size];
//		
//		
//		for(int i=0; i<hr.length;i++)
//		{
//			sc.nextLine();
//			System.out.print("Enter name of the employee : ");
//			String name = sc.nextLine();
//			System.out.print("Enter address of the employee : ");
//			String address = sc.nextLine();
//			System.out.print("Enter salary of the employee : ");
//			double salary = sc.nextDouble();
//			System.out.print("Enter incentive of the employee : ");
//			double incentive = sc.nextDouble();
//			
//			hr[i] = new HR(name, address, salary, 0, incentive);
//		}
//		
//		System.out.println("***************************");
//		for (HR empRecord : hr) {
//			System.out.println(empRecord);
//		}
		
	
		HR h1 = new HR("Rachna", 10000, 10, 1000);	// 10000 + 10*1000 = 20000
		System.out.println("Salary after calculations is : Rs. " + h1.calculateSalary());

		Manager m1 = new Manager("Rohit", 65000, 10);
		System.out.println(m1);
	}

}

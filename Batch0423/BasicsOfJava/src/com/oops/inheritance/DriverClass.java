package com.oops.inheritance;

import java.util.Scanner;

public class DriverClass {
	private static Scanner sc = new Scanner(System.in);

	private static int printMenu() {
		System.out.println("1. Add new Manager");
		System.out.println("2. Add new HR");
		System.out.println("3. Display all employees");
		System.out.println("4. Update number of hires for HR");
		System.out.println("5. Update Name of an employee");
		//System.out.println("6. Update Salary of an employee");
		//System.out.println("7. Update Address of an employee");
		System.out.println("0. Exit");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userChoice = 0;
		Employee emp[] = new Employee[5];
		int counter = 0;
		int empId = 0, numberOfHires = 0;
		String name = "";
		double salary = 0, bonusPerHire = 0;

		do {
			userChoice = printMenu();
			switch (userChoice) {
			case 1:
				// add new manager
				System.out.print("\nEnter name of the manager : ");
				name = sc.next();
				System.out.print("Enter salary of the manager : ");
				salary = sc.nextDouble();
				emp[counter++] = new Manager(name, salary);
				break;

			case 2:
				// add new HR
				System.out.print("\nEnter name of the HR : ");
				name = sc.next();
				System.out.print("Enter salary of the HR : ");
				salary = sc.nextDouble();
				System.out.print("Enter bonus per hire of the HR : ");
				bonusPerHire = sc.nextDouble();
				emp[counter++] = new HR(name, salary, bonusPerHire);
				break;

			case 3:
				// display all employees
				for (int i = 0; i < counter; i++) {
					System.out.println(emp[i]);
				}
				break;

			case 4:
				System.out.print("\nEnter employee ID : ");
				empId = sc.nextInt();

				for (int i = 0; i < counter; i++) {
					if (empId == emp[i].getEmpId()) {
						if (emp[i] instanceof HR) {
							HR h = (HR) emp[i];
							System.out.print("Enter number of hires: ");
							numberOfHires = sc.nextInt();
							h.setNoOfHires(numberOfHires);
						}
						else
						{
							System.out.println("Error :: Can not set number of hires for manager object/employee");
						}
					}
				}

				break;
				
			case 5 :
				System.out.print("\nEnter employee ID : ");
				empId = sc.nextInt();
				for (int i = 0; i < counter; i++) {
					if (empId == emp[i].getEmpId()) {
						System.out.print("\nEnter name of the employee : ");
						name = sc.next();
						emp[i].setName(name);
					}
				}
				
				break;

			default:
				System.out.println("Error : Invalid choice. Try again!!!");
				break;
			}
		} while (userChoice > 0);

	}

}

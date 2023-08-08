package com.oops;

public class Student {
	// data members -> properties

	private static String trainerName;
	public static int count = 0;
	private int id;
	private String address;
	private String name;
	private double english;
	private double science;
	private double maths;
	private double total;
	// private double percentage;

	// member functions / methods / behaviour
	public Student(int id, String name, String address) {
		this.id = count;
		this.address = address;
		this.name = name;
		this.english = 0.0;
		this.science = 0.0;
		this.maths = 0.0;
		this.total = 0.0;
		count++;
		// this.percentage = 0.0;
	}

	public Student(int id, String name) {
		count++;
		this.id = id;
		this.name = name;
		this.address = "";
		this.english = 0.0;
		this.science = 0.0;
		this.maths = 0.0;
		this.total = 0.0;
		// this.percentage = 0.0;
	}

	private void updateTotal() {
		total = science + maths + english;
		
	}

	// private void updatePercentage() {
	// percentage = total/3.0;
	// }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
		updateTotal();
	}

	public double getScience() {
		return science;
	}

	public void setScience(double science) {
		this.science = science;
		updateTotal();
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
		updateTotal();
	}

	public int getId() {
		return id;
	}

	public double getTotal() {
		return total;
	}

	public static String getTrainerName() {
		return trainerName;
	}

	public static void setTrainerName(String trainerName) {
		Student.trainerName = trainerName;
	}

	// public double getPercentage() {
	// return percentage;
	// }

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", english=" + english + ", science=" + science + ", maths="
				+ maths + ", total=" + total + "]";
	}

}

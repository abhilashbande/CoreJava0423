package com.oops.inheritance.abstract2;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Science s1 = new Science("Shanti");
		s1.setPhysics(76);
		s1.setChecmistry(65);
		s1.setMaths(88);
		double percentage = s1.calculatePercentage();
		
		
		
		
//		//System.out.println("Percentages are " + percentage);
//		//System.out.println(s1);
//		
//		Arts s2 = new Arts("Anjali");
//		s2.setHistory(98);
//		s2.setMusic(94);
//		
//		s2.calculatePercentage();
//		System.out.println(s2);
		
	}

}

package com.commandArgs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!!");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("Command line argument " + (i+1) + " is : " + args[i]);
		}
	}

}

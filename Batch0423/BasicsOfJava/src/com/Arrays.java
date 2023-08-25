package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array of 10 integers
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; ++i)
		{
			System.out.print("Enter " + (i + 1) + " element :");
			arr[i] = sc.nextInt();
			//System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < arr.length; ++i)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}

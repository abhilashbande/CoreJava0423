package com;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array of 10 integers
//		int arr[] = new int[10];
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < arr.length; ++i)
//		{
//			System.out.print("Enter " + (i + 1) + " element :");
//			arr[i] = sc.nextInt();
//			//System.out.print(arr[i] + " ");
//		}
//		
//		for(int i = 0; i < arr.length; ++i)
//		{
//			System.out.print(arr[i] + " ");
//		}

		// collection of similar data type
		// memory allocation is contiguous

		int arr[][] = new int[3][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;

		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;

		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;

//		for(int i=0; i< arr.length; i++)
//		{
//			for(int j=0; j< arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.print("\n");
//		}

		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.print("\n");

		}

		// create a new array of size 4
		// copy all contents of old array to new array

	}

}

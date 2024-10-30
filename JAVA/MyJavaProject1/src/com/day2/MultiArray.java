package com.day2;

public class MultiArray {
	//Array of Array concept for multidimensional array
	public static void main(String[] args) {
		
		/*
		  int arr[][]= {{1,2,3},{4,5},{6,7,8,9}}; method -1
		
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		int arr[][]=new int[3][];             //method -2
		
		arr[0]= new int[] {1,2,3};
		arr[1]=new int[] {4,5};
		arr[2]=new int[] {6,7,8,9};
		
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}

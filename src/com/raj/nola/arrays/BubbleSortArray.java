package com.raj.nola.arrays;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 100,90,80,70,60,50,40,30,20,10 };
		
		System.out.println("Array before sorting");

		System.out.println(Arrays.toString(arr));
		
		System.out.println();	
		
		bubbleSort(arr);

	}

	static void bubbleSort(int arr[]) {

		int temp;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 1; j < arr.length - i; j++) {
				
				if(arr[j-1]>arr[j]) {
					
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}

			}
			
			System.out.println("Array after "+(i+1)+"th iteration:"+Arrays.toString(arr));
		}
		
		

	}

}

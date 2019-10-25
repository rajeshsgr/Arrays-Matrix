package com.raj.nola.arrays;

import java.util.Scanner;

public class TwoDimensionalArrayDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 3;
		int col = 3;

		int[][] firstArray = new int[row][col];
		int[][] secondArray = new int[row][col];

		Scanner sc = new Scanner(System.in);

		// Input values for first Array
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print(String.format("Enter First Array [%d][%d] integer: ", i + 1, j + 1));
				firstArray[i][j] = sc.nextInt();
				System.out.println();

			}
		}

		// Input values for second Array
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print(String.format("Enter Second Array [%d][%d] integer: ", i + 1, j + 1));
				secondArray[i][j] = sc.nextInt();
				System.out.println();

			}
		}

		sc.close();

		System.out.println("Display First Array");
		displayArray(firstArray);

		System.out.println("\n Display Second Array");
		displayArray(secondArray);
		
		sumArray(firstArray,secondArray);
		
		subtractArray(firstArray,secondArray);
		
		multiplyArray(firstArray,secondArray);

	}

	static void sumArray(int[][] arrayOne, int[][] arrayTwo) {

		int row = arrayOne.length;
		int column = arrayOne[0].length;

		int[][] sumResultArray = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sumResultArray[i][j] = arrayOne[i][j] + arrayTwo[i][j];
			}
		}

		System.out.println("\nAddition of Array:\n");
		displayArray(sumResultArray);

	}
	
	static void subtractArray(int[][] arrayOne, int[][] arrayTwo) {

		int row = arrayOne.length;
		int column = arrayOne[0].length;

		int[][] sumResultArray = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sumResultArray[i][j] = arrayOne[i][j] - arrayTwo[i][j];
			}
		}

		System.out.println("\nSubtraction of Array:\n");
		displayArray(sumResultArray);

	}
	
	
	static void multiplyArray(int[][] arrayOne, int[][] arrayTwo) {

		int row = arrayOne.length;
		int column = arrayOne[0].length;

		int[][] sumResultArray = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sumResultArray[i][j] = arrayOne[i][j] * arrayTwo[i][j];
			}
		}

		System.out.println("\nMultiplication of Array:\n");
		displayArray(sumResultArray);

	}

	static void displayArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print("[");
			for (int j = 0; j < array[0].length; j++) {
				System.out.print("\t" + array[i][j] + "\t");
			}
			System.out.print("]");

			System.out.println();

		}
	}

}

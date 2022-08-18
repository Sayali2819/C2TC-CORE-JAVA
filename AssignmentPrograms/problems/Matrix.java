//Taking a matrix as an input and printing its elements

package com.tns.problems;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter the Number of Columns:");
		int cols = sc.nextInt();
		
		int[][] values = new int[rows][cols];
		
		//Input
		System.out.println("Enter the Matrix:");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				values[i][j] = sc.nextInt();
			}
		}
		
		//Output
		System.out.println("Entered Matrix is:");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(values[i][j]+" ");
			}
			System.out.println();
		}
	}

}

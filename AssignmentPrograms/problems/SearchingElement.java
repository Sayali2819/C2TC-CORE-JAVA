//Searching for an element x in a matrix
package com.tns.problems;

import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of cols:");
		int cols = sc.nextInt();
		
		int num[][] = new int[rows][cols];
		
		//Input
		System.out.println("Enter the Matrix:");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				num[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Enter the value you want to search x:");
		int x = sc.nextInt();
		
		//Output
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(num[i][j] == x)
				{
					System.out.println("Value x is at index (" + i + ',' + j + ")" );
				}
			}
		}
	}

}

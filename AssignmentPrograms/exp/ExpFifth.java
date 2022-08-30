//Add two matrix
package com.tns.exp;

import java.util.Scanner;

public class ExpFifth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in matrix:");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of columns of matrix:");
		int m = sc.nextInt();
		
		int[][] x = new int[n][m]; 
		int[][] y = new int[n][m]; 
		int[][] a = new int[n][m]; 
		
		System.out.println("Enter the elements of Array1:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				x[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of Array2:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				y[i][j]= sc.nextInt();
			}
		}
	
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				a[i][j] = x[i][j] + y[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}

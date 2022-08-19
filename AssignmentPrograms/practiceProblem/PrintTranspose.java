//Print transpose of Matrix
package com.tns.practiceProblem;

import java.util.Scanner;

public class PrintTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of columns:");
		int m = sc.nextInt();
		
		int matrix[][] = new int[n][m];
		
		//Input
		System.out.println("Enter the Elements of Matrix:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//Output
		System.out.println("Transpose of Matrix is:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}

}

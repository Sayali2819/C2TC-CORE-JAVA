//Print the spiral order matrix output for a given matrix of numbers.

package com.tns.practiceProblem;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Rows:");
		 int n = sc.nextInt();
		
		System.out.println("Enter the number of Columns:");
		 int m = sc.nextInt();
		
		int matrix[][] = new int[n][m];
		
		//Input
		System.out.println("Enter the Matrix:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//Output
		int top    = 0;      //rowStart
		int bottom = n-1;    //rowEnd 
		int left   = 0;      //columnStart
		int right  = m-1;    //columnEnd
	
		System.out.println("Spiral Order Matrix: ");
		while(top <= bottom && left <= right) {
			
			//Loop for direction left to right
				for(int i=left; i<=right; i++) {
					System.out.print(matrix[top][i]+" ");
				}
				top += 1;
			
			//Loop for direction top to bottom
				for(int i=top; i<=bottom; i++) {
					System.out.print(matrix[i][right]+" ");
				}
				right -= 1;
			
			//Loop for direction right to left			
				for(int i=right; i>=left; i--) {
					System.out.print(matrix[bottom][i]+" ");
				}
				bottom -= 1;
			
			//Loop for direction bottom to top
				for(int i=bottom; i>=top; i--) {
					System.out.print(matrix[i][left]+" ");
				}
			    left += 1;
			    
			    System.out.println();
		 }
	}

}

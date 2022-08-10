package com.tns.practice;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		//Loop to print rows
		for(int i=1; i<=n; i++) 
		{
			//Loop to print space
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			
			//Loop to print star
			for(int k=1; k<=(2*i-1); k++) 
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}

}

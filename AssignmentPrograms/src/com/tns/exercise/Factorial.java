package com.tns.exercise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int fact = 1;
		
		if(n>=2)
		{
			for(int i=n; i>=1; i--)
			{
				fact = fact * i;
			}
			System.out.println(fact);
		}
		else
		{
			System.out.println(1);
		}
		


	}

}

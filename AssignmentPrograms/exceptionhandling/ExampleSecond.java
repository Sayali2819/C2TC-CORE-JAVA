package com.sp.exceptionhandling;

import java.util.Scanner;

public class ExampleSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numerator:");
		int i = sc.nextInt();
		
		System.out.println("Enter the Denominator:");
		int j = sc.nextInt();
		
		int div;
		
		try {
			 div = i/j;
			 System.out.println("Output:"+div);
		}
		
		catch(Exception e) {
			System.out.println("Output:"+(i/(j+2)));
			
		}
	}

}

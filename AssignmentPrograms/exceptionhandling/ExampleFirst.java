package com.sp.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleFirst {
	public static void main(String[] args) {
		try 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the First Integer:");
			int n = sc.nextInt();
			
			System.out.println("Enter the Second Integer:");
			int m = sc.nextInt();
			
			if(n<0 || m<0) {
				System.out.println("Input can not be negative!");
			}

			System.out.println("Output:"+n/m);
		
		}
		
		catch(InputMismatchException e) {
			System.out.println("Input should be of Same type!");
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}

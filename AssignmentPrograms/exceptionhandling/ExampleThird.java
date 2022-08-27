package com.sp.exceptionhandling;

import java.util.Scanner;

public class ExampleThird {

	public static void main(String[] args) {
		
		try {                //Outer Try Block
			Scanner s = new Scanner(System.in);
			
			try {           //Inner Try Block 1
				
				System.out.println("Enter the Numerator:");
				int n = s.nextInt();
				
				System.out.println("Enter the Denominartor:");
				int d = s.nextInt();
				
				int div=n/d;
				System.out.println("Output:"+div);
			}
			catch(ArithmeticException e)  // Inner Catch Block 1
			{
				System.out.println(e);
			}
			
			try 
			{          //Inner Try Block 2
				int a[] = new int[5];
				a[6] = 89;
			}
			
			catch(ArrayIndexOutOfBoundsException ex) //Inner Catch Block 2
			{
				System.out.println(ex);
			}
		}
		
		catch(Exception e)  //Outer Catch Block
		{
			System.out.println(e);
		}
	
	}
}

//Print leap year or not
package com.tns.exp;

import java.util.Scanner;

public class ExpSecond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year:");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			System.out.printf("%d Leap Year", year);
		}
		else {
			System.out.printf("%d Is not a Leap Year", year);
		}

	}

}

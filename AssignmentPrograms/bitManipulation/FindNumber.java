//Find if a number is a power of 2 or not
package com.tns.bitManipulation;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
	
		if(n>0 && (n & (n-1)) == 0) {
			System.out.println("Number is power of 2");
		}
		else {
			System.out.println("Number is not power of 2");
		}
		
	}
	
}

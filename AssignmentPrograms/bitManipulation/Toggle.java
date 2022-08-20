//Toggle a bit at position = "pos" in number n
package com.tns.bitManipulation;

import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number n:");
		int n = sc.nextInt();
		
		System.out.println("Enter the position:");
		int pos = sc.nextInt();
		
		int bitMask = 1<<pos;
		
		int newNumber = n ^ bitMask;
		
		System.out.println(newNumber);
	}

}

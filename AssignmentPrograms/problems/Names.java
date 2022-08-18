//Take an array of names as input from user and print them on the screen
package com.tns.problems;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		
		String names[] = new String[size];
		
		//Input
		System.out.println("Enter the Array Elements:");
		for(int i=0; i<size; i++)
		{
			names[i] = sc.next();
		}
		
		//Output
		System.out.println("Entered Names are: ");
		for(int i=0; i<size; i++)
		{
			System.out.println("name "+(i+1)+ " is " +names[i]);
		}

	}

}

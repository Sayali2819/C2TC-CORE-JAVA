//Take an array of numbers as input and check if it is sorted in ascending order
package com.tns.problems;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		
		int num[] = new int[size];
		
		//Input
		System.out.println("Enter the Elements of Array:");
		for(int i=0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		
		boolean isAscending = true;
		
		//Output
		for(int i=0; i<num.length-1; i++)
		{
			if(num[i] > num[i+1])
			{
				isAscending = false;
			}
		}
		
		if(isAscending)
		{
			System.out.println("The array is Sorted in Ascending Order");
		}
		else 
		{
			System.out.println("The array is Not Sorted in Ascending Order");
		}
	}

}

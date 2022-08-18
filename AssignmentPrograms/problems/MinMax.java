//Find the minimum & maximum number in an array of integer
package com.tns.problems;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		//Input
		System.out.println("Enter the Elements of Array:");
		for(int i=0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		//Output
		for(int i=0; i<num.length; i++)
		{
			if(num[i] < min)
			{
				min = num[i];
			}
			
			if(num[i] > max)
			{
				max = num[i];
			}
		}
		
		System.out.println("Largest Number is "+max);
		System.out.println("Smallest Number is "+min);

	}

}

//To insert element at specific position 
package com.tns.examples;

import java.util.Scanner;

public class ArrayElement {

	public static void main(String[] args) {
		int [] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements:");
		int l = arr.length;
		
		//Loop to insert elements
		for(int i=0; i<l-1; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Printing elements before inserting:");
		for(int i : arr) 
		{
			System.out.println(i);
		}
		
		System.out.println("Enter the location where you want to insert the element:");
		int location=sc.nextInt();
		
		System.out.println("Enter the value you want to insert:");
		int value=sc.nextInt();
		
		for(int i=l-1; i>location; i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[location]=value;
		
		System.out.println("Printing elements after inserting:");
		for(int i : arr)
		{
			System.out.println(i);
		}
	
		
		}
}

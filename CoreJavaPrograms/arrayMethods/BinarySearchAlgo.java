package com.tns.arrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgo {

	public static void main(String[] args) {
//		int[] arr = {10, 52, 89, 45, 75, 69, 75};
//		int key = 89;
//		
//		Arrays.sort(arr);
//		System.out.printf("Value %d is found at index  ", key);
//		System.out.print(Arrays.binarySearch(arr, key));
		
		//Taking User Input
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array:");
		int size = s.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Array Elements:");
		for(int i=0; i<size; i++)
		{
			arr[i] = s.nextInt(); 
		}
		
		Arrays.sort(arr);
		System.out.println("Sorted Array :");
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("Enter the search key:");
		int key = s.nextInt();
		System.out.printf("Key %d is present at index ", key);
		System.out.println(Arrays.binarySearch(arr, key));
		
	}

}























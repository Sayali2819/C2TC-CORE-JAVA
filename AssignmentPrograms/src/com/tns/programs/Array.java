//To find the intersection of two arrays
package com.tns.programs;

import java.util.HashSet;

public class Array {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 8};
		
		int arr2[] = {5, 4, 7, 8, 0};
		
		printIntersection(arr1, arr2);
		
		}

	private static void printIntersection(int[] arr1, int[] arr2) {
		System.out.println("Intersecting elements are: ");
		
		HashSet<Integer> hs = new HashSet<>();
		
		//loop for iterating first array
		for(int i=0; i<arr1.length; i++) 
		{
			hs.add(arr1[i]);
		}
		
		//loop for iterating second array
		for(int i=0; i<arr2.length; i++) 
		{
			if(hs.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
		
	}

}

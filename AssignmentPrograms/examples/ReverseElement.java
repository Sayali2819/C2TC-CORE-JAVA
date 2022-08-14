//To reverse elements of array 
package com.tns.examples;

import java.util.Scanner;

public class ReverseElement {

	public static void main(String[] args) {
		int[] arr = {10,90,45,67,56};
		int low = 0;
		int high = arr.length-1;
		int temp;
		
		while(low<high) {
			 temp = arr[low];
			 arr[low]=arr[high];
			 arr[high]=temp;
			 low++;
			 high--;
		}
		
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}

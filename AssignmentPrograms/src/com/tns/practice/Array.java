//To Check if two Arrays are Equal or not
package com.tns.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a[] = {20, 45, 56, 66};
		int b[] = {45, 33, 19, 30};
		
		boolean result = Arrays.equals(a, b);
		if(result == true) {
			System.out.println("Two Arrays are Equal");
		}
		else {
			System.out.println("Two Arrays are Not  Equal");
		}
		
	}

}

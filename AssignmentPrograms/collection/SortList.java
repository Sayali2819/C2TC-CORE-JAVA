//Write a program to sort given list
package com.tns.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Riya", "Meera", "Sonia", "Aditi", "Priya");
		System.out.println(names);
		
		
		Collections.sort(names);
		System.out.println("Sorted List is: "+ names);
		
		

	}

}

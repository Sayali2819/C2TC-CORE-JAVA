//Write a program to get number of elements in hash set
package com.tns.collection;

import java.util.HashSet;

public class GetSize {

	public static void main(String[] args) {
		HashSet<Integer> age = new HashSet<Integer>(); 
		age.add(24);
		age.add(56);
		age.add(10);
		age.add(78);
		age.add(89);
		age.add(10);
		
		System.out.println(age);
		System.out.println("Size of HashSet is: " +age.size());

	}

}

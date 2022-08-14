//To find the number of occurrences of character in string
package com.tns.examples;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = sc.nextLine();
		int initialLength = string.length();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Character to find the occurence: ");
		String str = sc1.nextLine();
		string=string.replace(str, "");
		int finalLength = string.length();
		
		System.out.println("Total Number of Occurences of Character: "+str+" "+"is"+" "+(initialLength-finalLength));

	}

}

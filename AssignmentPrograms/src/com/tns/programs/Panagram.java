//To check String is Panagram 
package com.tns.programs;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Check if it is a Panagram: ");
		String s = sc.nextLine();
		System.out.println((isPanagram(s.toLowerCase())));
	}

	private static String isPanagram(String s) {
		if(s.length()<26) {
			return "The String Length is less than 26";
		}
		else 
		{
			for(char ch='a'; ch<='z'; ch++) {
				if(s.indexOf(ch)<0) {
				return "It is not Panagram!";
				}
			}
		}
		return "It is Panagram!";
	}
}

package com.tns.programs;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the marks of English:");
		int english = s.nextInt();
		
		System.out.print("Enter the marks of Mathematics:");
		int mathematics = s.nextInt();
		
		System.out.print("Enter the marks of Physics:");
		int physics = s.nextInt();
		
		System.out.print("Enter the marks of Chemistry:");
		int chemistry = s.nextInt();
		
		System.out.print("Enter the marks of Biology:");
		int biology = s.nextInt();
		
		float percentage = (english + mathematics + physics + chemistry + biology)/5;
		
		System.out.print("Percentage: " + percentage);
	}

}

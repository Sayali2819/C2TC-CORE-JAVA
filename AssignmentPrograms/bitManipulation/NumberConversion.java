package com.tns.bitManipulation;

//Convert decimalToBinary and binaryToDecimal
import java.util.Scanner;

public class NumberConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		String a = Integer.toBinaryString(n);
		System.out.printf("Binary of %d is: ", n);
		System.out.println(a);
		
		System.out.println("Enter the number in binary:");
		String m = sc.next();
		
		int d = Integer.parseInt(m, 2);
		System.out.printf("Decimal of number is: "+d);

	}

}

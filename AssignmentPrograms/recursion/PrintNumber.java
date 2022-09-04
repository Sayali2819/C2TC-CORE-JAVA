package com.tns.recursion;

public class PrintNumber {
	public static void printNum(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		printNum(n-1);
	}
	
	public static void printN(int m) {
		if(m == 6) {
			return;
		}
		System.out.println(m);
		printN(m+1);
	}
	public static void main(String[] args) {
		printNum(5);
		printN(0);
		
		
	}

}

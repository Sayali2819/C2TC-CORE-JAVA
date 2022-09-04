package com.tns.recursion;

public class CalculatePower {
public static int calcPower(int x, int n) {
		
		if(n==0) {  //base case 1
			return 1;
		}
		
		if(x==0) {  //base case 2
			return 0;
		}
		if(n % 2 == 0) {   // n is even
			return calcPower(x, n/2) * calcPower(x, n/2);
		}
		else {            // n  is odd
			return calcPower(x, n/2) * calcPower(x, n/2) * x;
		}
		
}
	
	public static void main(String[] args) {
		int x = 2, n = 5;
		System.out.println(calcPower(x,n));
	}

}

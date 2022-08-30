//Find Sublist in a List
package com.tns.exp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExpFourth {

	public static void main(String[] args) {
		try {
			
			List<Integer> list = Arrays.asList(23, 56, 90, 17, 89, 35, 100);
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the start index of sublist:");
			int n = sc.nextInt();
			
			System.out.println("Enter the end index of sublist:");
			int m = sc.nextInt();
			
			List<Integer> list1 = list.subList(n, m);
			System.out.println("Sublist is "+list1);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		
		catch(Exception e){
			System.out.println(e);
		}

	}

}

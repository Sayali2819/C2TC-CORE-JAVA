//To print elements at even position
package com.tns.examples;

public class EvenPosition {

	public static void main(String[] args) {
		int arr[] = new int[] {24, 67, 45, 90, 32, 78, 55, 39};
		for(int i=2; i<arr.length; i=i+2)
		{
			System.out.println("index:" +i +" "+"value:" + arr[i]);
			
		}
	}

}

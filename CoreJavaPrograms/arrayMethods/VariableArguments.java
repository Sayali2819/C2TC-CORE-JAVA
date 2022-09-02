package com.tns.arrayMethods;

public class VariableArguments {
	static int sum(int...arr)
	{
		int result = 0;
		for(int a : arr)
		{
			result += a;
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("Addition of two numbers: "+sum(10, 20));
		
		System.out.println("Addition of four numbers: "+sum(10, 20, 10, 20));
		
		System.out.println("Addition of six numbers: "+sum(20, 50, 10, 30, 60, 10));

	}

}

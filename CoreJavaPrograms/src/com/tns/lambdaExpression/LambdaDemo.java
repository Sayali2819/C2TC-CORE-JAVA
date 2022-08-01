package com.tns.lambdaExpression;

interface Anonymous
{
	void show();
}

public class LambdaDemo {

	public static void main(String[] args) {
		Anonymous l=() -> 
		{
			System.out.println("Lambda Demo for simplification");
		};
		l.show();

	}

}

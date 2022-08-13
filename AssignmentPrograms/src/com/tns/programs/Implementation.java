package com.tns.programs;

import java.util.Stack;

public class Implementation {
	int array[ ]= new int[6];
	int top = 0;
	
	//pushing the element 
	private boolean push(int x) {
		top++;
		array[top]=x;
		System.out.println("Element pushed in to stack "+x);
		return true;
	}
	
	private int pop() {
		int x=array[top--];
		System.out.println("Element popped from stack "+x);
		return x;
	}
	
	private int peek() {
		return array[top];
	}

	public static void main(String[] args) {
		Implementation stack = new Implementation();
		stack.push(10);
		stack.push(30);
		stack.push(15);
		stack.push(45);
		stack.push(88);
		
		stack.pop();
		
		stack.peek();
		
	}

}

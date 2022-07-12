package com.tc.assg;


public class MultipleInheritanceFirst implements First,Second {
	

	public static void main(String[] args) {
		MultipleInheritanceFirst obj = new MultipleInheritanceFirst();
		obj.text1();
		obj.text2();
		obj.text3();
		obj.text4();

	}

	@Override
	public void text3() {
		System.out.println("Have a nice day");
		
	}

	@Override
	public void text4() {
		System.out.println("Good wishes");
		
	}

	@Override
	public void text1() {
		System.out.println("Hello");
	}

	@Override
	public void text2() {
		System.out.println("Good Morning!");
		
	}

}

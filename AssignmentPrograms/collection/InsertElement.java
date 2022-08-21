//Write a Program to insert an element into array list at the first position
package com.tns.collection;

import java.util.ArrayList;
import java.util.List;

public class InsertElement {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		System.out.println(colors);
		
		colors.add(0, "Pink");
		System.out.println(colors);

	}

}

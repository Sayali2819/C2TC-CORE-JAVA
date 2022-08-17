package com.tns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorThird {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(90);
		numbers.add(36);
		numbers.add(67);
		numbers.add(79);
		
		Iterator<Integer> it = numbers.iterator();		
		
		while(it.hasNext())
		{
			Integer i = it.next();
			if(i>50)
			{
				it.remove();
			}
		}
		System.out.print(numbers + " ");

	}

}

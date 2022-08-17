package com.tns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSecond {

	public static void main(String[] args) {
		ArrayList<Integer> books = new ArrayList<Integer>();
		books.add(12);
		books.add(89);
		books.add(45);
		books.add(30);
		books.add(90);
		
		Iterator<Integer> it = books.iterator();
		
		//Loop through a Collection
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}

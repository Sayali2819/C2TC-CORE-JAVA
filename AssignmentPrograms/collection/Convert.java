//Convert HashSet to TreeSet
package com.tns.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Convert {

	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		list.add("White");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		list.add("Pink");
		list.add("Black");
		System.out.println(list);
		
		
		System.out.println("HashSet converted to TreeSet:");
		TreeSet<String> new_list = new TreeSet<String>(list);
		for(String element : list) {
			System.out.println(element);
		}
		

	}

}


//Check whether a map contains key-value mappings(empty) or not
package com.tns.collection;

import java.util.HashMap;

public class Mapping {

	public static void main(String[] args) {
		HashMap<Integer, String> list = new HashMap<Integer, String>();
		list.put(1, "Riya");
		list.put(2, "Sonia");
		list.put(3, "Meera");
		list.put(4, "Siya");
		list.put(5, "Teena");
		
		boolean result = list.isEmpty();
		System.out.println("Is hash map Empty: "+result);
		
		list.clear();             
		result = list.isEmpty();   
		System.out.println("Is hash map Empty: "+result);
		

	}

}

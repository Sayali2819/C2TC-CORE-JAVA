package com.tns.hashing;

import java.util.Hashtable;
import java.util.Iterator;

public class HashingFirst {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(1, "Arnika");
		table.put(2, "Meera");
		table.put(3, "Riya");
		table.put(4, "Tina");
		table.put(5, "Siya");
//		table.put(6, null);   -> will give run time error
		table.put(3, "Sara");

		
		System.out.println(table);
		System.out.println(table.get(3));
		
		table.remove(4);
		System.out.println(table);
		
		Iterator<Integer> it = table.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = table.get(key);
			System.out.println("Key: "+key+ " Value: "+value);
			
		}
		
	}

}

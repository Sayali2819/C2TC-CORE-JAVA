package com.tns.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashS {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
		hset.add("Italy");
		hset.add("Cuba");
		hset.add("Russia");
		hset.add("Bali");
		hset.add(null);
		System.out.println(hset);
		
		System.out.println("Size of Set is "+hset.size());
		
		hset.remove("Cuba");
		System.out.println(hset);
		
		System.out.println("Is Indonesia present? "+hset.contains("Indonesia"));
		
		System.out.println("Iterate Over set:");
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}

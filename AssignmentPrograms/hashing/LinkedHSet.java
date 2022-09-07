package com.tns.hashing;

import java.util.LinkedHashSet;

public class LinkedHSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		lset.add("AAA");
		lset.add("BBB");
		lset.add(null);
		lset.add("CCC");
		lset.add("DDD");
	
		
		System.out.println("LinkedHashSet content: "+lset);
		
		System.out.println("Size of LinkedHashSet: "+lset.size());
		
		System.out.println("Check if CCC is present "+lset.contains("CCC"));
		
		System.out.println("Remove BBB "+lset.remove("BBB"));
		
		System.out.println(lset);

	}

}

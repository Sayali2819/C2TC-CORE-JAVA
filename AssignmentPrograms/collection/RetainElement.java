//Compare two sets and retain elements which are same
package com.tns.collection;

import java.util.HashSet;

public class RetainElement {

	public static void main(String[] args) {
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(10);
		hashSet1.add(56);
		hashSet1.add(78);
		hashSet1.add(19);
		hashSet1.add(35);
		hashSet1.add(64);
		System.out.println("HashSet1 is: "+hashSet1);
		
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(89);
		hashSet2.add(10);
		hashSet2.add(58);
		hashSet2.add(30);
		hashSet2.add(78);
		System.out.println("HashSet2 is: "+hashSet2);
		
		System.out.println("Same Elements are:");
		hashSet1.retainAll(hashSet2);
		System.out.println(hashSet1);
	}

}

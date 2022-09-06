package com.tns.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(34);
		set.add(90);
		set.add(56);
		set.add(34);
		set.add(10);
		set.add(5);
		set.add(2);
		
		System.out.println(set);
		System.out.println("Size of set is "+set.size());
		if(set.contains(56)) {
			System.out.println("Set contains element 56");
		}
		if(!set.contains(11)){
			System.out.println("Set does not contain element 11");
		}
		
		set.remove(90);
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

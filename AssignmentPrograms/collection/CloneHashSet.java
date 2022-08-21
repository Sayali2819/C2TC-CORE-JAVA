//Clone HashSet to another HashSet
package com.tns.collection;

import java.util.Arrays;
import java.util.HashSet;

public class CloneHashSet {

	public static void main(String[] args) {
		HashSet<String> subjects = new HashSet<String>();
		subjects.add("Mechanics");
		subjects.add("CCN");
		subjects.add("Mobile Communication");
		subjects.add("Wireless Networks");
		subjects.add("Satellite Communication");
		System.out.println(subjects);
		
		HashSet<String> new_list = new HashSet<String>();
		new_list = (HashSet<String>) subjects.clone();
		System.out.println("Cloned list is: "+ "\n"+new_list);
	}

}

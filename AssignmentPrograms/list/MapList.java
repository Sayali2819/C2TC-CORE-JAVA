//converting hashmap to list
package com.tns.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapList {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "India");
		map.put(102, "China");
		map.put(103, "Japan");
		map.put(104, "Finland");
		map.put(105, "Indonesia");
		
		System.out.println("HashMap:");
		System.out.println(map);
		
		List<Integer> key = new ArrayList(map.keySet());
		List<String> value = new ArrayList(map.values());
		System.out.println("HashMap Converted to List:");
		System.out.println("Key list: "+key);
		System.out.println("Values list: "+value);
		
		
		

	}

}

package com.tns.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 120);
		map.put("China", 200);
		map.put("US", 150);
		
		System.out.println(map);
		
		map.put("China", 350);
		System.out.println(map);
		
	if(map.containsKey("China")) {
		System.out.println("Key is Present in HashMap");
	}
	else {
		System.out.println("Key is Not Present in HashMap");
	}
		
	System.out.println(map.get("US"));
	System.out.println(map.get("Indonesia"));
	
//	for(Map.Entry<String, Integer> e: map.entrySet()) {
//		System.out.println(e.getKey());
//		System.out.println(e.getValue());
//		System.out.println(" ");
//	}
	
	//Another way to iterate hashmap
	Set<String> keys = map.keySet();
	for(String key : keys) {
		System.out.println(key+" "+map.get(key));
	}
	
	map.remove("China");
	System.out.println(map);
	
 }

}

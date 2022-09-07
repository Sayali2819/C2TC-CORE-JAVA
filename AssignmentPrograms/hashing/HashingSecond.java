package com.tns.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingSecond {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("John", 30000);
		map.put("Fradrick", 20000);
		map.put("Mack", 25000);
		map.put("Amy", 27000);
		
		System.out.println(map);
		
		System.out.println("Size of map is "+map.size());
		
		map.remove("Fradrick");
		System.out.println(map);
		
		if(map.containsKey("Mack")) {
			Integer val = map.get("Mack");
			System.out.println("Value for key Mack " + val);
		}
		else {
			System.out.println("Absent");
		}
		
		map.put("Amy", 35000);
		System.out.println(map);
		
		for(Map.Entry<String, Integer> en : map.entrySet() ) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
			System.out.println();
		}
		
		
	}

}

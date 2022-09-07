package com.tns.hashing;

import java.util.LinkedHashMap;

public class LinkedHMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
		map1.put("Oman", "Muscat");
		map1.put("India", "Delhi");
		map1.put("Russia", "Moscow");
		map1.put("Japan", "Tokyo");
		map1.put(null, "Mumbai");
		map1.put(null, "Canberra");
		map1.put("China", null);
		map1.put(null, null);
		System.out.println(map1);
		
		System.out.println("Size of map is "+map1.size());
		
		System.out.println("value for Key Oman is "+map1.get("Oman"));
		
		System.out.println("Does map contains key India? "+map1.containsKey("India"));
		
		System.out.println("Deleting element Japan" + map1.remove("Japan"));
		
		System.out.println("Mapped LinkedHashMap : "+map1);
		
		
	}

}

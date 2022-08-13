//To find Longest Substring from String
package com.tns.programs;

import java.util.HashSet;

public class Substring {

	public static void main(String[] args) {
		String str = "abcdab";
		longest(str);
	}

	private static void longest(String str) {
		System.out.println("The Longest Substring is");
		
		HashSet<Character> ch = new HashSet<>();
		String longestTillNow = "";
		String longestOverAll = "";
		
		for(int i=0; i<str.length(); i++) {
			char c =str.charAt(i); //extract each character from string
			if(ch.contains(c)) {
				longestTillNow ="";
				ch.clear();
			}
			ch.add(c);
			longestTillNow += c;
	
			
			if(longestTillNow.length()>longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
		}
		System.out.println(longestOverAll);
	}

}

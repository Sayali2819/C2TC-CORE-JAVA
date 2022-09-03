//Operations on LinkedList using Collection Framework
package com.tns.list;

import java.util.LinkedList;

public class LinkedListSecond {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addLast("this");
		list.add("list");
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println("Nodes of LinkedList are: ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +"->");
		}
		System.out.println("null");

		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		
	}

}

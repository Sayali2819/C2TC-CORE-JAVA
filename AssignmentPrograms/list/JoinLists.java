package com.tns.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tns.array.ArraySecond;

public class JoinLists {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(50);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(67);
		list1.add(34);
		list.add(89);
		
		List<Integer> joinedList = Stream.concat(list.stream(), list1.stream()).collect(Collectors.toList());
		
		System.out.println("Joined List:"+joinedList);
		
		
	}

}

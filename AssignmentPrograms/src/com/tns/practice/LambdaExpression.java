package com.tns.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpression {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP Laptop", 38000));
		list.add(new Product(3, "Dell Laptop", 50000));
		list.add(new Product(2, "Apple Laptop", 90000));
		
		System.out.println("Sort on the basis of name:");
		
		Collections.sort(list, (p1,p2)-> {
			return p1.name.compareTo(p2.name);
		});
		for(Product p: list) {
			System.out.println(p.id+" " + p.name+" "+p.price);
		}

	}

}

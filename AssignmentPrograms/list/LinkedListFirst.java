//Operations on LinkedList without using CollectionFramework
package com.tns.list;

public class LinkedListFirst {
	//create head
	Node head;
	private int size;  //To track size
	
	
	public LinkedListFirst() {
		size = 0; 
	}

	//Node
	class Node{
		String data;
		Node next;
	
		public Node(String data) {
			this.data = data;
			this.next = null;  
			size++; 
			
		}	
	}
	
	//addFirst
	public void addfirst(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {     
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//addLast
	public void addlast(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {   
			head = newNode;
			return;
		}
		
		
		Node currNode = head;
		while(currNode.next != null) {   
			currNode = currNode.next;
		}																																
	  
		currNode.next = newNode;
	}
	
	//To print
	public void printList() {
		
		if(head == null) {
			System.out.println("List is Empty");
		}
		
		Node currNode = head;
		while(currNode != null) {  
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	//delete First
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		size--;
		head = head.next; 
	}

	//delete Last
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		size--;
		if(head.next == null) {  
			head = null;
			return;
		} 
		
		Node secondLast = head;
		Node lastNode = head.next;  
		while(lastNode.next != null) {
			lastNode = lastNode.next; 
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		
		LinkedListFirst list = new LinkedListFirst(); 
		list.addfirst("Hello");
		list.addfirst("World");
		list.printList();
		
		list.addlast("List");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
		list.addfirst("Harry");
		System.out.println(list.getSize());
	
	}

}

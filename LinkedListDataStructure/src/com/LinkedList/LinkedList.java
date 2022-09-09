package com.LinkedList;

public class LinkedList {
		
	public void simpleLinkedList() {
		Node node1 = new Node(56);
		Node node2 = new Node(30);
		Node node3 = new Node(70);
		
		node1.setNext(node2);
		node2.setNext(node3);
		
		System.out.println(node1.data);
		System.out.println(node2.data);
		System.out.println(node3.data);
	
	}

}

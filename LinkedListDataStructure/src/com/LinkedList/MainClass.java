package com.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to linked list");
		
		Node node1 = new Node(70);
		Node node2 = new Node(30);
		Node node3 = new Node(56);
		
		LinkedList list = new LinkedList();
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.print();
	}
}

package com.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to linked list");
		
		Node node1 = new Node(56);
		Node node2 = new Node(30);
		Node node3 = new Node(70);
		
		LinkedList list = new LinkedList();
		list.append(node1);
		list.append(node2);
		list.append(node3);
		list.print();
		System.out.println("---------------");
		list.pop();
		list.print();
	}
}

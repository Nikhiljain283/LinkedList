package com.LinkedList;

public class LinkedList {
	Node head;
	Node tail;

	Node node = new Node();

	public void simpleLinkedList() {
		Node node1 = new Node(56);
		Node node2 = new Node(30);
		Node node3 = new Node(70);

		node1.setNext(node2);
		node2.setNext(node3);

	}

	public void add(Node node) {
		if (this.tail == null) {
			this.tail = node;
		}
		if (this.head == null) {
			this.head = node;
		} else {
			Node tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(Node node) {
		if(this.head == null) {
			this.head = node;
		}
		if(this.tail == null) {
			this.tail = node;
		}
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}
	
	public void insert(Node node, Node newNode) {
		Node tempNode = node.getNext();
		node.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public void print() {
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
	}
}

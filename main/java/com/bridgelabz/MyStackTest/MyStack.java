package com.bridgelabz.MyStackTest;

public class MyStack<K> {
	
	private MyLinkedList myLinkedList;
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(INode<K> myNode) {
		myLinkedList.add(myNode);
		
	}
	public void printStack() {
		myLinkedList.printNodes();
		
	}
	public INode peak() {
		return myLinkedList.head;
		
	}

}
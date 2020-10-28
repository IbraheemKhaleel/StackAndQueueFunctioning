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
	public INode pop() {
		return myLinkedList.pop();
	}
	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}
	public void enqueu(INode myNode) {
		myLinkedList.append(myNode);
		
	}
}

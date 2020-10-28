package com.bridgelabz.MyStackTest;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void givenValues_WhenAddedToQueue_ShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode =  new MyNode<>(70);
		MyStack myQueue = new MyStack();
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		myQueue.printStack();
		INode peak = myQueue.peak();
		Assert.assertEquals(myFirstNode, peak);
	}
	@Test
	public void givenValues_WhenDequeueFromQueue_ShouldRemoveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode =  new MyNode<>(70);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);	
		INode pop = null ;
		while(!myStack.isEmpty()) {
			pop = myStack.pop();
		}
		Assert.assertEquals(myFirstNode, pop);	
	}

}

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
		INode peak = myQueue.peak();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, peak);
	}
	@Test
	public void givenValues_WhenDeQueue_ShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode =  new MyNode<>(70);
		MyStack myQueue = new MyStack();
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		INode dequeue = myQueue.dequeue();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, dequeue);
	}
}

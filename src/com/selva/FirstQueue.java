package com.selva;

public class FirstQueue implements QueueIntf {

	@Override
	public void enqueue(int data) {
		// TODO Auto-generated method stub
		System.out.println("FirstQueue::enqueue called with data " + data);
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		System.out.println("FirstQueue::dequeue called");
		return 0;
	}

}

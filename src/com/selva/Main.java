package com.selva;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		FirstQueue q = new FirstQueue(); // BAD Practice. Creating (using new operator) instances ourselves.
//		QueueIntf q = new BetterQueue();
		
		QueueIntf q = Framework.getInstance();
		q.enqueue(100);
		q.dequeue();
	}

}

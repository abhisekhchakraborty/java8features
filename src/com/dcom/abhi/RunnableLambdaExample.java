package com.dcom.abhi;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		Thread myLambdaThread = new Thread(() -> System.out.println("This is lambda runnable"));
		myLambdaThread.run();
	}
}

// This is possible because Runnable is an interface with only one abstract method.

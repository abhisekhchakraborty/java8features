package com.dcom.abhi;

public class RunnableInnerClassExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable Method");
			}
			
		});
		myThread.run();
	}

}

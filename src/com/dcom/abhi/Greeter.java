package com.dcom.abhi;

public class Greeter {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
//		Greeting helloWorldGreeting = new HelloWorldGreeting();
//		Greeting lambdaGreeting = () -> System.out.println("Hello World!");
		Greeting innerClassGreeting = new Greeting(){
			public void greet() {
				System.out.println("Hello world from inner class");
			}
		};
		
		
		
//		innerClassGreeting.greet();
		
		
		
		greeter.perform(() -> System.out.println("Hello World!"));
		greeter.perform(innerClassGreeting);
	}
	
	public void perform(Greeting greeting) {
		greeting.greet();
	}

}

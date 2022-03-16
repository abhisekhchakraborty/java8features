package com.dcom.abhi;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("hello lambda"));
	}
	
	interface StringLengthLambda{
		int getLength(String str);
	}
}

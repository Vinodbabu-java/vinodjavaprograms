package com.javalab;

public class Sample {
	static int a=10;
	long mobileno=6304952117l;
	
	void hi() {
		System.out.println("instance method");
		System.out.println(mobileno);
		hello();
	}
	
	static  void hello() {
		System.out.println("static method");
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.hi();
//		hello();
		 
	}

}

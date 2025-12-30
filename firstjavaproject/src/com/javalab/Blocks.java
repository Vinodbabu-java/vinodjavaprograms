package com.javalab;

public class Blocks {

	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
 static {
	 System.out.println("static block");
 }
		public static void main(String[] args) {
			Blocks b = new Blocks();
		

	}

}

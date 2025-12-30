package com.javaintro;

public class Ashok{
	static  Ashok vk = new Ashok();
	static int a;
	{

		System.out.println("instance block");
	}
	

	static {
		System.out.println("static block");
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		a=10;
        System.out.println("main method started");
        System.out.println(a);
  
	}	

}

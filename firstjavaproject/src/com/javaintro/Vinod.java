package com.javaintro;

public class Vinod {
	
	
	static {
		System.out.println("instance block");
	}
Vinod vk = new Vinod();
	
	{
		System.out.println("vk.hello block");
	}
	

	public static void main(String[] args) {
      System.out.println("main method started");
      System.out.println("main method ended");
	}

}


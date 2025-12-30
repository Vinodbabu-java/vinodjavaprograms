package com.javaintro;

public class Vinod1 {
	
	public static void main(String[] args) {
        System.out.println("main method started");
	    Vinod1 t1 = new Vinod1();
	    Vinod1 t2 = new Vinod1();
	    System.out.println("main method ended");
}

	static{
		System.out.println("STATIC block1");
	}
	static{
		System.out.println("static block2");
	}
	{
		System.out.println("inSTANCE BLOCK1");
	}

}

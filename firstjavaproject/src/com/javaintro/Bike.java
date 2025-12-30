package com.javaintro;

public class Bike {
	
   int age=10;
   String Name="vk";
  @Override
	protected void finalize() throws Throwable {
	  System.out.println("finalize method");
  }
   
   
   void Hello(){
	   Bike c3 = new Bike();
	   System.out.println("@@@@@@@@@@@@" +c3);
   }

	public static void main(String[] args) {
		System.out.println("main method started");
	Bike c =new Bike();
	Bike c1= new Bike();
	Bike c2 = new Bike();
	c.Hello();
	System.out.println(c.age);
	System.out.println(c.Name);
	System.out.println(c);
	System.out.println(c1);
	System.out.println(c2);
		System.out.println("main method ended");
		c1=c;
		System.out.println(c1);
		c=null;
		System.out.println(c);
		c1=null;
		System.out.println(c1);
		c1=c2;
		System.out.println(c1);
		System.gc();
	
	

	}

}

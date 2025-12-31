package com.javalab;

import java.util.Scanner;

public class TestMethodsDemo1 {
	
	void getName(String Firstname,String lastname) {
		System.out.println("****** student details*******");
		System.out.println("your name:"+Firstname+""+lastname);
	}
	
	void getheight(float height) {
		System.out.println("My height:"+height);
	}
	
	void getweight(double weight) {
		System.out.println("MY weight:"+weight);
	}
	
	void getstudentdetails(boolean studentdetails) {
		
		System.out.println("student details:"+studentdetails);
		
	}
	 void getgender(char gender) {
		 System.out.println("Enter gender:"+gender);
	 }


	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestMethodsDemo1 t1 = new TestMethodsDemo1();
		
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter First name ");
		 String fn=sc.next();
		 
		 System.out.println("Enter last name");
		 String lastname=sc.next();
		 
		 System.out.println("Enter the height");
		 float height=sc.nextFloat();
		 
		 System.out.println("Enter the weight ");
		 double weight=sc.nextDouble();
		 
		 System.out.println("Enter the gender");
		  char gender=sc.next().charAt(0);
		 
		 System.out.println("student details");
		 boolean details=sc.nextBoolean();
		 
     	 t1.getName(fn, lastname);
     	 t1.getheight(height);
     	 t1.getweight(weight);
     	 t1.getstudentdetails(details);
     	 System.out.println("main method ended");
		 		 
		 
	}


}

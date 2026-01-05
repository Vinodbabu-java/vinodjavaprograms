package com.javaexampleprograms;
import java.util.Scanner;

public class Addition {
	
	 
	static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter first number:");
       int x=sc.nextInt();
       
       System.out.println("Enter second number:");
       int y=sc.nextInt();
       
       int result=add(x,y);
    		   System.out.println("sum:"+result);
    		   System.out.println("main method ended");
    		   sc.close();
	}

}

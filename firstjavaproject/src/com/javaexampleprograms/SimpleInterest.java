package com.javaexampleprograms;
import java.util.Scanner;

public class SimpleInterest {
	
	static double calculateSI(double p,double r,double t) {
		return (p*r*t)/100;
	}

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the priciple interest:");
		 double pre=sc.nextDouble();
		 
		 System.out.println("Enter the rate:");
		 double rate=sc.nextDouble();
		 
		 System.out.println("Enter the time :");
		 double time=sc.nextDouble();
		 
		 double si= calculateSI(pre,rate,time);
		 System.out.println("simple interest:"+si);
		 sc.close();
		 
		 System.out.println("main method ended");
		 
	}

}

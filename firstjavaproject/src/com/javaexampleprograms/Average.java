package com.javaexampleprograms;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 
		 Average avg= new Average();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter three numbers");
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 int z=sc.nextInt();
		 
	double max=avg.average(x, y, z);
	System.out.println(max);
		 sc.close();
		
	}
 
	 double average(double a,double b,double c) {
		double average=(a+b+c)/3.0;
		return average;
	}
}

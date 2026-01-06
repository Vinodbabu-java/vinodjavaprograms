package com.javalab;
import java.util.Scanner;
//with return type and with arguments;
//area of cricle is =PI*r*R
//area of triangle is =0.5*height*base
//area of square is =side*side
//area of rectangle is =lenght*breadth

public class Methods1 {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 
		 Methods1 m1 = new Methods1();
		 Scanner sc = new Scanner(System.in);
		 
		 //area of cricle;
		 System.out.println("enter radius :");
		 double radius=sc.nextDouble();
		 System.out.println("area of cricle:");
		 System.out.println(radius);

		 
		 //area of triangle;
		 System.out.println("enter base:");
		 double base=sc.nextDouble();
		System.out.println("area of triangle:");
		 System.out.println(base);
		 
		 System.out.println("enter height:");
		 double height=sc.nextDouble();
		 System.out.println(height);
		 
		 //area of Square;
		 System.out.println("enter side:");
		 double side=sc.nextDouble();
		 System.out.println(side);
		 
		 //area of rectangle;
		 System.out.println("enter lenght:");
		 double lenght=sc.nextDouble();
		 System.out.println(lenght);
		 
		 System.out.println("enter breadth:");
		 double breadth=sc.nextDouble();
		 System.out.println(breadth);
		 
		 m1.getareaofcricle(radius);
		 m1.getareaoftriangle(base,height);
		 m1.getareaofsquare(side);
		 m1.getareaofrectangle(lenght,breadth);
		   
		 System.out.println("main method ended");
		 sc.close();
		 
	}
    
	double getareaofcricle(double r) {
		double areac=Math.PI * r * r;
	
		return areac;
	}
	double getareaoftriangle(double b,double h) {
		double areatri=0.5 *b * h;

		return areatri;
	}
	
	double getareaofsquare(double s) {
		double areasqu=s * s;
		System.out.println("area of square:");
		return areasqu;	
	}
	
	double getareaofrectangle(double l,double b) {
		double arearec= l * b;
		System.out.println("area of rectangle:");
		return arearec;
	}
}
	


	
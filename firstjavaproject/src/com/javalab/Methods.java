package com.javalab;
import java.util.Scanner;
public class Methods {
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Methods m1 = new Methods();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();

		 int adds=m1.getadd( a, b);
		 System.out.println("addition data:"+adds);
	   int subs=	m1.getsubtract(adds,a);
	   System.out.println("subtraction data:"+subs);
		 int mulps=m1.getmultiplication(adds,a);
		 System.out.println("multiplication Data:"+mulps);
		sc.close();
		
			
		}
		
	
	int getadd(int a,int b) {
		System.out.println("addition data");
//		int c= a+10;
//		int d=c+20;
		int addition=a+b;
//		System.out.println(addition);
		return addition;
	}
	
	int getsubtract(int a, int b) {
		System.out.println("subtraction data");
		int subtract=a-b;
//		System.out.println(subtract);
		return subtract;
	}
  
	int getmultiplication(int a,int b) {
		System.out.println("multiplication data");
		int multiply=a*b;
//		System.out.println(multiply);
		return  multiply;
	}

}

package com.javalab;

import java.util.Scanner;

public class StudentResults {
//	int totalmarks;
//	int total;
//	int english;
//	int telugu;
//	int maths;
//	int science;int social;
//	
//	void totalmarks(int english,int telugu,int maths,int science,int social) {
//	
//	total=english+telugu+maths+science+social;
//		System.out.println("instance method 1");
//		System.out.println(total);	
//		
//		
//	}
//	
//	void averagemarks(int english,int telugu,int maths,int science,int social) {
//		System.out.println("instance mathod 2");
//		totalmarks(english,telugu,maths,science,social);
//		int avg=total/5;
//		System.out.println("average marks:"+avg);
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main method started");
//		
//		 StudentResults SR = new  StudentResults();
//		 
//		 Scanner sc= new Scanner(System.in);
//		 System.out.println("Enter english marks:");
//			int english=sc.nextInt();
//			System.out.println("english marks:"+english);
//			
//			 System.out.println("Enter telugu marks:");
//			int telugu=sc.nextInt();
//			System.out.println("telugu marks:"+telugu);
//			
//			 System.out.println("Enter maths marks:");
//			int maths=sc.nextInt();
//			System.out.println("maths marks:"+maths);
//			
//			 System.out.println("Enter science marks:");
//			int science=sc.nextInt();
//			System.out.println("science marks:"+science);
//			
//			 System.out.println("Enter social marks:");
//			int social =sc.nextInt();
//			System.out.println("social marks:"+social);
//			
//			SR.totalmarks(english,telugu,maths,science,social);
//			System.out.println(SR.totalmarks);
//			
//			SR.averagemarks(english,telugu,maths,science,social);
//		System.out.println("main method ended");
//		 

	float  totalmarks;
	float total;
	float english;
	float telugu;
    float maths;
    float science;
	float social; 
	
	void totalmarks(float english,float telugu,float maths,float science,float social) {
		total=english+telugu+maths+science+social;
		System.out.println("instance method 1");
		System.out.println("total marks:"+total);
	}
	
	void avergamarks(float english,float telugu,float maths,float science,float social) {
		float avg=total/5;
		System.out.println("averagemarks:"+avg);
	}
	
	public static void main(String[]args) {
		System.out.println("main method started");
		
		StudentResults SR=new StudentResults();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter english marks");
		float english=sc.nextFloat();
		System.out.println("English marks:"+english);
		
		System.out.println("enter telugu marks");
		float telugu=sc.nextFloat();
		System.out.println("telugu marks:"+telugu);
		
		System.out.println("enter maths marks");
		float maths=sc.nextFloat();
		System.out.println("maths marks:"+english);
		
		System.out.println("enter science marks");
		float science=sc.nextFloat();
		System.out.println("science marks:"+english);
		
		System.out.println("enter social marks");
		float social=sc.nextFloat();
		System.out.println("English marks:"+english);
		
		SR.totalmarks(english,telugu,maths,science,social);
		SR.avergamarks(english,telugu,maths,science,social);	
		System.out.println("main method ended");
		
				
	}

}

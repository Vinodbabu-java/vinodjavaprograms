package com.fundamentals.constuctor;

public class Student {
	int sid;
	int age;
	String name;
	
	
	//no arg constructor
	Student(){
		
		System.out.println("no arg constructor called!!!");
		sid =101;
		age=23;
		name="ashok";
	}
	
	Student(int sid,String name,int age){
		
		System.out.println("parameterized constructor!!");
		this.sid=sid;
		this.name=name;
		this.age=age;
	}
	

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");
		
		//the below object is created with help of default constructor
		Student s1 = new Student();
		
          s1.display();
		
		Student s2 = new Student(104,"vinod",22);
//	   s2. sid =104;
//	   s2. name="vinod";
//	    s2.age=23;
//		s2.show();
	    s2.display();
		
		Student s3 = new Student();
		s3.sid=105;
		s3.name="venky";
		s3.age=25;
		s3.display();
		
		
		System.out.println("main method ended");
	
	}
	
	void display() {
		System.out.println(sid);
		System.out.println(age);
		System.out.println(name);
	}
	
	void show() {
		sid=104;
		name="vinod";
		age=24;
	}


}

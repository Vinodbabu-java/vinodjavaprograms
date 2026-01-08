package com.Copyconstructor;

public class Student {
	
	int rollno;
	String name;
	String branch;
	
	Student(int rollno,String name){
		System.out.println("two arg constructor called!!!!!!");
		this.rollno=rollno;
		this.name=name;
	}
	
	Student(Student s,String branch){
	
//		this(s.rollno,s.name);
		System.out.println("three comstructor called !!!!!!!11");
		this.rollno=s.rollno;
		this.name=s.name;
		this.branch=branch;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s1 = new Student(102,"vinod");
		Student s2 = new Student(s1,"MCA");
		
		s1.display();
		s2.display();
		 
	}
	void display(){
		System.out.println("**********************************");
		System.out.println("Student rollno:"+rollno);
		System.out.println("Student name:"+name);
		System.out.println("Student branch:"+branch);
		System.out.println("***********************************");
		
	}

}

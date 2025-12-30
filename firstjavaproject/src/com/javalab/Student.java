package com.javalab;

public class Student {
	static int id=0;
	static  String v="vinod";
	long mobileNo;

	{
		
		System.out.println("insatnce block");
		System.out.println(id++);
		Student s3 = new Student();
	
	}
	
	static {
		System.out.println(v);
		System.out.println("static block");
	}
////	void display() {
//		
//		System.out.println("instance method called");
//		System.out.println("id number:" + id);
//		System.out.println("Studentname:" + name);
//		System.out.println("mobile:" + mobileNo);
//	}

//	static void hi() {
//		Student s2 = new Student();
//		s2.id = 22;
//		s2.name = "vamsi";
//		s2.mobileNo = 6304952117L;
//		s2.display();

//	}

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.id = 20;
//		s1.name = "bhanu";
//		s1.mobileNo = 6304952117L;

//		hi();
//		s1.display();

	}

}

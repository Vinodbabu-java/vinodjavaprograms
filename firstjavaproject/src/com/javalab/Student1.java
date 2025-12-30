package com.javalab;

public class Student1 {
	int rollno;
	String name;
	float marks;
	boolean ispassed;

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		Student1 s4 = new Student1();
		
		if (s1.ispassed==true)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		s1.rollno=20;
		s1.name="vb";
		s1.marks=80;
		s1.ispassed=true;
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s1.ispassed);
		
		s2.rollno=20;
		s2.name="ak";
		s2.marks=50;
		s2.ispassed=false;
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println(s2.ispassed);
		
		
		 
	}

}

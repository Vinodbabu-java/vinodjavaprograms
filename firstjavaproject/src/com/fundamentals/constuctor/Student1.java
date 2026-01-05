package com.fundamentals.constuctor;

public class Student1 {

	int id;
	String name;

	Student1(int i, String n) {

		System.out.println("parameterized comstructor********");
		 id=i;
		 name=n;
	}

	void show() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Student1 s1 = new Student1(101, "vinod");
		s1.show();
		Student1 s2 = new Student1(102, "bobby");
		s2.show();
		System.out.println("main method ended");

	}

}

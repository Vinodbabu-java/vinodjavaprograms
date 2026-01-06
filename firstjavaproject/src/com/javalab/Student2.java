package com.javalab;

public class Student2  {
    int roll;
    String name;
    int marks;

    Student2() {
        this(1);
        System.out.println("No-arg constructor");
    }

    Student2(int roll) {
        this(roll, "Ashok");
        System.out.println("One parameter constructor");
    }

    Student2(int roll, String name) {
        this(roll, name, 80);
        System.out.println("Two parameter constructor");
    }

    Student2(int roll, String name, int marks) {
        System.out.println("Three parameter constructor");
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
    	   System.out.println("main method started");
        Student2 s = new Student2();
        
        Student2 s1 = new Student2(102,"vinod",90);
        s.display();
        s1.display();
    }
}




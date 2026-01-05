package com.fundamentals.constuctor;

public class Employee {
	int empid;
	String name;
	double salary;
	
	Employee(int id,String n,double sal){
		
		System.out.println("parameterized constructor");
		this.empid=id;
		this.name=n;
		this.salary=sal;
	}
	
	void display() {
		System.out.println(empid+" "+name+" "+salary);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Employee  e1 = new Employee(102,"vinod",10000.0);
		
		e1.display();

		Employee  e2 = new Employee(103,"sai",1000000.0);
		
		
		e2.display();
       System.out.println("main method ended");
	}

}

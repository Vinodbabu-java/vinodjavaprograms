package com.fundamentals.constuctor;

public class Employee1 {
	int id;
	String name;
	int salary;
	int age;
	
	Employee1(){
		System.out.println("no arg constructor");	
	}
	
	Employee1(int id){
		this();
		System.out.println("first constructor");
		this.id=id;
	}
	
	Employee1( int id,String name){
		this(id);
		System.out.println("second constructor!!!!!");
		this.name=name;	
	}
	
	Employee1(int id,String name,int salary){
		this( id, name);
		System.out.println("third constructor");
		this.salary=salary;
	}
	
	Employee1(int id,String name,int salary,int age){
		this(id,name,salary);
		System.out.println("fourth constructor!!!!!!");
		this.age=age;
	}
	

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Employee1 e1 = new Employee1();
		 
		 Employee1 e2 = new Employee1(102);
		 
		 Employee1 e3 = new Employee1(102,"ashok");
		 
		 Employee1 e4 = new Employee1(102,"ashok",600000);
		 
		 Employee1 e = new Employee1(102,"ashok",600000,22);
		 e1.show();
		 e2.show();
		 e3.show();
		 e4.show();
		 e.show();
	}
	void show() {
		System.out.println("employee id:"+id);
		System.out.println("employee name:"+name);
		System.out.println("employee salary:"+salary);
		System.out.println("employee age:"+age);
		System.out.println("*********************************");
	}

}

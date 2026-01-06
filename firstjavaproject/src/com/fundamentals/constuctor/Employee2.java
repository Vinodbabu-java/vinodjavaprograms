package com.fundamentals.constuctor;

public class Employee2 {
	int id;
	String name;	
	int salary;
	
	 Employee2(){
		 System.out.println("no arg constructor");
	 }
	 
	 Employee2(int id,String name,int salary){
		 System.out.println("parameterized constructor!!!!!!");
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("parameterized constructor");
		 Employee2 e1 = new  Employee2();
		 e1.show();

	}
	
	void show() {
		System.out.println(id+" "+name+" "+salary);
	}

}

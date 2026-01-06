package com.fundamentals.constuctor;

public class Bank {
	int accno;
	String name;	
	double balance;
	
	Bank(){
		this(1234);
		System.out.println("no arg constructor");
	}
	
	Bank(int accno){
		this(accno,"vinod");
		System.out.println("1 parameterized constructor");
	}
	
	Bank(int accno,String name){
		this(accno,name,7000000);
		System.out.println("2 parameterized constructor");
	}
	
	Bank(int accno,String name,double balance){
		
		System.out.println("parameterized constructor called!!!!");
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	
	void display() {
		System.out.println("account number:"+accno);
		System.out.println("account name:"+name);
		System.out.println("account balance:"+balance);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Bank b1 = new  Bank();
		b1.display();		
 
	}
	

}

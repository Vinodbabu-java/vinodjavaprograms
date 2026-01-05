package com.javaexampleprograms;

import java.util.Scanner;

 class BankAccount {

	String accountholdername;
	long accountnumber;
	String password;
	double balance;

	Scanner sc = new Scanner(System.in);

	void creataccount(String acname, long acnumber, String passwords, double bal) {

		accountholdername = acname;
		accountnumber = acnumber;
		password = passwords;
		balance = bal;
		
		
		
	
		display();

	}
	
	void display() {
		System.out.println(accountholdername);
		System.out.println(accountnumber);
		System.out.println(password);
		System.out.println(balance);
	}

	// instance method
	double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	// instance method
	double withdraw(double amount) {
		balance = balance - amount;
		return amount;
	}

	// static method
	static void balanceEnquiry(BankAccount bk) {

		System.out.println("balance : "+bk.balance);

	}

}

public class Bank {

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		
		System.out.println("Enter account holder name:");
		String accountholdername = sc.next();

		System.out.println("Enter account number:");
		long accountnumber = sc.nextLong();
		

		System.out.println("Enter password:");
		String password = sc.next();
		

		System.out.println("Enter balance:");
		double balance = sc.nextDouble();
		
		b1.creataccount(accountholdername,accountnumber,password,balance);
		
		
	  

		System.out.println("Enter amount:");
		double amount = sc.nextDouble();
		double vinod = b1.deposit(amount);
		System.out.println(vinod);

		System.out.println("Enter amount:");
		double withdraw = sc.nextDouble();
		double babu = b1.withdraw(withdraw);
		System.out.println(babu);
		  BankAccount.balanceEnquiry(b1);
		
		sc.close();

	}
}

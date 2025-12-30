package com.javaintro;

public class Bank {
 static Integer accountNumber=12031;
 String HolderName;
 Double balance;
 void display() {
	 System.out.println("accountNumber:"+accountNumber);
	 System.out.println("HolderName:"+HolderName);
		System.out.println("balance:"+balance);
	 
 }
	public static void main(String[] args) {
		Bank.accountNumber=12032;
		System.out.println(accountNumber);
		Bank B1 = new Bank();
		B1.HolderName="mohan";
		B1.balance=10000.0;
		B1.display();
		
		accountNumber++;
		B1.accountNumber=accountNumber;
		Bank B2= new Bank();
		B2.HolderName="kiran";
		B2.balance=20000.0;
		B2.display();
		
		
				}

}

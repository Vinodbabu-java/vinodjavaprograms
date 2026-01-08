package com.Copyconstructor;

public class Bankaccount {
	
	 String Bankname;
	int accno;
	double balance;
	
	Bankaccount(String bankname){
		System.out.println("1 arg constructor");
		this.Bankname=bankname;
	}
	
	Bankaccount(int accno,double balance){
		
		System.out.println("two arg constructor");
		this.accno=accno;
		this.balance=balance;
	}	
	
	Bankaccount(Bankaccount a){
		this(a.accno,a.balance);
	}
	

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Bankaccount b = new Bankaccount("SBI");
		 
		 Bankaccount b1 = new Bankaccount(123,2000000.0);
		 Bankaccount b2 = new Bankaccount(b1);
		 b1.show();
		 b2.show();
		 b.show();
	
	}
     void show() {
    	 System.out.println("bank accno:"+accno);
    	 System.out.println("bank balance:"+balance);
    	 System.out.println("Bankname:"+Bankname);

     }
}

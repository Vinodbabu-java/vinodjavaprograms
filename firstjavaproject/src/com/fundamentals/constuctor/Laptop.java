package com.fundamentals.constuctor;

public class Laptop {
	
	int price;
	String brand;
	
	Laptop(){
		System.out.println("no arg constructor");
		price=70000;
		brand="hp";
	}
	
	Laptop(int p,String bra){
		System.out.println("parameterized constructor");
		price=p;
		brand=bra;
		
	}

	public static void main(String[] args) {
		
		System.out.println("main method strated");
		
		Laptop lap = new Laptop();
		
		System.out.println(lap.price);
		System.out.println(lap.brand);
		
		Laptop lap1 = new Laptop(800000,"dell");
		System.out.println(lap1.price);
		System.out.println(lap1.brand);
		
		System.out.println("main method ended");
		
		 
	}

}

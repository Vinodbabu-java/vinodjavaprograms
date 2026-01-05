package com.fundamentals.constuctor;

public class Car {
	
	String brand;
	int price;
	
	Car(){
		System.out.println("no arg comnstructor");
		
		brand="tata";
		price=200000;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started!!!!");
		
		Car c1= new Car(); 
		c1.show();
		Car c2= new Car();
		c2.brand="honda";
		c2.price=3000000;
		c2.show();
		
		Car c3= new Car();
		c3.brand="hero";
		c3.price=400000;
		c3.show();
	
	}
 void show() {
		System.out.println(brand);
		System.out.println(price);
 }
}

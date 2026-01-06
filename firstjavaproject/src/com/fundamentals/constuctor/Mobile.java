package com.fundamentals.constuctor;

public class Mobile {
	
	String brand;	
	String model;
	int price;
	
	 Mobile(){
		 this("brand");
		 System.out.println("no arg constructor");
	 }
    
	 Mobile(String brand){
		 this("samsung","s23");
		 System.out.println(" 1 parameterized constructor"); 
	 }
	 
	 Mobile(String brand,String model){
		 this(brand,model,70000);
		 System.out.println("2 constructor");
	 }
	 
	 Mobile(String brand,String model,int price){
		 System.out.println("3 constructor");
		 this.brand=brand;
		 this.model=model;
		 this.price=price;
	 }
	 
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		 Mobile m1 = new  Mobile();
		 
	
		 
		 m1.display();
		
		 
	}
	
	void display() {
		System.out.println("Mobile brand:"+brand);
		System.out.println("Mobile model:"+model);
		System.out.println("Mobile price:"+price);
		System.out.println("###############################");
		
	}

}

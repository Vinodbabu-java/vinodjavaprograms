package com.fundamentals.constuctor;

public class Crickter {
	
	String name;
	String country;
	int age;
	int jerseyno;
	
	Crickter(String name){
		System.out.println("1 arg constructor");
		this.name=name;
	}
	
	Crickter(String name,String country){
		System.out.println("2 arg constructor");
		this.country=country;
	}

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Crickter c1 = new Crickter("Virat");
		 
		 Crickter c2 = new Crickter("india");
		 c1.show();
		 c2.show();
	}
	void show() {
		System.out.println("Crickter name:"+name);
		System.out.println("Crickter country:"+country);
	}

}

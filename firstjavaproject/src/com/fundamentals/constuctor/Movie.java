package com.fundamentals.constuctor;

public class Movie {
	
	String moviename;
	String 	hero;
	String heroine;
	double budget;
	
	Movie(){
		System.out.println("no arg constructor");
	}
	
	Movie(String moviename){
		this();
		System.out.println("one argu constructor");
		this.moviename=moviename;
	}
	
	Movie(String moviename, String hero){
		this(moviename);
		System.out.println("two arg constructor");
		this.hero=hero;
	}
	
	Movie(String moviename,String hero,String heroine){
		this(moviename,hero);
		System.out.println("three arg constructor");
			this.heroine=heroine;
	}
	Movie(String moviename,String hero,String heroine,double budget){
		this(moviename,hero,heroine);
		System.out.println("four arg constructor");
		this.budget=budget;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Movie m1 = new Movie("billa","praba","anu",70000000000.0);
		m1.display();
	}
	
	void display() {
		System.out.println("movie name:"+moviename);
		System.out.println("hero name:"+hero);
		System.out.println("heroine name:"+heroine);
		System.out.println("movie budget:"+budget);
	}

}

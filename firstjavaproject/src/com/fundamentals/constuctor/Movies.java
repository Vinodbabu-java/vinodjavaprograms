package com.fundamentals.constuctor;

public class Movies {
	String moviename;
	String 	hero;
	String heroine;
	double budget;
	
	Movies(){
		this("billa");
		System.out.println("no arg constructor");
	}
	
	Movies(String moviename){
		this(moviename,"praba");
		System.out.println("one arg constructor");
	}
	
	Movies(String moviename,String hero){
		this(moviename,hero,"anu");
		System.out.println("two arg constructor");	
	}
	
	Movies(String moviename,String hero,String heroine){
		this(moviename,hero,heroine,80000000.0);
		System.out.println("three arg constructor");
	}
	
	Movies(String moviename,String hero,String heroine,double budget){
		System.out.println("four arg constructor");
		this.moviename=moviename;
		this.hero=hero;
		this.heroine=heroine;
		this.budget=budget;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Movies m1 = new Movies();
		m1.show();
		

	}
	void show() {
		System.out.println("movie name:"+moviename);
		System.out.println("hero name:"+hero);
		System.out.println("heroine name:"+heroine);
		System.out.println("movie budget:"+budget);
	}

}

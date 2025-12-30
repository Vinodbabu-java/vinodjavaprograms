package com.javaintro;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("method started");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("method ended");
       
	}

}

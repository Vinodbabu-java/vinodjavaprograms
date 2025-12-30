package com.javaintro;

public class Cricketer {
	//Static
	static int jerseyNo;
	static String cricketerName;
	
	//Instance
	int countryId;
	String countryName;

	public static void main(String[] args) {
		System.out.println("welcome to indian cricket team");
		Cricketer AB = new Cricketer();

		AB.countryId = 90;
		AB.countryName = "India";

		jerseyNo = 17;
		cricketerName = "ABD";

		System.out.println(jerseyNo);
		System.out.println(cricketerName);

		System.out.println(AB.countryId);
		System.out.println(AB.countryName);
	}

}

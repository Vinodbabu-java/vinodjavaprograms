package com.javaintro;

public class Cricket {
	
	static int countryId;
	static String countryName;
	
	int jerseyNo;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("welcome to cricket team");
		
		Cricket vinod = new Cricket();	
		countryId=90;
		countryName="india";
		
		vinod.jerseyNo=18;
		vinod.cricketerName="virat";
		System.out.println(countryId);
		System.out.println(countryName);
		
			
		System.out.println(vinod.jerseyNo);
		System.out.println(vinod.cricketerName);

	}

}

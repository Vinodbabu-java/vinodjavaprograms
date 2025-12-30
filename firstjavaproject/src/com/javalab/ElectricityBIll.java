package com.javalab;

public class ElectricityBIll {
	 
	 int units=150;
	 double rateperunit=6;
	 static double gst=5;
	 static double gstamount;
	 double totalbill;
	 
	public  static double calculategst (double  basicbill) {
		gstamount=basicbill*(gst/100);
		System.out.println(gstamount);
		return gstamount;
		
	}
	
	void generatebill() {
		double basicbill =units*rateperunit;
		calculategst (basicbill);
		double totalbill=basicbill+gstamount;
		System.out.println("basic bill:"+basicbill);
		System.out.println("totalbill:"+totalbill);
		
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		ElectricityBIll E1= new ElectricityBIll();
		E1.generatebill();
		System.out.println("main method ended");
		
		

	}

}

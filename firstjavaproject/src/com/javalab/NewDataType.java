package com.javalab;

public class NewDataType {
	
	byte b=(byte) 128;//expilcit type coverting big values to small data types 
	byte b1=(byte) 327656;
	
	short s=(short) 32769;//expilcit type converting
	short s1=(short) 40567;
	
	int i=(int)2147483649l;
	int i1=(int)-2147483649l;

	public static void main(String[] args) {
		System.out.println("main method started");
		 NewDataType n1= new  NewDataType();
		 
		 System.out.println("byte:"+n1.b);
		 System.out.println("byte:"+n1.b1);
		 
		 System.out.println("short:"+n1.s);
		 System.out.println("short:"+n1.s1);
		 
		 System.out.println("integer:"+n1.i);
		 System.out.println("integer:"+n1.i1);
		 
		
		 
	}

}

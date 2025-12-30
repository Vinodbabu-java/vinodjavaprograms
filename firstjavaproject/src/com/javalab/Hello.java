package com.javalab;

public class Hello {
	
	byte b=(byte) 130;
	short s=(short) 32775;
	
	int i =(int) 2147483648l;//type int out od range
	long l =92233720;//type int  out of range 
	
	float f = 3482796425809847f;
	double d = 467562984047534789.;// int type out of range
	
	char c =65;
	boolean  boo= true;
	
	
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.b);
		System.out.println(h.s);
		System.out.println(h.f);
		System.out.println(h.d);
		System.out.println(h.c);
		System.out.println(h.boo);
		 
	}

}

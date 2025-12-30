package com.javalab;

import java.math.BigInteger;
import java.math.BigDecimal;

class Animal{
	 
	
}


public class TestDataDemo1 {
   
	String name="vinod";
	 
	Integer i=100;
//	Integer i=Integer.valueOf(100);//coverting primitive data object type  into wapper object  data type is called Auto-boxing. 
//	Integer i1=i;
//	Integer i1=i.intValue();//coverting wapper object data type to primitive data type
	
    Long l=25313638746L;

	
	BigInteger bi= new BigInteger("749236726528725797289247") ;
	BigInteger b2= new BigInteger("7429623409830475547");
	BigDecimal bd=new BigDecimal("4287574527856249572987892");
	
 
    
	public static void main(String[] args) {
		System.out.println("main method started");
		TestDataDemo1 t1  = new TestDataDemo1();
		System.out.println(t1.name);
		
		System.out.println(t1.i);
		
//		System.out.println(t1.i1);
		
		System.out.println(t1.l);
		
		System.out.println(t1.bi);
		
		System.out.println(t1.bd);
		
		System.out.println("addition:"+t1.bi.add(t1.bi));
		System.out.println("subtraction:"+t1.bi.subtract(t1.bi));
		System.out.println("multiplication:"+t1.bi.multiply(t1.bi));
		System.out.println("division:"+t1.bi.divide(t1.bi));
		System.out.println("mod:"+t1.bi.mod(t1.bi));
		System.out.println("and :"+t1.bi.and(t1.b2));
		System.out.println("add"+t1.bi.add(t1.b2));
		
		
		System.out.println("addition:"+t1.bd.add(t1.bd));
		System.out.println("subtraction:"+t1.bd.subtract(t1.bd));
		System.out.println("multiplication:"+t1.bd.multiply(t1.bd));
		System.out.println("division:"+t1.bd.divide(t1.bd));
//		System.out.println("mod:"+t1.bd.mod(t1.bd));
		
		

		
		
		 
	}

}

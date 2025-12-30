package com.javalab;

import java.math.BigDecimal;

public class Employee {
		
	BigDecimal salary = new BigDecimal("5000");
	BigDecimal DA = new BigDecimal("0.08");
	BigDecimal PF = new BigDecimal("0.03");//3%=3/100;
	BigDecimal gst = new BigDecimal("0.07");
	BigDecimal net;
	BigDecimal annualsalary= new BigDecimal("12");
	
	{
		DA = salary.multiply(DA);
		System.out.println(DA);
		
		
		PF = salary.multiply(PF);
		System.out.println(PF);
		
		gst = salary.multiply(gst);
		System.out.println(gst);
		
		net=salary.add(DA).subtract(PF).subtract(gst);
		System.out.println(net);
		
		annualsalary = annualsalary.multiply(net);
		System.out.println(annualsalary);
		
	}

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Employee e1= new Employee();
		 
	}

}

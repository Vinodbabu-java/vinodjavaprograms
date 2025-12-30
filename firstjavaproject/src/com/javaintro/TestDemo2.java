package com.javaintro;

public class TestDemo2 {

	public static void main(String[] args) {
         System.out.println("main method started");
      method1();
     
	}
	
	static void method1(){
		System.out.println("method1 called");
		method3();
		TestDemo2 t1 = new TestDemo2();
		t1.method2();
	
	
	
	}
	
	void method2() {
		System.out.println("method2 called");
		method4();
		
	}
	
	static void method3() {
		System.out.println("method3 called");
		
	
	}
	
	void method4() {
		System.out.println("method4 called");
	}
}

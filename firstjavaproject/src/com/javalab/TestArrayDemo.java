package com.javalab;

public class TestArrayDemo {
//  int []age= new int [5];//1 method
	static int i;
//
	public static void main(String[] args) {
		System.out.println("main method started");
//		
//   	int []age= new int [5];//2 method
//		
//		int[]age= {12,2,3,4,5};
//		for(int i=0;i<5;i++) {
// 		System.out.println(age[i]);
//			
//			System.out.println("elements index:"+i+":"+age[i]);
//		}
//			
//			
//			
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
	int []age= new int [5];
	//insert 14 to third element;
	 age[1]=14;
	//insert 67 to fourth element;
	age[2]=34;
	//insert 10 to first element;
	age[0]=10;
	
	for(int i=0;i<5;i--);{

	System.out.println("element index" +i+ ":"+age[i]);

	}
	
	

}	 
	}



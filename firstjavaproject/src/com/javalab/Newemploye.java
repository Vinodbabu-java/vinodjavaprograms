package com.javalab;

public class Newemploye {
	int salary=10000;
	float travelallowance=0.12f;//   12/100
    float internetallowance=0.03f;
    float insurancededuction=0.02f;
    int vk;
    int SM;
	 int MB;
	 int netsalary;
    
     static void vinod(Newemploye EM) {
    	 
//    		Newemploye EM= new Newemploye();
    		EM.vk=(int)(EM.salary*EM.travelallowance); 
    		System.out.println("salary * travelallowance");
    		System.out.println("travelallowance:"+EM.vk);
    		
    		
    		EM.SM=(int)(EM.salary*EM.internetallowance);
    		System.out.println("salary * internetallowance");
    		System.out.println("internetallowance:"+EM.SM);
    		
    		
    		EM.MB=(int)(EM.salary+EM.vk+EM.SM);
    		System.out.println("total allowanaces");
    		System.out.println(EM.MB); 
     }
     void hii() {
//  	 Newemploye EM1= new Newemploye();
//    	 System.out.println("instance method");
//    	 EM1.salary=(int)(EM1.salary*EM1. insurancededuction);
//    	 System.out.println(EM1.salary);
    	 System.out.println("instance method 1");
    	 salary=(int)(salary*insurancededuction);
    	 System.out.println(salary);
     }
     
     void hello() {
//    	 vinod(this);
//    	 hii();
    	 System.out.println("instance method 2");
    	 netsalary=(int)(MB-salary);
    	 System.out.println("NETSALARY:"+netsalary);
    	 
     }
     
	public static void main(String[] args) {
		System.out.println("main method started");
		Newemploye EM1= new Newemploye();
		vinod(EM1);
		EM1.hii();
		EM1.hello();
		
		
		 
	}

}

package com.javalab;

public class Demo {
 static int num;
      String name;
      
      static {
    	  System.out.println("static block");
    	  System.out.println(num);
    	  
      }
      
      {
    	  System.out.println("instance method");
    	  System.out.println(name);
      }
       static void hello() {
    	   
    	   System.out.println("static method");
    	   int num=123;
    	   System.out.println("number:"+num);
       }
       
       void hi() {
    	   System.out.println("instance method");
    	   String name="vk";
    	   System.out.println("name:"+name);
       }
 
	public static void main(String[] args) {
		Demo d = new Demo();
		d.hello();
		d.hi();
				
	}

}

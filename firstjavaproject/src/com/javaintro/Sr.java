package com.javaintro;

class Sr {
	Sr s;
 int sno=10;
 String sname="vinod";
 
 @Override
	protected void finalize() throws Throwable {
	 System.out.println("finalize called");

 }
 
 void hello() {
	 Sr s3= new Sr();
	 System.out.println("##########"+s3);
 }
 
	public static void main(String[] args) {
		System.out.println("welcome ");
		System.out.println("bye");
		Sr s1 =new Sr();
		s1.hello();
		Sr s2 =new Sr();
		s1.s=s2;
		s2.s=s1;
		System.out.println(s2);
		System.out.println(s1.sno);
		System.out.println(s2.sname);
//		s1=null;
		System.out.println(s1);
//		s2=null;
		System.out.println(s2);
		s1=s2;
		System.out.println(s1);
		new Sr();
		System.gc();

	}

}

package com.fundamentals.constuctor;

public class Students {
	
	int id;
	String name;
	String branch;
	int marks;
	
	Students(int id,String name,String branch,int marks){
		System.out.println("parameterized constructor!!!!!");
		 this.id=id;
		 this.name=name;
		 this.branch=branch;
		 this.marks=marks;
	}
	

	

	public static void main(String[] args) {
		System.out.println("main method started");
		Students s1 = new Students(102,"vinod","MCA",80);
		 s1.display();
		 
		 Students s2 = new Students(103,"jassi","CSE",90);
		 s2.display();
		 
		 Students s3 = new Students(104,"siva","CSE",95);
		 s3.display();
		 
	}

	void display() {
		System.out.println("student id:"+id);
		System.out.println("student name:"+name);
		System.out.println("student branch:"+branch);
		System.out.println("student marks:"+marks);
	}
}

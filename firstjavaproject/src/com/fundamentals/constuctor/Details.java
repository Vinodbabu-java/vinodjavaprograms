package com.fundamentals.constuctor;


class Book{
	 String bookname;
	 int price;
	 
	 Book(String bookname,int bookprice){
		 System.out.println("two arg constructor");
		 
	 }
	
}
 class Author extends Book{
	 
	 String authorname;
	 String authorplace;
	 
	 Author(String authorname,String authorplace, String bookname,int price){
		 super("bookname",price);
		 System.out.println("four arg constructor");
		 this.bookname=bookname;
		 this.price=price;
		 this.authorname=authorname;
		 this.authorplace=authorplace;
	 }

		void show(){
			System.out.println("Book name:"+bookname);
			System.out.println("Book price:"+price);
			System.out.println("author name:"+authorname);
			System.out.println("author place:"+authorplace);
			
		}
	 
 }



public class Details {
	

	public static void main(String[] args) {
		
		System.out.println("main method strated");
		System.out.println("Details of the book:");
		System.out.println("*****************************************");
		Author a1 = new Author("vinod","ongole","sad story",500);
		 a1.show();
		 System.out.println("main method ended");
	}

}

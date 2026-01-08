package com.fundamentals.constuctor;

class Outer {
    int x = 10;

    class Inner {
        Inner() {
            System.out.println("Inner class constructor called");
        }

        void display() {
            System.out.println("Value of x: " + x);
        }
    }

    public static void main(String[] args) {
    	System.out.println("main method started");
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();//
        in.display();
    }
}


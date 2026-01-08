package com.fundamentals.constuctor;

	class Parent {

	    Parent() {
	        System.out.println("Parent constructor");
	    }

	    static class Child extends Parent {

	        Child() {
	            super();
	            System.out.println("Child constructor");
	        }
	    }

	    public static void main(String[] args) {
	        Parent.Child c = new Parent.Child();
	    }
	}




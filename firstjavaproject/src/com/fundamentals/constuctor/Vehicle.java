package com.fundamentals.constuctor;

class Vehicle {

    Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }

    class Bike extends Vehicle {

        Bike() {
            super("type");
            System.out.println("Bike constructor");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("General");
        Vehicle.Bike b = v.new Bike();//
        v.show();
    }
    void show() {
    	System.out.println("vehicle type:"+"type");
    }
}


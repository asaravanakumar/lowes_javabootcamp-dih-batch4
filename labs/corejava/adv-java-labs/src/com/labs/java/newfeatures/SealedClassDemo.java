package com.labs.java.newfeatures;

public class SealedClassDemo {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
    }
}

abstract sealed class Vehicle permits Car, Truck {
    public void start() {
        System.out.println("Starting");
    }
    public void stop() {
        System.out.println("Stopping");
    }
}

// IS-A Relationship
class Person  {

    // HAS-A Relationship
    Vehicle car = new Car();

}

// Sealed
// Non-Sealed
// Final
non-sealed class Car extends Vehicle {
    public void start() {
        System.out.println("Car Starting");
    }
    public void stop() {
        System.out.println("Car Stopping");
    }
}

final class Truck extends Vehicle {

}

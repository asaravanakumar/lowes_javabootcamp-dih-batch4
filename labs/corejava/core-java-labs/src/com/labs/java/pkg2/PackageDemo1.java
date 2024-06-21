package com.labs.java.pkg2;

public class PackageDemo1 {
    public static int COUNTER = 100;

    private String message;

    public PackageDemo1(String message) {
        this.message = message;
        incrementCounter();
    }

    public static void incrementCounter() {
        COUNTER++;
    }

    public static void decrementCounter() {
        COUNTER--;
    }

    public static void printCounter() {
        System.out.println(COUNTER);
    }

    public void printGreetings() {
        System.out.println(this.message);
    }



}

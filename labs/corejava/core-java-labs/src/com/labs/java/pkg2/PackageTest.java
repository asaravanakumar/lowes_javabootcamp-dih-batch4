package com.labs.java.pkg2;


public class PackageTest {
    public static void main(String[] args) {
        PackageDemo obj = new PackageDemo("Welcome to Package Demo!!!");
        obj.printGreetings();

        PackageDemo obj2 = new PackageDemo("Welcome to Package Demo!!!");
        obj2.printGreetings();

        PackageDemo.printCounter();
    }
}

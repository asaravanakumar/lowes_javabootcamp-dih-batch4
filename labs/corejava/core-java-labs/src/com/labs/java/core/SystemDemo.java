package com.labs.java.core;

public class SystemDemo {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int sum = 0;
        for(int i=0; i < 10000; i++) {
//            for(int j=0; j < 10000; j++) {
                sum += i;
//            }
        }
        System.out.println(sum);
        long endTime = System.nanoTime();


        System.out.println(System.nanoTime());

        System.out.println("Time Taken: " + (endTime - startTime) + " ms");

    }
}

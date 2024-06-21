package com.labs.java.core;

public class ReversingString {
    // O(1)
    // O(n)
    // O(n2)
    // O(log n) => binary search

    public static void main(String[] args) {
        String greetings = "Welcome to Java Training";
 // O(n + 1 + n) => O(1 + 2n) => O(n)
        char[] chars = greetings.toCharArray(); // O(n)

        System.out.println(chars[0]); // O(1)

        // to reverse string
        for(int i = chars.length - 1; i >= 0; i--) { // O(n)
            System.out.print(chars[i]);
        }
    }
}

package com.labs.java.core;

public class ReversingString {
    public static void main(String[] args) {
        String greetings = "Welcome to Java Training";

        char[] chars = greetings.toCharArray();

        // to reverse string
        for(int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}

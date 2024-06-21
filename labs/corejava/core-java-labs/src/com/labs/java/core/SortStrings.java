package com.labs.java.core;

import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] input = {"Java", "Simple", "ObjectOriented", "Threaded", "Dynamic", "Secure", "Language"};

        for(int i = 0; i < input.length; i++) {
            for(int j = i + 1; j < input.length; j++) {
//                System.out.println(input[i] + " compareTo " + input[j] + " " + input[i].compareTo(input[j]));
                if(input[i].compareTo(input[j]) > 0) {
                    String temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(input));
    }
}

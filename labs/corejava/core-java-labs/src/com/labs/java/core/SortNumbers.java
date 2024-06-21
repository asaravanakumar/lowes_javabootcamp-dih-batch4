package com.labs.java.core;

import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        //INPUT: 30, 50, 20, 10, 50, 40

        int[] input = {30, 50, 20, 10, 50, 40};

        //O(n2)
        for(int i = 0; i < input.length; i++) { // O(n)
            for(int j = i + 1; j < input.length; j++) { // O(n)
                if(input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        //OUTPUT: 10, 20, 30, 40, 50, 60
        System.out.println(Arrays.toString(input));
    }
}

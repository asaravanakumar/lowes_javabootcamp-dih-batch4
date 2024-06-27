package com.labs.java.generic;

import java.util.Arrays;
import java.util.Comparator;

public class GenericSorter {
    public static void main(String[] args) {
        Integer[] nos = {30, 50, 20, 10, 50, 40};
        String[] strs = {"Java", "Simple", "ObjectOriented", "Threaded", "Dynamic", "Secure", "Language"};

        sort(nos);
        sort(strs);
    }

    public static <E extends Comparable> void sort(E[] input) {

        //O(n2)
        for(int i = 0; i < input.length; i++) { // O(n)
            for(int j = i + 1; j < input.length; j++) { // O(n)
                if(input[i].compareTo(input[j]) > 0) {
                    E temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        //OUTPUT: 10, 20, 30, 40, 50, 60
        System.out.println(Arrays.toString(input));
    }


}

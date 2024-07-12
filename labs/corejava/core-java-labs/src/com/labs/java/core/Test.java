package com.labs.java.core;

public class Test {
    public static void main(String[] args){
        try {
            int num = Integer.parseInt("XYZ");
        }  catch (NumberFormatException e) {
            System.out.print("Number format exception");
        } catch (Exception e) {
            System.out.print("Exception ");
        }
    }
}
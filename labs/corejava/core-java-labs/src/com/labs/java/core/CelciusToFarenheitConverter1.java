package com.labs.java.core;

import java.util.Scanner;

public class CelciusToFarenheitConverter1 {
    public static void main(String[] args) {

        // Read input from user
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Celcius: ");

        // Local variable
        double tempInCelcius = in.nextDouble();

//        if(args.length > 0) {
//             tempInCelcius = Integer.parseInt(args[0]);
//        } else {
//            System.out.println("Invalid Argument. Please pass valid temperature value.");
//            return;
//        }

        // celcisus * 9 / 5 + 32
        double tempInFaren = tempInCelcius * 9 / 5 + 32;

        System.out.println(tempInCelcius + " Celcius is equal to " + tempInFaren + " Farenheit");

    }
}

package com.labs.java;

import com.labs.mod1.Calculator;
import com.labs.mod2.TempCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int out = calc.add(100,200);
        System.out.println(out);

        TempCalculator tempCalc = new TempCalculator();
        int out1 = tempCalc.farenheitToCelcius(100);
        System.out.println(out1);

    }
}

package com.labs.java.java8;

public class CalcOOP {
    public int a;
    public int b;

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public static void main(String[] args) {
        CalcOOP calc1 = new CalcOOP();
        calc1.a = 100;
        calc1.b = 200;

        int out1 = calc1.add();
        System.out.println(calc1.a + " + " + calc1.b + " = " + out1);

        calc1.a = 50;
        calc1.b = 20;
        int out2 = calc1.subtract();
        System.out.println(calc1.a + " - " + calc1.b + " = " + out2);

        System.out.println(calc1.a + " + " + calc1.b + " = " + calc1.add());

    }
}

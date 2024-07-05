package com.labs.java.java8;

import java.util.function.BiFunction;

public class CalcFP {


    public int add(int a, int b) {
        return a + b + 10;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int compute(String op, int a , int b) {
        int out = 0;
        switch(op) {
            case "add":
                out = a + b; break;
            case "sub":
                out = a - b; break;
        };
        return out;
    }

    public static int compute(Computable op, int a, int b) {
        return op.compute(a, b);
    }

    public static int compute(BiFunction<Integer,Integer,Integer> op, int a, int b) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
//        CalcFP calc = new CalcFP();
//        int out1 = calc.add(100, 200);
//        System.out.println(out1);
//        System.out.println(calc.subtract(100, 200));
//        System.out.println(calc.subtract(50, 20));

//        int out1 = compute("add", 100, 200);
//        System.out.println(out1);
//
//        int out2 = compute("sub", 100, 200);
//        System.out.println(out2);

//        Computable add = new Computable() {
//            @Override
//            public int compute(int a, int b) {
//                return a + b;
//            }
//        };

        // Lambda Expresssion
//        Computable add = (int a, int b) ->  a + b;

//        Computable sub = new Computable() {
//            @Override
//            public int compute(int a, int b) {
//                return a - b;
//            }
//        };

//        Computable sub = (int a, int b) -> a - b;

//        sub.compute(100, 200);



//        int out1 = compute((int a, int b) ->  a + b, 100, 200);
//        System.out.println(out1);

//        int out2 = compute(sub, 100, 200);
//        System.out.println(out2);



        // Declarative Style
        // Lambda Expression
        // First Class Function
        BiFunction<Integer, Integer, Integer> op = (a, b) -> a + b;

        // Function - takes one argument and returns output - V apply(T)
        // BiFunction - takes two args and retruns output - V apply(T, U)
        // Predicate - takes one arg and returns boolean - boolean test(T)
        // BiPredicate - takes one arg and returns boolean - boolean test(T, U)
        // Consumer - takes one arg and no return - void accept(T)
        // BiConsumer - takes two arg and no return - void accept(T, U)
        // Supplier - takes no arg and returns a value - T get()

        //
//        op.apply(100,200)


//        int out2 = add.apply(300,200);
//        System.out.println(out2);

       int out3 = compute(op, 100, 200);
        System.out.println(out3);
    }


    // Higher Order function
//    private static int compute(BiFunction<Integer, Integer, Integer> add, int a, int b) {
//        return add.apply(a, b);
//    }
}

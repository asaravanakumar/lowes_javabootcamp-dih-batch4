package com.labs.java.core;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DemoClass {

    public static int COUNTER = 0;

    public String greetings;

    // static block
    static{
        System.out.println("Static block called..");
        if(COUNTER == 0)
            COUNTER += 100;
    }

    // instance block
    {
        System.out.println("Instance block called..");
        if(this.greetings == null) {
            this.greetings = "Welcome";
        }
    }

    public DemoClass() {
        System.out.println("Default constructor called..");
    }

    public DemoClass(boolean flag) {
        System.out.println("Overloaded constructor called..");
        // TODO: initialization based on the flag
    }

    public static void main(String[] args) {
        System.out.println(COUNTER);

        DemoClass obj = new DemoClass(false);
        System.out.println(obj.greetings);

        DemoClass obj1 = new DemoClass();
        System.out.println(obj1.greetings);
    }
}

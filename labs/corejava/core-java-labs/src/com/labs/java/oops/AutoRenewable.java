package com.labs.java.oops;

public interface AutoRenewable {


    // Java 8
    default void autoRenew() {
        processAutoRenewal();
    }

    // Java 9
    private void processAutoRenewal() {
        int count = 0;
        System.out.println("Default AutoRenewable implementation");

    }
}

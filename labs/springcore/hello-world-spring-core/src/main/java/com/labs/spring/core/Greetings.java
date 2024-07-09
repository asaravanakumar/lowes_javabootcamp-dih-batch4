package com.labs.spring.core;

// POJO - Plain Old Java Object
public class Greetings {
    private String message;

    public Greetings() {
        System.out.println("Greetings Default Constructor");
    }

    public Greetings(String message) {
        System.out.println("Greetings overloaded Constructor");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

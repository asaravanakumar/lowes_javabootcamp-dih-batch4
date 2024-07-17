package com.labs.sboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Greetings {

    @Value("${greetings.message}")
    private String message;

    public Greetings() {
//        this.message = "Welcome to Spring Boot!!!";
    }

    public Greetings(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

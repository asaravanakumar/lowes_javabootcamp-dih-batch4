package com.labs.scloud;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public ResponseEntity<String> greetings(HttpServletRequest req) {
        String message =  "Welcome to Spring Cloud Service Discovery Demo!!! - " + req.getRequestURL();
        return ResponseEntity.ok(message);
    }
}

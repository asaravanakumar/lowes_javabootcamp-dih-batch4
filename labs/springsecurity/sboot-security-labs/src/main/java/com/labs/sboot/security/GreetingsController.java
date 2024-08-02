package com.labs.sboot.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class GreetingsController {

    @GetMapping(path = {"/","/greetings"})
    public String greetings(HttpServletRequest request, Principal principal) {
        return "Welcome to Spring Security!!! " + request.getSession().getId() + " " + principal;
    }

    @PostMapping(path = "/greetings")
    public String greetingsPost(@RequestBody String greetings) {
        return greetings;
    }

    @GetMapping(path = "csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}

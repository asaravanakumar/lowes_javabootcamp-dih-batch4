package com.labs.spring.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreetingsController {


    // http://localhost:8080/spring-mvc-labs/greetings
    @RequestMapping(path = {"/", "/greetings"}, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    @ResponseBody
    public String greetings( ) {
        String message = "Welcome to Spring REST training!!!";
        return message;
    }
}

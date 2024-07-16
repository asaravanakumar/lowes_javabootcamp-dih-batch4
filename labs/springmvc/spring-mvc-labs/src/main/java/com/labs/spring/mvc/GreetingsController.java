package com.labs.spring.mvc;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingsController {

    // http://localhost:8080/spring-mvc-labs/greetings
    @RequestMapping(path = {"/", "/greetings"}, method = RequestMethod.GET)
    public ModelAndView greetings(ModelAndView modelAndView) {
        String message = "Welcome to Spring MVC training!!!";

        modelAndView.addObject("message", message);
        modelAndView.setViewName("greetings");

        return modelAndView;
    }

//    @RequestMapping(path = "/", method = RequestMethod.GET)
//    public ModelAndView home(ModelAndView modelAndView) {
//        String message = "Welcome to Spring MVC training!!!";
//
//        modelAndView.addObject("message", message);
//        modelAndView.setViewName("greetings");
//
//        return modelAndView;
//    }
}

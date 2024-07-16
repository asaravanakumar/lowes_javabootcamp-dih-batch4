package com.labs.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showRegister() {
        System.out.println("Registration Controller called...");

        return "register";
    }

    @GetMapping("/registeruser")
//    public ModelAndView registerUser(@RequestParam(name="name") String name, @RequestParam String email) {
    public ModelAndView registerUser(@ModelAttribute User user) {

        ModelAndView modelAndView = new ModelAndView();

//        User user = new User();
//        user.setName(name);
//        user.setEmail(email);

//        modelAndView.addObject("name", name);
//        modelAndView.addObject("email", email);

        modelAndView.addObject("user",user);
        modelAndView.setViewName("registerSuccess");

        return modelAndView;
    }
}

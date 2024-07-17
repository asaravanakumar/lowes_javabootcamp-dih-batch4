package com.labs.sboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    private Logger log = LoggerFactory.getLogger(GreetingsController.class);

    @GetMapping(path={"/", "/greetings"})
    public String greetings() {
        log.info("INFO LOG WORKS");
        return "Welcome to Spring Boot!!!";
    }
}

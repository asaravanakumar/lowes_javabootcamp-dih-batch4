package com.labs.scloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("scloud-greetings-service")
public interface GreetingsService {
    @GetMapping("/greetings")
    public ResponseEntity<String> greetings();
}

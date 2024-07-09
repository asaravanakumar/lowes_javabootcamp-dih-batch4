package com.labs.spring.core.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
@Primary
public class PetrolEngine extends Engine {

    @Override
    public String getEngineType() {
        return "Petrol";
    }
}

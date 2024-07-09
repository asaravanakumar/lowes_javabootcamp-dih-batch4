package com.labs.spring.core.jconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class PetrolEngine extends Engine {

    @Override
    public String getEngineType() {
        return "Petrol";
    }
}

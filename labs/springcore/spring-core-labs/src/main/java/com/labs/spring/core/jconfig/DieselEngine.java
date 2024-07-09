package com.labs.spring.core.jconfig;

import org.springframework.stereotype.Component;

public class DieselEngine extends Engine {
    @Override
    public String getEngineType() {
        return "Diesel";
    }

}

package com.labs.spring.core.annotation;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine extends Engine{
    @Override
    public String getEngineType() {
        return "Diesel";
    }

}

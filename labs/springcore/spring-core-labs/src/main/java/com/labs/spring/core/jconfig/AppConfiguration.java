package com.labs.spring.core.jconfig;

import com.labs.spring.core.annotation.DieselEngine;
import com.labs.spring.core.annotation.Engine;
import com.labs.spring.core.annotation.PetrolEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {

    @Bean
    public Car bmw() {
//        return new Car(petrol()); // manual wiring - constructor injection

//        Car bmw = new Car();
//        bmw.setEngine(diesel()); // manual wiring - setter injection
//        return bmw;

        return new Car("White", "XA", "BMW"); // auto wiring - enable the Car class
    }

    @Bean
    @Primary
    public Engine petrol() {
        return new PetrolEngine();
    }

    @Bean
    public Engine diesel() {
        return new DieselEngine();
    }
}

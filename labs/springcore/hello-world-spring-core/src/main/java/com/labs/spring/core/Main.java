package com.labs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Greetings greetings1 = new Greetings("Welcome to Spring!!!");
//
//        Greetings greetings2 = new Greetings();
//        greetings2.setMessage("Thank you!!!");
//
//        System.out.println(greetings1.getMessage());
//        System.out.println(greetings2.getMessage());

        // STEP 1: Create IoC Container
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");

        System.out.println("Beans Count: " + ctx.getBeanDefinitionCount());

        // Prints Bean Names
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);

        // STEP 2: Access the object/bean from the IoC container
        // Dependency Injection
        Greetings greetings1 = ctx.getBean("greetings1", Greetings.class);
        Greetings greetings2 = ctx.getBean("greetings2", Greetings.class);

        System.out.println(greetings1.getMessage());
        System.out.println(greetings2.getMessage());

        ctx.close();
    }
}

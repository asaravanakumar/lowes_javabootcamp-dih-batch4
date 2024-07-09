package com.labs.spring.core.jconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {

	public static void main(String[] args)
	{
		// Instantiate IoC container
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		System.out.println("No of beans: " + context.getBeanDefinitionCount());
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}

		Car bmw = (Car) context.getBean("bmw");

		System.out.println("Manufacturer: " + bmw.getManufacturer());
		System.out.println("Color: " + bmw.getColor()); // Black
		System.out.println("Engine Type: " + bmw.getEngine().getEngineType());

		context.registerShutdownHook();
		
	}
}
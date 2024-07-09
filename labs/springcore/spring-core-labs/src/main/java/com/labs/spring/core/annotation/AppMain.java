package com.labs.spring.core.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args)
	{
//		Car bmw = new Car();
//		bmw.setColor("White");
//		bmw.setManufacturer("BMW");
//		bmw.setModel("XA");
//
//		Engine petrol = new Engine();
//		petrol.setCapacity(2000);
//		petrol.setNoOfCynclinders(4);
//		petrol.setTorque(10);
//
//		Engine electic = new Engine();
//		electic.setCapacity(4000);
//		electic.setNoOfCynclinders(4);
//		electic.setTorque(10);
//
//		bmw.setEngine(electic);
//
//		System.out.println("Manufacturer: " + bmw.getManufacturer());
//		System.out.println("Color: " + bmw.getColor());
//		System.out.println("Capacity: " + bmw.getEngine().getCapacity());
		
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
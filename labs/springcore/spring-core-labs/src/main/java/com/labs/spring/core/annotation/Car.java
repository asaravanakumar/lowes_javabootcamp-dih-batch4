package com.labs.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bmw")
@Scope
@Lazy
@DependsOn
public class Car { //implements InitializingBean, DisposableBean {

	@Value("White")
	private String color;
	@Value("XA")
	private String model;
	@Value("BMW")
	private String manufacturer;

//	@Autowired
//	@Qualifier("diesel")
	private Engine engine;
	
	public Car() {
		System.out.println("Car default constructor called...");
	}

	@Autowired(required = true)
	public Car(@Qualifier("diesel") Engine engine) {
		System.out.println("Car constructor called..");
		this.engine = engine;
	}
	
//	public static Car createInstance(Engine engine) {
//		Car car = new Car(engine);
//		return car;
//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Car setter called..");
		this.engine = engine;
	}
	
//	public void init() {
//		System.out.println("Car Bean Initialized...");
//	}
//	
//	public void destroy() {
//		System.out.println("Car Bean Destroyed...");
//	}
	
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Car Bean Initialized...");		
//	}
//
//	public void destroy() throws Exception {
//		System.out.println("Car Bean Destroyed...");		
//	}
}

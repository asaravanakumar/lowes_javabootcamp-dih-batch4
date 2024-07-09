package com.labs.spring.core.jconfig;

import com.labs.spring.core.annotation.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Car { //implements InitializingBean, DisposableBean {

	private String color;
	private String model;
	private String manufacturer;

	@Autowired
	@Qualifier("diesel")
	private Engine engine;
	
	public Car() {
		System.out.println("Car default constructor called...");
	}

	public Car(String color, String model, String manufacturer) {
		this.color = color;
		this.model = model;
		this.manufacturer = manufacturer;
	}

	//	@Autowired(required = true)
	public Car(Engine engine) {
		System.out.println("Car constructor called..");
		this.engine = engine;
	}

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

}

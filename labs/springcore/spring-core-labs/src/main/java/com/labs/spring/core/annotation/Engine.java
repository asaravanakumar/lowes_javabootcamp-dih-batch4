package com.labs.spring.core.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public abstract class Engine { //implements InitializingBean, DisposableBean {

	public Engine() {
	}

	@Value("2000")
	private int capacity;
	@Value("4")
	private int noOfCynclinders;
	@Value("9")
	private int torque;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNoOfCynclinders() {
		return noOfCynclinders;
	}

	public void setNoOfCynclinders(int noOfCynclinders) {
		this.noOfCynclinders = noOfCynclinders;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public abstract String getEngineType();

	// Factory Method
//	public static Engine getInstance() {
//		System.out.println("Static Factory method called...");
//		if(engine == null) {
//			engine = new Engine();
//		}
//		return engine;
//	}
	
//	public void init() {
//		System.out.println("Engine Bean Initialized...");
//	}
//	
//	public void destroy() {
//		System.out.println("Engine Bean Destroyed...");
//	}	

}

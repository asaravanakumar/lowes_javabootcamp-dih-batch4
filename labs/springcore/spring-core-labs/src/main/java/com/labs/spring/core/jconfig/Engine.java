package com.labs.spring.core.jconfig;

import org.springframework.beans.factory.annotation.Value;

public abstract class Engine { //implements InitializingBean, DisposableBean {

	private int capacity;
	private int noOfCynclinders;
	private int torque;

	public Engine() {
	}

	public Engine(int capacity, int noOfCynclinders, int torque) {
		this.capacity = capacity;
		this.noOfCynclinders = noOfCynclinders;
		this.torque = torque;
	}

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
	
//	public void init() {
//		System.out.println("Engine Bean Initialized...");
//	}
//	
//	public void destroy() {
//		System.out.println("Engine Bean Destroyed...");
//	}	

}

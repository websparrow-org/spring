package org.websparrow.beans;

public class Car {

	private Engine engine; // secondary type
	private String carName; // primitive type

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	// business logic that uses the injected values
	public void carDetails() {
		System.out.println("Car name is: " + carName);
		System.out.println("Enginer number is: " + engine.getEngineNumber());
		System.out.println("Model year is: " + engine.getModelYear());
	}
}

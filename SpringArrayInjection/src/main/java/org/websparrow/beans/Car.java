package org.websparrow.beans;

public class Car {

	// generate setters...
	private String[] carNames; // primitive string array
	private Engine[] engines; // secondary string array

	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}

	// business logic
	public void carDetails() {

		System.out.println("CAR NAME......");
		for (String car : carNames) {
			System.out.println(car);
		}
		System.out.println("\nMODEL YEAR......");
		for (Engine engine : engines) {
			System.out.println(engine.getModelYear());
		}
	}
}

package org.websparrow.beans.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class City {

	private State state;

	@Autowired
	public City(State state) {
		this.state = state;
	}

	public void print() {
		System.out.println("Varanasi is a city in " + state.getStateName() + " state.");
	}
}

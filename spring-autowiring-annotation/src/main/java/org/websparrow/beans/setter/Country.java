package org.websparrow.beans.setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {

	private State state;

	@Autowired
	public void setState(State state) {
		this.state = state;
	}

	public void display() {
		System.out.println("State name is: " + state.getStateName());
	}
}

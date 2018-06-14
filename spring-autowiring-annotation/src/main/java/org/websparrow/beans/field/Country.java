package org.websparrow.beans.field;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {

	@Autowired
	private State state;

	public void display() {
		System.out.println("State name is: " + state.getStateName());
	}
}

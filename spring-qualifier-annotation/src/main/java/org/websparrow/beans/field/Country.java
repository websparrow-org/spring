package org.websparrow.beans.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Country {

	@Autowired
	@Qualifier("s1") // eligible reference bean id
	private State state;

	public void display() {
		System.out.println("State name is: " + state.getStateName());
	}
}

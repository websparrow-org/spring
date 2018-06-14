package org.websparrow;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class InjectBean {

	@Inject
	@Qualifier("state1") // To resolve the ambiguity
	private State state;

	public void display() {
		System.out.println("State name is: " + state.getStateName());
	}
}
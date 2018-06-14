package org.websparrow;

import javax.annotation.Resource;

public class ResourceBean {

	@Resource
	private State state;

	public void display() {
		System.out.println("State name is: " + state.getStateName());
	}
}

package org.websparrow.beans;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	// Generate setters method
	private String firstName;
	private String lastName;
	private String address;
	private int mobile;

	@Required
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Required
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	// business logic
	public void displayData() {
		System.out.println("Employee details...\n");

		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Address: " + address);
		System.out.println("Mobile: " + mobile);

	}
}

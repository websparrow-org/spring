package org.websparrow.service;

public class InvalidAccountNo extends RuntimeException {

	private static final long serialVersionUID = -161757858137788037L;

	@Override
	public String toString() {
		return "INVALID ACCOUNT NUMBER";
	}
}

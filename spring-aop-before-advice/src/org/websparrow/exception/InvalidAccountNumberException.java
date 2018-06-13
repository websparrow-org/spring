package org.websparrow.exception;

public class InvalidAccountNumberException extends RuntimeException {

	private static final long serialVersionUID = 9087720614302482902L;

	@Override
	public String toString() {

		return "INVALID ACCOUNT NUMBER";
	}
}

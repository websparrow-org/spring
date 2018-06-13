package org.websparrow.service;

import org.springframework.aop.ThrowsAdvice;

public class LoggingService implements ThrowsAdvice {

	public void afterThrowing(Exception ex) {

		System.out.println("............I'M EXECUTED WHEN AN EXCEPTION OCCURS...................");

	}
}

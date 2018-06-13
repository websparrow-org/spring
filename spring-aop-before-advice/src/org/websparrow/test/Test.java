package org.websparrow.test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.websparrow.business.Bank;
import org.websparrow.service.LoggingService;

public class Test {

	public static void main(String[] args) {

		// create target
		Bank b = new Bank();

		// create advice
		LoggingService ls = new LoggingService();

		// add target + advice to proxy
		ProxyFactoryBean proxy = new ProxyFactoryBean();
		proxy.setTarget(b);
		proxy.addAdvice(ls);

		// get generated proxy object
		Bank bproxy = (Bank) proxy.getObject();
		int amount = bproxy.deposit(500, "XYZ123");

		System.out.println(amount);
	}
}

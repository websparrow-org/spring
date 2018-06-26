package org.websparrow.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.business.Bank;

public class Client {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Bank bank = (Bank) context.getBean("proxy");

		bank.deposit(500, "XYZ123");

		// bank.findDetails("XYZ123");

		context.close();
	}
}

package org.websparrow.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.business.Bank;

public class Client {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Bank bank = (Bank) context.getBean("proxy");

		int amt = bank.deposit(600, "XYZ123");
		System.out.println("Balance: " + amt);

		context.close();
	}
}

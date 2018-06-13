package org.websparrow.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.business.Bank;

public class Client {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Bank bank = (Bank) context.getBean("proxy");
		int totalAmount = bank.deposit(500, "ABC321");

		System.out.println("Total Amount: " + totalAmount);

		context.close();
	}
}

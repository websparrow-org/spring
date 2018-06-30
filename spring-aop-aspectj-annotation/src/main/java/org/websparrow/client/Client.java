package org.websparrow.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.websparrow.RegisterAspect;
import org.websparrow.service.Bank;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(RegisterAspect.class);
		ctx.refresh();

		Bank bank = ctx.getBean(Bank.class);
		bank.deposit("YES123");

	}

}

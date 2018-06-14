package org.websparrow.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Boss;

public class Client {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Boss boss = (Boss) context.getBean("boss");
		boss.display();
	}
}
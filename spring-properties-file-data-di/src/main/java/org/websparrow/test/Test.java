package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.ConnectionManager;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		ConnectionManager cm = (ConnectionManager) ap.getBean("connect");
		cm.createConnection();

	}
}

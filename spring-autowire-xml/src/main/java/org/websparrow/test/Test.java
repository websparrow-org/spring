package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.City;
import org.websparrow.beans.Country;

public class Test {
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-no.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-byName.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-byType.xml");
		Country c = (Country) context.getBean("country");
		c.display();

		/*
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-constructor.xml");
		City city = (City) context1.getBean("city");
		city.print();
		*/
	}
}

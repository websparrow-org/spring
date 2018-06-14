package org.websparrow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		// For @Resource
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-res.xml");
		ResourceBean res = (ResourceBean) context.getBean("res");
		res.display();

		// For @Inject
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring-inj.xml");
		InjectBean inj = (InjectBean) context2.getBean("inj");
		inj.display();
	}
}
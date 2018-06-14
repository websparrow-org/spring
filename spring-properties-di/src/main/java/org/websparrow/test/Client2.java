package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.PropDi;
import org.websparrow.beans.PropFileDi;

public class Client2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file-spring.xml");

		PropFileDi profile = (PropFileDi) context.getBean("propfile");

		profile.display();
	}
}

package org.websparrow.test;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.xml.beans.Employee;

public class XmlClient {
	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("spring-xml.xml");

		while (true) {
			System.out.println("Press 1 to SAVE the records and 2 for DESTROY");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1:
				Employee emp = (Employee) cap.getBean("emp");
				emp.save("Atul", "Atul@abc.xyz", "IT", 19626);
				break;

			default:
				cap.close();
				break;
			}
		}
	}
}

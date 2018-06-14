package org.websparrow.beans;

import java.util.Properties;
import java.util.Set;

public class PropFileDi {

	private Properties driver;

	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	// business logic
	public void display() {
		System.out.println("Oracle driver details..........\n");

		Set<Object> keys = driver.keySet();

		for (Object key : keys) {
			System.out.println(key + "=" + driver.getProperty(key.toString()));
		}
	}
}

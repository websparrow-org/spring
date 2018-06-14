package org.websparrow.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	// Generates Setters
	private String driver, url, userName, password;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// business logic that actually uses the inject values
	public void createConnection() {
		Connection conn = null;
		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, password);

			if (conn != null) {
				System.out.println(
						"Properties file data successfully injected to the bean and connection object is created.");
				System.out.println("Connection object is: " + conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

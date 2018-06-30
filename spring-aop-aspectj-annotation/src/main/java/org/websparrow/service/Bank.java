package org.websparrow.service;

import org.springframework.stereotype.Service;

@Service
public class Bank {

	public String deposit(String accountNumber) {

		System.out.println("inside deposit()");

		if (accountNumber.equals("YES123")) {

			System.out.println("You have successfully deposited your amount to the respective account number.");
			return "success";

		} else {
			throw new InvalidAccountNo();
		}
	}
}

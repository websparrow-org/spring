package org.websparrow.business;

import org.websparrow.exception.InvalidAcNoException;

public class Bank {

	private String accountNo = "XYZ123";
	private int amount = 1000;

	public void deposit(int amount, String acNo) {

		if (acNo.equals(this.accountNo)) {

			System.out.println("inside deposit method...");

			this.amount = this.amount + amount;

			System.out.println("Total Balance: " + this.amount);

		} else {
			throw new InvalidAcNoException();
		}
	}

	public void findDetails(String acNo) {

		if (acNo.equals(this.accountNo)) {

			System.out.println("A/C Holder Name: Websparrow.org, DOB: Actober 22, 2016, A/C No: XYZ123, Location: India");

		} else {
			throw new InvalidAcNoException();
		}
	}
}

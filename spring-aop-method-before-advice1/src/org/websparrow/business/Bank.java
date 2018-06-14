package org.websparrow.business;

import org.websparrow.exception.AccountNoExceprtion;

public class Bank {

	private String accountNo = "XYZ123";
	private int amount = 1000;

	public int deposite(int amount, String acNo) {

		if (acNo.equals(this.accountNo)) {

			this.amount = this.amount + amount;

			return this.amount;
		} else {
			throw new AccountNoExceprtion();
		}
	}

}

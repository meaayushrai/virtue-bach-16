package com.virtue.ui;

import com.virtue.excep.InsufficientBalanceException;
import com.virtue.model.Account;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		Account first = new Account(101, "srinivas", 10000);
		System.out.println("Current Balance = " + first.getBalance());
		first.deposit(500);
		System.out.println("Current Balance = " + first.getBalance());
		first.withdraw(12000);
		System.out.println("Current Balance = " + first.getBalance());
		
		try {
			first.withdraw2(12000);
		} catch(InsufficientBalanceException excep) {
			System.out.println(excep.getMessage());
		}
		

	}

}
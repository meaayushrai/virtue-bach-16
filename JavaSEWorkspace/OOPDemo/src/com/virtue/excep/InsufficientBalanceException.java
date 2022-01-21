package com.virtue.excep;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String errMsg) {
		super(errMsg);
	}
}
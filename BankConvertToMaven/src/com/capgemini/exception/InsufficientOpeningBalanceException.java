package com.capgemini.exception;

public class InsufficientOpeningBalanceException extends Exception {

	public InsufficientOpeningBalanceException(String errMsg) {
		super (errMsg);
	}

}

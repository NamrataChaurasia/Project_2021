package com.capgemini.exception;

public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String errMsg) {
		super (errMsg);
	}

}

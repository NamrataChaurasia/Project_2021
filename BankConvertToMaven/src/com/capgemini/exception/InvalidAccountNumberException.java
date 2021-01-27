package com.capgemini.exception;

public class InvalidAccountNumberException extends Exception {

	public InvalidAccountNumberException(String errMsg) {
		super (errMsg);
	}

}

package com.capgemini.service;
import com.capgemini.beans.Account;
import com.capgemini.exception.InvalidAccountNumberException;
import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientOpeningBalanceException;

public interface Bank {
	public String createAccount(Account account) throws InsufficientOpeningBalanceException;
	public String searchAccount(int accountNumber) throws InvalidAccountNumberException;
	public int amountwithWithdraw(int accountNumber,int amount) throws InsufficientBalanceException,InvalidAccountNumberException;
}
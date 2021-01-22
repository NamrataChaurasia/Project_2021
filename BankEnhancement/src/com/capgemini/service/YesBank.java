package com.capgemini.service;
import java.util.*;
import com.capgemini.beans.Account;
import com.capgemini.exception.*;


public class YesBank implements Bank {
	
	LinkedList<Account> accounts=new LinkedList<>();
	
	@Override
	public String createAccount(int accountNumber,int amount) throws InsufficientOpeningAmountException
	{	
		if(amount>500) {
		Account account = new Account(accountNumber,amount);
		
		accounts.add(account);
		return "account created successfully";
		}
		
		else throw new InsufficientOpeningAmountException();
		
		
	}
	
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
		
	}
	
	@Override
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber);
		
		if((account.getAmount()-amount)>=0)
		{
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}
		
		throw new InsufficientBalanceException();
	}

	@Override
	public int depositAmount(int accountNumber,int amount) throws InvalidAccountNumberException {
		Account account=searchAccount(accountNumber);
		
		account.setAmount(account.getAmount()+amount);
		return account.getAmount();
	}

	@Override
	public int[] fundTransfer(int senderaccount,int receiveraccount,int amount) throws InvalidAccountNumberException,InsufficientBalanceException {
		
		Account sender = searchAccount(senderaccount);
		Account receiver = searchAccount(receiveraccount);
		
		if((sender.getAmount()-amount)>=0)
		{
			int[] a = {sender.getAmount()-amount,receiver.getAmount()+amount};
			sender.setAmount(sender.getAmount()-amount);
			receiver.setAmount(receiver.getAmount()+amount);
			
			return a;
		}
		
		else throw new InsufficientBalanceException();
		
	}

}
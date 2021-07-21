package com.example.models;

public class AccountDisplay {
	
	private int userId;
	private int accountId;
	private int balance;
	
	public AccountDisplay() {
		
	}
	
	public AccountDisplay(int userID, int accountId, int balance) {
		super();
		this.userId = userId;
		this.accountId = accountId;
		this.balance = balance;
	}
	
	public int getAccountId() {
		return accountId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	
}

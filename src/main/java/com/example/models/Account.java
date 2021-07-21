package com.example.models;

import java.util.Random;

public class Account {
	
	private int userId;
	private int accountNum;
	private static int balance;

	public Account() {
	} 
	
	public Account (int userId, int accountNum, int balance) {
		this.userId = userId;
		this.accountNum = accountNum + (new Random().nextInt(9000)+1000);
		this.balance  =balance;
		
	}

	public static int deposit(int x) {
		int y = getBalance();
		return x+y;
	}
	
	public static int withdrawal(int z) {
		int w = getBalance();
		return w-z;
	}

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public int getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}



	public static int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	@Override
	public String toString() {
		return "Account [userId=" + userId + ", accountNum=" + accountNum + ", balance=" + balance + "]";
	}
	
	
}



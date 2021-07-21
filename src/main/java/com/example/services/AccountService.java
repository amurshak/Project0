package com.example.services;

import java.sql.SQLException;

import com.example.dao.AccountDao;

import com.example.models.Account;

public class AccountService {
	

	private AccountDao aDao;
	
	public AccountService(AccountDao a) {
		this.aDao = a;
	}
	
	public Account createAccount(int userId, int accountNum, int balance) throws SQLException {
		Account a = new Account();
		
		aDao.createAccount(a);
		
		return a;
	}
	
	//public List<AccountDisplay> getAllAccounts() {
	//	return aDao.getUserAccounts(null);
	//}
	
}

